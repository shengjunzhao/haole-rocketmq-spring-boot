package com.haole.rocketmq.autoconfigure;

/**
 * Created by shengjunzhao on 2019/4/14.
 */
public class ChannelProperties {

    private ProducerProperties producer;
    private PushConsumerProperties consumerProperties;

    public ProducerProperties getProducer() {
        return producer;
    }

    public void setProducer(ProducerProperties producer) {
        this.producer = producer;
    }

    public PushConsumerProperties getConsumerProperties() {
        return consumerProperties;
    }

    public void setConsumerProperties(PushConsumerProperties consumerProperties) {
        this.consumerProperties = consumerProperties;
    }
}
