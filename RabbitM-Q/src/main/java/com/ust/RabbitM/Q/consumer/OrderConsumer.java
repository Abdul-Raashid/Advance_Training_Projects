package com.ust.RabbitM.Q.consumer;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    @RabbitListener(queues = "orderQueue")
    public void receiveOrder(String order) {
        System.out.println("Order Received: " + order);
        // Logic to process the order
    }
}

