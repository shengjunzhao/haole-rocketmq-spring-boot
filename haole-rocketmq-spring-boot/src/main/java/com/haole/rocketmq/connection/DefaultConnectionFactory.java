package com.haole.rocketmq.connection;

import com.haole.rocketmq.autoconfigure.ChannelProperties;
import com.haole.rocketmq.autoconfigure.RocketProperties;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by shengjunzhao on 2019/4/14.
 */
public class DefaultConnectionFactory implements ConnectionFactory, InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware {

    private ApplicationContext applicationContext;

    private RocketProperties rocketProperties;

    private ConcurrentHashMap<String, DefaultMQProducer> producerMap = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, DefaultMQPushConsumer> consumerMap = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, TransactionMQProducer> transactionProducerMap = new ConcurrentHashMap<>();


    public DefaultConnectionFactory(RocketProperties rocketProperties) {
        this.rocketProperties = rocketProperties;
    }

    @Override
    public void setBeanName(String s) {

    }

    @Override
    public void destroy() throws Exception {
        for (ConcurrentHashMap.Entry<String, DefaultMQProducer> entry : producerMap.entrySet()) {
            if (!ObjectUtils.isEmpty(entry.getValue())) {
                entry.getValue().shutdown();
            }
        }
        producerMap.clear();
        for (ConcurrentHashMap.Entry<String, DefaultMQPushConsumer> entry : consumerMap.entrySet()) {
            if (!ObjectUtils.isEmpty(entry.getValue())) {
                entry.getValue().shutdown();
            }
        }
        consumerMap.clear();
        for (ConcurrentHashMap.Entry<String, TransactionMQProducer> entry : transactionProducerMap.entrySet()) {
            if (!ObjectUtils.isEmpty(entry.getValue())) {
                entry.getValue().shutdown();
            }
        }
        transactionProducerMap.clear();
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public DefaultMQProducer getDefaultMQProducer(String channel) {
        synchronized(this.producerMap) {
            DefaultMQProducer producer = producerMap.get(channel);
            if (null != producer) {
                return producer;
            }
            ChannelProperties channelProperties = rocketProperties.getChannels().get(channel);
            Assert.notNull(channelProperties, channel + " channel must not be null.");
            producer = new DefaultMQProducer(channel);
            producerMap.put(channel, producer);
            return producer;
        }
    }

    @Override
    public DefaultMQPushConsumer getDefaultMQPushConsumer(String channel) {
        return null;
    }


}
