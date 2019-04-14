package com.haole.rocketmq.autoconfigure;

import com.haole.rocketmq.connection.ConnectionFactory;
import com.haole.rocketmq.connection.DefaultConnectionFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shengjunzhao on 2019/4/14.
 */
@Configuration
@EnableConfigurationProperties(RocketProperties.class)
public class RocketAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean(ConnectionFactory.class)
    public ConnectionFactory connectionFactory(RocketProperties rocketProperties) {
        DefaultConnectionFactory connectionFactory = new DefaultConnectionFactory(rocketProperties);
        return connectionFactory;
    }


}
