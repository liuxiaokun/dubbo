package com.fred.lesson.provider.controller;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

@Controller
public class HelloController {

    @Resource
    private JmsTemplate jmsQueueTemplate;

    @Resource
    private JmsTemplate jmsTopicTemplate;

    @RequestMapping("/queue")
    @ResponseBody
    public String queue(final String msg) {


        jmsQueueTemplate.send("test.queue", new MessageCreator() {

            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
        return "Queue: " + msg;
    }

    @RequestMapping("/topic")
    @ResponseBody
    public String topic(final String msg) {


        jmsTopicTemplate.send("test.topic", new MessageCreator() {

            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
        return "Topic: " + msg;
    }

}
