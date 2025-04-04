package com.ust.RabbitM.Q.producer;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendOrder(String order) {
        amqpTemplate.convertAndSend("orderQueue", order);
        System.out.println("Order Sent: " + order);
    }
}
