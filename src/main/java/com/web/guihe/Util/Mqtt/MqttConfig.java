package com.web.guihe.Util.Mqtt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.mqtt")
@Getter
@Setter
public class MqttConfig {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 连接地址
     */
    private String url;
    /**
     * 客户Id
     */
    private String clientID;
    /**
     * 默认连接话题
     */
    private String defaultTopic;
    /**
     * 超时时间
     */
    private int timeout;
    /**
     * 保持连接数
     */
    private int keepalive;

    @Autowired
    private MqttPushClient mqttPushClient;

    @Bean
    public MqttPushClient getMqttPushClient() {
        System.out.println("url: "+ url);
        System.out.println("clientID: "+ clientID);
        System.out.println("username: "+ username);
        System.out.println("password: "+ password);
        System.out.println("timeout: "+timeout);
        System.out.println("keepalive: "+ keepalive);
        mqttPushClient.connect(url, clientID, username, password, timeout, keepalive);
        return mqttPushClient;
    }
}
