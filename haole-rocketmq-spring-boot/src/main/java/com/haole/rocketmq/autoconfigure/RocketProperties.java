package com.haole.rocketmq.autoconfigure;

import org.apache.rocketmq.remoting.protocol.LanguageCode;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ClassName: RocketProperties
 * Description:
 *
 * @author: shengjunzhao
 * @date: 2019/4/8 17:37
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@ConfigurationProperties(prefix = "spring.rocketmq")
public class RocketProperties {

    private String namesrvAddr;
    private String clientIP;
    private String instanceName;
    private int clientCallbackExecutorThreads;
    /**
     * Pulling topic information interval from the named server
     * default 1000 * 30
     */
    private Integer pollNameServerInterval;
    /**
     * Heartbeat interval in microseconds with message broker
     * default 1000 * 30
     */
    private Integer heartbeatBrokerInterval;
    /**
     * Offset persistent interval for consumer
     * default 1000 * 5
     */
    private Integer persistConsumerOffsetInterval;
    /**
     * default false
     */
    private Boolean unitMode;
    private String unitName;
    /**
     * default false
     */
    private Boolean vipChannelEnabled;
    /**
     * default
     */
    private Boolean useTLS;
    /**
     * default 0-java
     */
    private LanguageCode language;



}
