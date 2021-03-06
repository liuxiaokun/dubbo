package com.fred.lesson.consumer.consumer.queue.listener;

import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by fred on 6/7/17.
 */
@Service
public class QueueListenerReceiver2 implements MessageListener {

    @Override
    public void onMessage(Message message) {

        TextMessage tm = (TextMessage) message;

        try {
            System.out.println("lesson_consumer QueueMessageListener2 监听到了文本消息：\t"
                    + tm.getText());
            //do something ...
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
