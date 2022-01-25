package com.example.rocketmqspringbootstarterdemo;

import com.example.rocketmqspringbootstarterdemo.mq.producer.DelayProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RocketmqSpringBootStarterDemoApplicationTests {

    @Autowired
    private DelayProducer delayProducer;

    @Test
    void contextLoads() {
        delayProducer.sendDelayMessage();
    }

}
