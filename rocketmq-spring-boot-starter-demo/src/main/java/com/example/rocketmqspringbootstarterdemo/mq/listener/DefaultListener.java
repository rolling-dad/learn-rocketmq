package com.example.rocketmqspringbootstarterdemo.mq.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.annotation.RocketMQTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionState;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;

/**
 * @author lin
 * @date 2022/1/24
 */
@Service
@Slf4j
@RocketMQMessageListener(consumerGroup = "default-consumer-group", topic = "demo-topic")
public class DefaultListener implements RocketMQListener<String> {
    @Override
    public void onMessage(String msg) {
        log.info("接收到消息：" + msg);
    }
}
