package com.web.guihe.Util.RabbitMq;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.config.RetryInterceptorBuilder;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.Connection;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionListener;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.retry.RepublishMessageRecoverer;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.interceptor.RetryOperationsInterceptor;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Configuration
public class RabbitmqConfig {

    private static final Logger logger = LoggerFactory.getLogger(RabbitmqConfig.class);

    @Bean
    public ConnectionFactory connectionFactory(){
        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory();
        cachingConnectionFactory.setHost("127.0.0.1");
        /*channel缓存的大小*/
        cachingConnectionFactory.setChannelCacheSize(200);
        cachingConnectionFactory.setCacheMode(CachingConnectionFactory.CacheMode.CHANNEL);
        cachingConnectionFactory.setUsername("admin");
        cachingConnectionFactory.setPassword("621041`h");
        cachingConnectionFactory.addConnectionListener(new ConnectionListener() {
            @Override
            public void onCreate(Connection connection) {
                logger.info("创建rabbitmq连接");
            }
            @Override
            public void onClose(Connection connection) {
                logger.info("关闭rabbitmq连接");
            }
        });
        //设置虚拟主机，默认/
        cachingConnectionFactory.setVirtualHost("guihe");
        cachingConnectionFactory.setPublisherConfirmType(CachingConnectionFactory.ConfirmType.SIMPLE);
        cachingConnectionFactory.setPublisherReturns(true);
        return cachingConnectionFactory;
    }

    /**
     * 配置MQ传输序列化对象
     *
     * @return Jackson2JsonMessageConverter
     */
    @Bean
    public Jackson2JsonMessageConverter jackson2JsonMessageConverter(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JodaModule());
        objectMapper.enable(MapperFeature.USE_GETTERS_AS_SETTERS);
        objectMapper.enable(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        objectMapper.enable(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return new Jackson2JsonMessageConverter(objectMapper);
    }

    /**
     * 配置模版对象
     *
     * @return RabbitTemplate
     */
    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
        rabbitTemplate.setMessageConverter(jackson2JsonMessageConverter());
        return rabbitTemplate;
    }

    /**
     * 配置管理器
     *
     * @return RabbitAdmin
     */
    @Bean
    public RabbitAdmin rabbitAdmin(){
        RabbitAdmin rabbitAdmin = new RabbitAdmin(connectionFactory());
        rabbitAdmin.setIgnoreDeclarationExceptions(true);
        return rabbitAdmin;
    }

    /**
     * RepublishMessageRecoverer允许在重试次数耗尽后，发布失败消息
     *
     * @return RetryOperationsInterceptor
     */
    @Bean
    public RetryOperationsInterceptor retryOperationsInterceptor(){
        return RetryInterceptorBuilder.stateless()
                .maxAttempts(5)
                .recoverer(new RepublishMessageRecoverer(rabbitTemplate()))
                .build();
    }

    /**
     * 配置spring上下文监听容器 需要延迟启动
     *
     * @return SimpleMessageListenerContainer
     */
    public SimpleMessageListenerContainer simpleMessageListenerContainer(MessageListener messageListener,String[] queues){
        SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer(connectionFactory());
        simpleMessageListenerContainer.setAutoDeclare(false);
        //声明失败重复次数
        simpleMessageListenerContainer.setDeclarationRetries(1);
        //可接受来自broker一个socket帧中的消息数目. 数值越大，消息分发速度就越快, 但无序处理的风险更高
        simpleMessageListenerContainer.setPrefetchCount(10);
        simpleMessageListenerContainer.addQueueNames(queues);
        simpleMessageListenerContainer.setAcknowledgeMode(AcknowledgeMode.NONE);
        simpleMessageListenerContainer.setExposeListenerChannel(true);
        simpleMessageListenerContainer.setMaxConcurrentConsumers(100);
        simpleMessageListenerContainer.setConcurrentConsumers(10);
        simpleMessageListenerContainer.setMessageListener(messageListener);
        simpleMessageListenerContainer.setAutoStartup(false);
        simpleMessageListenerContainer.setExclusive(false);
        /*丢弃所有失败的消息 false丢弃 true 循环处理 或者，
         你可以抛出一个AmqpRejectAndDontRequeueException;这会阻止消息重新入列,不管defaultRequeueRejected 属性设置的是什么.*/
        simpleMessageListenerContainer.setDefaultRequeueRejected(false);
        simpleMessageListenerContainer.start();
        return simpleMessageListenerContainer;
    }

    /**
     * 声明交互器
     *
     * @return
     */
    @Bean
    DirectExchange directExchange(){
        return new DirectExchange("exchange_GUIHEMSG");
    }

    /**
     * 创建一个ReceivePushMsgListener，监听routingKey为“rk_GUIHEMSG”的队列实现客户端收到消息后向此队列发送确认收到消息
     */
    @Bean
    public Object declareDirectQueue(){
        List<String> receiveQueueNames = new ArrayList<>();
        String receive = "queue_GUIHEMSG";
        declare(receive,directExchange(),"rk_GUIHEMSG");
        receiveQueueNames.add(receive);
        return null;
    }

    private void declare(String queueName,DirectExchange directExchange,String routingKey){
        RabbitAdmin rabbitAdmin = rabbitAdmin();
        Queue queue = new Queue(queueName,true,false,false);
        rabbitAdmin.declareQueue(queue);
        rabbitAdmin.declareBinding(BindingBuilder.bind(queue).to(directExchange).with(routingKey));
    }
}
