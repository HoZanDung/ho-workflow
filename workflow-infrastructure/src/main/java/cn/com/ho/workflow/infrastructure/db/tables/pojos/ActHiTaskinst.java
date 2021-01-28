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
public class ActHiTaskinst implements Serializable {

    private static final long serialVersionUID = 231284479;

    private String        id_;
    private String        procDefId_;
    private String        taskDefKey_;
    private String        procInstId_;
    private String        executionId_;
    private String        name_;
    private String        parentTaskId_;
    private String        description_;
    private String        owner_;
    private String        assignee_;
    private LocalDateTime startTime_;
    private LocalDateTime claimTime_;
    private LocalDateTime endTime_;
    private Long          duration_;
    private String        deleteReason_;
    private Integer       priority_;
    private LocalDateTime dueDate_;
    private String        formKey_;
    private String        category_;
    private String        tenantId_;

    public ActHiTaskinst() {}

    public ActHiTaskinst(ActHiTaskinst value) {
        this.id_ = value.id_;
        this.procDefId_ = value.procDefId_;
        this.taskDefKey_ = value.taskDefKey_;
        this.procInstId_ = value.procInstId_;
        this.executionId_ = value.executionId_;
        this.name_ = value.name_;
        this.parentTaskId_ = value.parentTaskId_;
        this.description_ = value.description_;
        this.owner_ = value.owner_;
        this.assignee_ = value.assignee_;
        this.startTime_ = value.startTime_;
        this.claimTime_ = value.claimTime_;
        this.endTime_ = value.endTime_;
        this.duration_ = value.duration_;
        this.deleteReason_ = value.deleteReason_;
        this.priority_ = value.priority_;
        this.dueDate_ = value.dueDate_;
        this.formKey_ = value.formKey_;
        this.category_ = value.category_;
        this.tenantId_ = value.tenantId_;
    }

    public ActHiTaskinst(
        String        id_,
        String        procDefId_,
        String        taskDefKey_,
        String        procInstId_,
        String        executionId_,
        String        name_,
        String        parentTaskId_,
        String        description_,
        String        owner_,
        String        assignee_,
        LocalDateTime startTime_,
        LocalDateTime claimTime_,
        LocalDateTime endTime_,
        Long          duration_,
        String        deleteReason_,
        Integer       priority_,
        LocalDateTime dueDate_,
        String        formKey_,
        String        category_,
        String        tenantId_
    ) {
        this.id_ = id_;
        this.procDefId_ = procDefId_;
        this.taskDefKey_ = taskDefKey_;
        this.procInstId_ = procInstId_;
        this.executionId_ = executionId_;
        this.name_ = name_;
        this.parentTaskId_ = parentTaskId_;
        this.description_ = description_;
        this.owner_ = owner_;
        this.assignee_ = assignee_;
        this.startTime_ = startTime_;
        this.claimTime_ = claimTime_;
        this.endTime_ = endTime_;
        this.duration_ = duration_;
        this.deleteReason_ = deleteReason_;
        this.priority_ = priority_;
        this.dueDate_ = dueDate_;
        this.formKey_ = formKey_;
        this.category_ = category_;
        this.tenantId_ = tenantId_;
    }

    public String getId_() {
        return this.id_;
    }

    public void setId_(String id_) {
        this.id_ = id_;
    }

    public String getProcDefId_() {
        return this.procDefId_;
    }

    public void setProcDefId_(String procDefId_) {
        this.procDefId_ = procDefId_;
    }

    public String getTaskDefKey_() {
        return this.taskDefKey_;
    }

    public void setTaskDefKey_(String taskDefKey_) {
        this.taskDefKey_ = taskDefKey_;
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

    public String getName_() {
        return this.name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getParentTaskId_() {
        return this.parentTaskId_;
    }

    public void setParentTaskId_(String parentTaskId_) {
        this.parentTaskId_ = parentTaskId_;
    }

    public String getDescription_() {
        return this.description_;
    }

    public void setDescription_(String description_) {
        this.description_ = description_;
    }

    public String getOwner_() {
        return this.owner_;
    }

    public void setOwner_(String owner_) {
        this.owner_ = owner_;
    }

    public String getAssignee_() {
        return this.assignee_;
    }

    public void setAssignee_(String assignee_) {
        this.assignee_ = assignee_;
    }

    public LocalDateTime getStartTime_() {
        return this.startTime_;
    }

    public void setStartTime_(LocalDateTime startTime_) {
        this.startTime_ = startTime_;
    }

    public LocalDateTime getClaimTime_() {
        return this.claimTime_;
    }

    public void setClaimTime_(LocalDateTime claimTime_) {
        this.claimTime_ = claimTime_;
    }

    public LocalDateTime getEndTime_() {
        return this.endTime_;
    }

    public void setEndTime_(LocalDateTime endTime_) {
        this.endTime_ = endTime_;
    }

    public Long getDuration_() {
        return this.duration_;
    }

    public void setDuration_(Long duration_) {
        this.duration_ = duration_;
    }

    public String getDeleteReason_() {
        return this.deleteReason_;
    }

    public void setDeleteReason_(String deleteReason_) {
        this.deleteReason_ = deleteReason_;
    }

    public Integer getPriority_() {
        return this.priority_;
    }

    public void setPriority_(Integer priority_) {
        this.priority_ = priority_;
    }

    public LocalDateTime getDueDate_() {
        return this.dueDate_;
    }

    public void setDueDate_(LocalDateTime dueDate_) {
        this.dueDate_ = dueDate_;
    }

    public String getFormKey_() {
        return this.formKey_;
    }

    public void setFormKey_(String formKey_) {
        this.formKey_ = formKey_;
    }

    public String getCategory_() {
        return this.category_;
    }

    public void setCategory_(String category_) {
        this.category_ = category_;
    }

    public String getTenantId_() {
        return this.tenantId_;
    }

    public void setTenantId_(String tenantId_) {
        this.tenantId_ = tenantId_;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ActHiTaskinst (");

        sb.append(id_);
        sb.append(", ").append(procDefId_);
        sb.append(", ").append(taskDefKey_);
        sb.append(", ").append(procInstId_);
        sb.append(", ").append(executionId_);
        sb.append(", ").append(name_);
        sb.append(", ").append(parentTaskId_);
        sb.append(", ").append(description_);
        sb.append(", ").append(owner_);
        sb.append(", ").append(assignee_);
        sb.append(", ").append(startTime_);
        sb.append(", ").append(claimTime_);
        sb.append(", ").append(endTime_);
        sb.append(", ").append(duration_);
        sb.append(", ").append(deleteReason_);
        sb.append(", ").append(priority_);
        sb.append(", ").append(dueDate_);
        sb.append(", ").append(formKey_);
        sb.append(", ").append(category_);
        sb.append(", ").append(tenantId_);

        sb.append(")");
        return sb.toString();
    }
}
