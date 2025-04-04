package com.ust.RabbitM.Q.application;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ust.RabbitM.Q.producer.OrderProducer;

@SpringBootApplication
public class SpringRabbitmqExampleApplication implements CommandLineRunner {

    @Autowired
    private OrderProducer orderProducer;

    public static void main(String[] args) {
        SpringApplication.run(SpringRabbitmqExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Simulate order creation and sending to queue
        orderProducer.sendOrder("Order 1: Pizza");
        orderProducer.sendOrder("Order 2: Burger");
    }
}
