package com.haole.rocketmq.autoconfigure;

/**
 * ClassName: ProducerProperties
 * Description:
 *
 * @author: shengjunzhao
 * @date: 2019/4/9 16:27
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class ProducerProperties {

    private String producerGroup;

    /**
     * Just for testing or demo program
     */
    private String createTopicKey;

    /**
     * Number of queues to create per default topic.
     * default 4
     */
    private Integer defaultTopicQueueNums;

    /**
     * Timeout for sending messages.
     * default 3000
     */
    private Integer sendMsgTimeout;

    /**
     * Compress message body threshold, namely, message body larger than 4k will be compressed on default.
     * default 1024 * 4
     */
    private Integer compressMsgBodyOverHowmuch;

    /**
     * Maximum number of retry to perform internally before claiming sending failure in synchronous mode.
     * </p>
     * <p>
     * This may potentially cause message duplication which is up to application developers to resolve.
     * default 2
     */
    private Integer retryTimesWhenSendFailed;

    /**
     * Maximum number of retry to perform internally before claiming sending failure in asynchronous mode.
     * </p>
     * <p>
     * This may potentially cause message duplication which is up to application developers to resolve.
     * default 2
     */
    private Integer retryTimesWhenSendAsyncFailed;

    /**
     * Indicate whether to retry another broker on sending failure internally.
     * default false
     */
    private Boolean retryAnotherBrokerWhenNotStoreOK;

    /**
     * Maximum allowed message size in bytes.
     * default 1024 * 1024 * 4; // 4M
     */
    private Integer maxMessageSize;

    /**
     * default 1
     */
    private Integer checkThreadPoolMinSize;
    /**
     * default 1
     */
    private Integer checkThreadPoolMaxSize;
    /**
     * default 2000
     */
    private Integer checkRequestHoldMax;

    public String getProducerGroup() {
        return producerGroup;
    }

    public void setProducerGroup(String producerGroup) {
        this.producerGroup = producerGroup;
    }

    public String getCreateTopicKey() {
        return createTopicKey;
    }

    public void setCreateTopicKey(String createTopicKey) {
        this.createTopicKey = createTopicKey;
    }

    public Integer getDefaultTopicQueueNums() {
        return defaultTopicQueueNums;
    }

    public void setDefaultTopicQueueNums(Integer defaultTopicQueueNums) {
        this.defaultTopicQueueNums = defaultTopicQueueNums;
    }

    public Integer getSendMsgTimeout() {
        return sendMsgTimeout;
    }

    public void setSendMsgTimeout(Integer sendMsgTimeout) {
        this.sendMsgTimeout = sendMsgTimeout;
    }

    public Integer getCompressMsgBodyOverHowmuch() {
        return compressMsgBodyOverHowmuch;
    }

    public void setCompressMsgBodyOverHowmuch(Integer compressMsgBodyOverHowmuch) {
        this.compressMsgBodyOverHowmuch = compressMsgBodyOverHowmuch;
    }

    public Integer getRetryTimesWhenSendFailed() {
        return retryTimesWhenSendFailed;
    }

    public void setRetryTimesWhenSendFailed(Integer retryTimesWhenSendFailed) {
        this.retryTimesWhenSendFailed = retryTimesWhenSendFailed;
    }

    public Integer getRetryTimesWhenSendAsyncFailed() {
        return retryTimesWhenSendAsyncFailed;
    }

    public void setRetryTimesWhenSendAsyncFailed(Integer retryTimesWhenSendAsyncFailed) {
        this.retryTimesWhenSendAsyncFailed = retryTimesWhenSendAsyncFailed;
    }

    public Boolean getRetryAnotherBrokerWhenNotStoreOK() {
        return retryAnotherBrokerWhenNotStoreOK;
    }

    public void setRetryAnotherBrokerWhenNotStoreOK(Boolean retryAnotherBrokerWhenNotStoreOK) {
        this.retryAnotherBrokerWhenNotStoreOK = retryAnotherBrokerWhenNotStoreOK;
    }

    public Integer getMaxMessageSize() {
        return maxMessageSize;
    }

    public void setMaxMessageSize(Integer maxMessageSize) {
        this.maxMessageSize = maxMessageSize;
    }

    public Integer getCheckThreadPoolMinSize() {
        return checkThreadPoolMinSize;
    }

    public void setCheckThreadPoolMinSize(Integer checkThreadPoolMinSize) {
        this.checkThreadPoolMinSize = checkThreadPoolMinSize;
    }

    public Integer getCheckThreadPoolMaxSize() {
        return checkThreadPoolMaxSize;
    }

    public void setCheckThreadPoolMaxSize(Integer checkThreadPoolMaxSize) {
        this.checkThreadPoolMaxSize = checkThreadPoolMaxSize;
    }

    public Integer getCheckRequestHoldMax() {
        return checkRequestHoldMax;
    }

    public void setCheckRequestHoldMax(Integer checkRequestHoldMax) {
        this.checkRequestHoldMax = checkRequestHoldMax;
    }
}
