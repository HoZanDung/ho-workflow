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
public class ActRuExecution implements Serializable {

    private static final long serialVersionUID = 1378092444;

    private String        id_;
    private Integer       rev_;
    private String        procInstId_;
    private String        businessKey_;
    private String        parentId_;
    private String        procDefId_;
    private String        superExec_;
    private String        rootProcInstId_;
    private String        actId_;
    private Boolean       isActive_;
    private Boolean       isConcurrent_;
    private Boolean       isScope_;
    private Boolean       isEventScope_;
    private Boolean       isMiRoot_;
    private Integer       suspensionState_;
    private Integer       cachedEntState_;
    private String        tenantId_;
    private String        name_;
    private LocalDateTime startTime_;
    private String        startUserId_;
    private LocalDateTime lockTime_;
    private Boolean       isCountEnabled_;
    private Integer       evtSubscrCount_;
    private Integer       taskCount_;
    private Integer       jobCount_;
    private Integer       timerJobCount_;
    private Integer       suspJobCount_;
    private Integer       deadletterJobCount_;
    private Integer       varCount_;
    private Integer       idLinkCount_;
    private Integer       appVersion_;

    public ActRuExecution() {}

    public ActRuExecution(ActRuExecution value) {
        this.id_ = value.id_;
        this.rev_ = value.rev_;
        this.procInstId_ = value.procInstId_;
        this.businessKey_ = value.businessKey_;
        this.parentId_ = value.parentId_;
        this.procDefId_ = value.procDefId_;
        this.superExec_ = value.superExec_;
        this.rootProcInstId_ = value.rootProcInstId_;
        this.actId_ = value.actId_;
        this.isActive_ = value.isActive_;
        this.isConcurrent_ = value.isConcurrent_;
        this.isScope_ = value.isScope_;
        this.isEventScope_ = value.isEventScope_;
        this.isMiRoot_ = value.isMiRoot_;
        this.suspensionState_ = value.suspensionState_;
        this.cachedEntState_ = value.cachedEntState_;
        this.tenantId_ = value.tenantId_;
        this.name_ = value.name_;
        this.startTime_ = value.startTime_;
        this.startUserId_ = value.startUserId_;
        this.lockTime_ = value.lockTime_;
        this.isCountEnabled_ = value.isCountEnabled_;
        this.evtSubscrCount_ = value.evtSubscrCount_;
        this.taskCount_ = value.taskCount_;
        this.jobCount_ = value.jobCount_;
        this.timerJobCount_ = value.timerJobCount_;
        this.suspJobCount_ = value.suspJobCount_;
        this.deadletterJobCount_ = value.deadletterJobCount_;
        this.varCount_ = value.varCount_;
        this.idLinkCount_ = value.idLinkCount_;
        this.appVersion_ = value.appVersion_;
    }

    public ActRuExecution(
        String        id_,
        Integer       rev_,
        String        procInstId_,
        String        businessKey_,
        String        parentId_,
        String        procDefId_,
        String        superExec_,
        String        rootProcInstId_,
        String        actId_,
        Boolean       isActive_,
        Boolean       isConcurrent_,
        Boolean       isScope_,
        Boolean       isEventScope_,
        Boolean       isMiRoot_,
        Integer       suspensionState_,
        Integer       cachedEntState_,
        String        tenantId_,
        String        name_,
        LocalDateTime startTime_,
        String        startUserId_,
        LocalDateTime lockTime_,
        Boolean       isCountEnabled_,
        Integer       evtSubscrCount_,
        Integer       taskCount_,
        Integer       jobCount_,
        Integer       timerJobCount_,
        Integer       suspJobCount_,
        Integer       deadletterJobCount_,
        Integer       varCount_,
        Integer       idLinkCount_,
        Integer       appVersion_
    ) {
        this.id_ = id_;
        this.rev_ = rev_;
        this.procInstId_ = procInstId_;
        this.businessKey_ = businessKey_;
        this.parentId_ = parentId_;
        this.procDefId_ = procDefId_;
        this.superExec_ = superExec_;
        this.rootProcInstId_ = rootProcInstId_;
        this.actId_ = actId_;
        this.isActive_ = isActive_;
        this.isConcurrent_ = isConcurrent_;
        this.isScope_ = isScope_;
        this.isEventScope_ = isEventScope_;
        this.isMiRoot_ = isMiRoot_;
        this.suspensionState_ = suspensionState_;
        this.cachedEntState_ = cachedEntState_;
        this.tenantId_ = tenantId_;
        this.name_ = name_;
        this.startTime_ = startTime_;
        this.startUserId_ = startUserId_;
        this.lockTime_ = lockTime_;
        this.isCountEnabled_ = isCountEnabled_;
        this.evtSubscrCount_ = evtSubscrCount_;
        this.taskCount_ = taskCount_;
        this.jobCount_ = jobCount_;
        this.timerJobCount_ = timerJobCount_;
        this.suspJobCount_ = suspJobCount_;
        this.deadletterJobCount_ = deadletterJobCount_;
        this.varCount_ = varCount_;
        this.idLinkCount_ = idLinkCount_;
        this.appVersion_ = appVersion_;
    }

