package com.web.guihe.Util.RabbitMq;

import org.springframework.stereotype.Component;

@Component
public class WiselyMessage {

    private String name;

    private String routingKey;

    private Object message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }

    public Object getMessage() { return message; }

    public void setMessage(Object message) {
        this.message = message;
    }

    public void back(String name,String routingKey,Object message){
        setName(name);
        setRoutingKey(routingKey);
        setMessage(message);
    }
}
