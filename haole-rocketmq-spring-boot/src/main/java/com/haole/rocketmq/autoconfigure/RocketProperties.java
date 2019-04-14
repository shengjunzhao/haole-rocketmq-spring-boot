package com.haole.rocketmq.autoconfigure;

import org.apache.rocketmq.remoting.protocol.LanguageCode;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

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

    private Map<String, ChannelProperties> channels = new HashMap<>();

    public String getNamesrvAddr() {
        return namesrvAddr;
    }

    public void setNamesrvAddr(String namesrvAddr) {
        this.namesrvAddr = namesrvAddr;
    }

    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public int getClientCallbackExecutorThreads() {
        return clientCallbackExecutorThreads;
    }

    public void setClientCallbackExecutorThreads(int clientCallbackExecutorThreads) {
        this.clientCallbackExecutorThreads = clientCallbackExecutorThreads;
    }

    public Integer getPollNameServerInterval() {
        return pollNameServerInterval;
    }

    public void setPollNameServerInterval(Integer pollNameServerInterval) {
        this.pollNameServerInterval = pollNameServerInterval;
    }

    public Integer getHeartbeatBrokerInterval() {
        return heartbeatBrokerInterval;
    }

    public void setHeartbeatBrokerInterval(Integer heartbeatBrokerInterval) {
        this.heartbeatBrokerInterval = heartbeatBrokerInterval;
    }

    public Integer getPersistConsumerOffsetInterval() {
        return persistConsumerOffsetInterval;
    }

    public void setPersistConsumerOffsetInterval(Integer persistConsumerOffsetInterval) {
        this.persistConsumerOffsetInterval = persistConsumerOffsetInterval;
    }

    public Boolean getUnitMode() {
        return unitMode;
    }

    public void setUnitMode(Boolean unitMode) {
        this.unitMode = unitMode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Boolean getVipChannelEnabled() {
        return vipChannelEnabled;
    }

    public void setVipChannelEnabled(Boolean vipChannelEnabled) {
        this.vipChannelEnabled = vipChannelEnabled;
    }

    public Boolean getUseTLS() {
        return useTLS;
    }

    public void setUseTLS(Boolean useTLS) {
        this.useTLS = useTLS;
    }

    public LanguageCode getLanguage() {
        return language;
    }

    public void setLanguage(LanguageCode language) {
        this.language = language;
    }

    public Map<String, ChannelProperties> getChannels() {
        return channels;
    }

    public void setChannels(Map<String, ChannelProperties> channels) {
        this.channels = channels;
    }
}
