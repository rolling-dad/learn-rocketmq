package com.example.rocketmq;

import org.apache.rocketmq.client.producer.SendResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private MqProducer mqProducer;

    @RequestMapping("/create")
    public SendResult createOrder(){
        return mqProducer.send();
    }
}
