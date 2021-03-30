package com.web.guihe.Util.RabbitMq;

import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.ReturnedMessage;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@Component
public class PushMsgProducer implements RabbitTemplate.ConfirmCallback,RabbitTemplate.ReturnsCallback {

    private static final Logger logger = LoggerFactory.getLogger(PushMsgProducer.class);

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostConstruct
    public void init(){
        rabbitTemplate.setConfirmCallback(this);
        rabbitTemplate.setReturnsCallback(this);
    }

    //消息发送确认回调方法
    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        logger.info("消息发送成功:" + correlationData);
    }

    //消息发送失败回调方法
    @Override
    public void returnedMessage(ReturnedMessage returnedMessage) {
        logger.error("消息发送失败:" + returnedMessage);
    }

    /**
     * 发送消息
     *
     * @param wiselyMessage
     */
    public void send(WiselyMessage wiselyMessage) throws IOException{
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        rabbitTemplate.convertAndSend("exchange_GUIHEMSG",wiselyMessage.getRoutingKey(),wiselyMessage,correlationData);
    }
}
