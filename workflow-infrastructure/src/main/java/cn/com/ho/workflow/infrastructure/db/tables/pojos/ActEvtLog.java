/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActEvtLog implements Serializable {

    private static final long serialVersionUID = -354873643;

    private Integer       logNr_;
    private String        type_;
    private String        procDefId_;
    private String        procInstId_;
    private String        executionId_;
    private String        taskId_;
    private LocalDateTime timeStamp_;
    private String        userId_;
    private byte[]        data_;
    private String        lockOwner_;
    private LocalDateTime lockTime_;
    private Short         isProcessed_;

    public ActEvtLog() {}

    public ActEvtLog(ActEvtLog value) {
        this.logNr_ = value.logNr_;
        this.type_ = value.type_;
        this.procDefId_ = value.procDefId_;
        this.procInstId_ = value.procInstId_;
        this.executionId_ = value.executionId_;
        this.taskId_ = value.taskId_;
        this.timeStamp_ = value.timeStamp_;
        this.userId_ = value.userId_;
        this.data_ = value.data_;
        this.lockOwner_ = value.lockOwner_;
        this.lockTime_ = value.lockTime_;
        this.isProcessed_ = value.isProcessed_;
    }

    public ActEvtLog(
        Integer       logNr_,
        String        type_,
        String        procDefId_,
        String        procInstId_,
        String        executionId_,
        String        taskId_,
        LocalDateTime timeStamp_,
        String        userId_,
        byte[]        data_,
        String        lockOwner_,
        LocalDateTime lockTime_,
        Short         isProcessed_
    ) {
        this.logNr_ = logNr_;
        this.type_ = type_;
        this.procDefId_ = procDefId_;
        this.procInstId_ = procInstId_;
        this.executionId_ = executionId_;
        this.taskId_ = taskId_;
        this.timeStamp_ = timeStamp_;
        this.userId_ = userId_;
        this.data_ = data_;
        this.lockOwner_ = lockOwner_;
        this.lockTime_ = lockTime_;
        this.isProcessed_ = isProcessed_;
    }

    public Integer getLogNr_() {
        return this.logNr_;
    }

    public void setLogNr_(Integer logNr_) {
        this.logNr_ = logNr_;
    }

    public String getType_() {
        return this.type_;
    }

    public void setType_(String type_) {
        this.type_ = type_;
    }

    public String getProcDefId_() {
        return this.procDefId_;
    }

    public void setProcDefId_(String procDefId_) {
        this.procDefId_ = procDefId_;
    }

    public String getProcInstId_() {
        return this.procInstId_;
    }

    public void setProcInstId_(String procInstId_) {
        this.procInstId_ = procInstId_;
    }

    public String getExecutionId_() {
        return this.executionId_;
    }

    public void setExecutionId_(String executionId_) {
        this.executionId_ = executionId_;
    }

    public String getTaskId_() {
        return this.taskId_;
    }

    public void setTaskId_(String taskId_) {
        this.taskId_ = taskId_;
    }

    public LocalDateTime getTimeStamp_() {
        return this.timeStamp_;
    }

    public void setTimeStamp_(LocalDateTime timeStamp_) {
        this.timeStamp_ = timeStamp_;
    }

    public String getUserId_() {
        return this.userId_;
    }

    public void setUserId_(String userId_) {
        this.userId_ = userId_;
    }

    public byte[] getData_() {
        return this.data_;
    }

    public void setData_(byte... data_) {
        this.data_ = data_;
    }

    public String getLockOwner_() {
        return this.lockOwner_;
    }

    public void setLockOwner_(String lockOwner_) {
        this.lockOwner_ = lockOwner_;
    }

    public LocalDateTime getLockTime_() {
        return this.lockTime_;
    }

    public void setLockTime_(LocalDateTime lockTime_) {
        this.lockTime_ = lockTime_;
    }

    public Short getIsProcessed_() {
        return this.isProcessed_;
    }

    public void setIsProcessed_(Short isProcessed_) {
        this.isProcessed_ = isProcessed_;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ActEvtLog (");

        sb.append(logNr_);
        sb.append(", ").append(type_);
        sb.append(", ").append(procDefId_);
        sb.append(", ").append(procInstId_);
        sb.append(", ").append(executionId_);
        sb.append(", ").append(taskId_);
        sb.append(", ").append(timeStamp_);
        sb.append(", ").append(userId_);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(lockOwner_);
        sb.append(", ").append(lockTime_);
        sb.append(", ").append(isProcessed_);

        sb.append(")");
        return sb.toString();
    }
}
