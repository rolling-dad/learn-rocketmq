package com.example.streamrocketmqdemo;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

@SpringBootApplication
//@EnableBinding({ Source.class, Sink.class })
public class StreamRocketmqDemoApplication implements CommandLineRunner {

//    @Autowired
//    private MessageChannel output;

    public static void main(String[] args) {
        SpringApplication.run(StreamRocketmqDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("producer_group");
        producer.setNamesrvAddr("1.15.239.247:9876");
        producer.start();
        Message msg = new Message("test-topic", "tagStr", "message from rocketmq producer".getBytes());
        producer.send(msg);
    }
}
