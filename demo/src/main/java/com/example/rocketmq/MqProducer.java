package com.example.rocketmq;

import org.apache.rocketmq.client.producer.SendResult;

public interface MqProducer {

    SendResult send();
}
