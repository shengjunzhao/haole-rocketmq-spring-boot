package com.haole.rocketmq.connection;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.producer.DefaultMQProducer;

/**
 * Created by shengjunzhao on 2019/4/14.
 */
public interface ConnectionFactory {

    DefaultMQProducer getDefaultMQProducer(String channel);
    DefaultMQPushConsumer getDefaultMQPushConsumer(String channel);
}
