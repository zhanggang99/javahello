package com.kaka.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
public class QueueController {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;
    //消息生产者
    @RequestMapping("/send")
    public void send(){
        this.jmsMessagingTemplate.convertAndSend(this.queue,"新发送的消息");
    }
}
