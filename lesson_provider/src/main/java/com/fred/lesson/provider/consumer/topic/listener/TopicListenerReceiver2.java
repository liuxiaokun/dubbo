package com.fred.lesson.provider.consumer.topic.listener;

import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by fred on 6/7/17.
 */
@Service
public class TopicListenerReceiver2 implements MessageListener {

    @Override
    public void onMessage(Message message) {

        TextMessage tm = (TextMessage) message;

        try {
            System.out.println("lesson_provider TopicListenerReceiver2 监听到了文本消息：\t"
                    + tm.getText());
            //do something ...
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
