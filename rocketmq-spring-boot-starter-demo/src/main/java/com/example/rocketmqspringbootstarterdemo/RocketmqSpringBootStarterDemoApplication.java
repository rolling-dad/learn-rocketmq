package com.example.rocketmqspringbootstarterdemo;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RocketmqSpringBootStarterDemoApplication implements CommandLineRunner {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RocketmqSpringBootStarterDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        rocketMQTemplate.convertAndSend("demo-topic","hello2");
    }
}
