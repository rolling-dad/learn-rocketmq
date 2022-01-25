package com.example.rocketmqspringbootstarterdemo.mq.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * 延时消息
 * @author lin
 * @date 2022/1/25
 */
@Slf4j
@Component
public class DelayProducer {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public void sendDelayMessage(){
        int delaylevel = 3;
        SendResult hello = rocketMQTemplate.syncSend(
                "demo-topic", MessageBuilder.withPayload("hello").build(),
                1000L, delaylevel);
    }
}
