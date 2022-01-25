package com.example.rocketmq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DelayProducer implements MqProducer{

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Override
    public SendResult send() {
        int delayLevel = 5;
        return rocketMQTemplate.syncSend("order-topic", MessageBuilder.withPayload("userId:1:itemId:2").build(),1000L,delayLevel);
    }
}