    public String getId_() {
        return this.id_;
    }

    public void setId_(String id_) {
        this.id_ = id_;
    }

    public Integer getRev_() {
        return this.rev_;
    }

    public void setRev_(Integer rev_) {
        this.rev_ = rev_;
    }

    public String getProcInstId_() {
        return this.procInstId_;
    }

    public void setProcInstId_(String procInstId_) {
        this.procInstId_ = procInstId_;
    }

    public String getBusinessKey_() {
        return this.businessKey_;
    }

    public void setBusinessKey_(String businessKey_) {
        this.businessKey_ = businessKey_;
    }

    public String getParentId_() {
        return this.parentId_;
    }

    public void setParentId_(String parentId_) {
        this.parentId_ = parentId_;
    }

    public String getProcDefId_() {
        return this.procDefId_;
    }

    public void setProcDefId_(String procDefId_) {
        this.procDefId_ = procDefId_;
    }

    public String getSuperExec_() {
        return this.superExec_;
    }

    public void setSuperExec_(String superExec_) {
        this.superExec_ = superExec_;
    }

    public String getRootProcInstId_() {
        return this.rootProcInstId_;
    }

    public void setRootProcInstId_(String rootProcInstId_) {
        this.rootProcInstId_ = rootProcInstId_;
    }

    public String getActId_() {
        return this.actId_;
    }

    public void setActId_(String actId_) {
        this.actId_ = actId_;
    }

    public Boolean getIsActive_() {
        return this.isActive_;
    }

    public void setIsActive_(Boolean isActive_) {
        this.isActive_ = isActive_;
    }

    public Boolean getIsConcurrent_() {
        return this.isConcurrent_;
    }

    public void setIsConcurrent_(Boolean isConcurrent_) {
        this.isConcurrent_ = isConcurrent_;
    }

    public Boolean getIsScope_() {
        return this.isScope_;
    }

    public void setIsScope_(Boolean isScope_) {
        this.isScope_ = isScope_;
    }

    public Boolean getIsEventScope_() {
        return this.isEventScope_;
    }

    public void setIsEventScope_(Boolean isEventScope_) {
        this.isEventScope_ = isEventScope_;
    }

    public Boolean getIsMiRoot_() {
        return this.isMiRoot_;
    }

    public void setIsMiRoot_(Boolean isMiRoot_) {
        this.isMiRoot_ = isMiRoot_;
    }

    public Integer getSuspensionState_() {
        return this.suspensionState_;
    }

    public void setSuspensionState_(Integer suspensionState_) {
        this.suspensionState_ = suspensionState_;
    }

    public Integer getCachedEntState_() {
        return this.cachedEntState_;
    }

    public void setCachedEntState_(Integer cachedEntState_) {
        this.cachedEntState_ = cachedEntState_;
    }

    public String getTenantId_() {
        return this.tenantId_;
    }

    public void setTenantId_(String tenantId_) {
        this.tenantId_ = tenantId_;
    }

    public String getName_() {
        return this.name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public LocalDateTime getStartTime_() {
        return this.startTime_;
    }

    public void setStartTime_(LocalDateTime startTime_) {
        this.startTime_ = startTime_;
    }

    public String getStartUserId_() {
        return this.startUserId_;
    }

    public void setStartUserId_(String startUserId_) {
        this.startUserId_ = startUserId_;
    }

    public LocalDateTime getLockTime_() {
        return this.lockTime_;
    }

    public void setLockTime_(LocalDateTime lockTime_) {
        this.lockTime_ = lockTime_;
    }

    public Boolean getIsCountEnabled_() {
        return this.isCountEnabled_;
    }

    public void setIsCountEnabled_(Boolean isCountEnabled_) {
        this.isCountEnabled_ = isCountEnabled_;
    }

    public Integer getEvtSubscrCount_() {
        return this.evtSubscrCount_;
    }

    public void setEvtSubscrCount_(Integer evtSubscrCount_) {
        this.evtSubscrCount_ = evtSubscrCount_;
    }

    public Integer getTaskCount_() {
        return this.taskCount_;
    }

    public void setTaskCount_(Integer taskCount_) {
        this.taskCount_ = taskCount_;
    }

    public Integer getJobCount_() {
        return this.jobCount_;
    }

    public void setJobCount_(Integer jobCount_) {
        this.jobCount_ = jobCount_;
    }

    public Integer getTimerJobCount_() {
        return this.timerJobCount_;
    }

    public void setTimerJobCount_(Integer timerJobCount_) {
        this.timerJobCount_ = timerJobCount_;
    }

    public Integer getSuspJobCount_() {
        return this.suspJobCount_;
    }

    public void setSuspJobCount_(Integer suspJobCount_) {
        this.suspJobCount_ = suspJobCount_;
    }

    public Integer getDeadletterJobCount_() {
        return this.deadletterJobCount_;
    }

    public void setDeadletterJobCount_(Integer deadletterJobCount_) {
        this.deadletterJobCount_ = deadletterJobCount_;
    }

    public Integer getVarCount_() {
        return this.varCount_;
    }

    public void setVarCount_(Integer varCount_) {
        this.varCount_ = varCount_;
    }

    public Integer getIdLinkCount_() {
        return this.idLinkCount_;
    }

    public void setIdLinkCount_(Integer idLinkCount_) {
        this.idLinkCount_ = idLinkCount_;
    }

    public Integer getAppVersion_() {
        return this.appVersion_;
    }

    public void setAppVersion_(Integer appVersion_) {
        this.appVersion_ = appVersion_;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ActRuExecution (");

        sb.append(id_);
        sb.append(", ").append(rev_);
        sb.append(", ").append(procInstId_);
        sb.append(", ").append(businessKey_);
        sb.append(", ").append(parentId_);
        sb.append(", ").append(procDefId_);
        sb.append(", ").append(superExec_);
        sb.append(", ").append(rootProcInstId_);
        sb.append(", ").append(actId_);
        sb.append(", ").append(isActive_);
        sb.append(", ").append(isConcurrent_);
        sb.append(", ").append(isScope_);
        sb.append(", ").append(isEventScope_);
        sb.append(", ").append(isMiRoot_);
        sb.append(", ").append(suspensionState_);
        sb.append(", ").append(cachedEntState_);
        sb.append(", ").append(tenantId_);
        sb.append(", ").append(name_);
        sb.append(", ").append(startTime_);
        sb.append(", ").append(startUserId_);
        sb.append(", ").append(lockTime_);
        sb.append(", ").append(isCountEnabled_);
        sb.append(", ").append(evtSubscrCount_);
        sb.append(", ").append(taskCount_);
        sb.append(", ").append(jobCount_);
        sb.append(", ").append(timerJobCount_);
        sb.append(", ").append(suspJobCount_);
        sb.append(", ").append(deadletterJobCount_);
        sb.append(", ").append(varCount_);
        sb.append(", ").append(idLinkCount_);
        sb.append(", ").append(appVersion_);

        sb.append(")");
        return sb.toString();
    }
}
