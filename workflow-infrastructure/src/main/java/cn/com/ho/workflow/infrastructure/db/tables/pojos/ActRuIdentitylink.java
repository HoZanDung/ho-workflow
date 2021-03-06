/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.pojos;


import java.io.Serializable;

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
public class ActRuIdentitylink implements Serializable {

    private static final long serialVersionUID = 688200869;

    private String  id_;
    private Integer rev_;
    private String  groupId_;
    private String  type_;
    private String  userId_;
    private String  taskId_;
    private String  procInstId_;
    private String  procDefId_;

    public ActRuIdentitylink() {}

    public ActRuIdentitylink(ActRuIdentitylink value) {
        this.id_ = value.id_;
        this.rev_ = value.rev_;
        this.groupId_ = value.groupId_;
        this.type_ = value.type_;
        this.userId_ = value.userId_;
        this.taskId_ = value.taskId_;
        this.procInstId_ = value.procInstId_;
        this.procDefId_ = value.procDefId_;
    }

    public ActRuIdentitylink(
        String  id_,
        Integer rev_,
        String  groupId_,
        String  type_,
        String  userId_,
        String  taskId_,
        String  procInstId_,
        String  procDefId_
    ) {
        this.id_ = id_;
        this.rev_ = rev_;
        this.groupId_ = groupId_;
        this.type_ = type_;
        this.userId_ = userId_;
        this.taskId_ = taskId_;
        this.procInstId_ = procInstId_;
        this.procDefId_ = procDefId_;
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

    public String getGroupId_() {
        return this.groupId_;
    }

    public void setGroupId_(String groupId_) {
        this.groupId_ = groupId_;
    }

    public String getType_() {
        return this.type_;
    }

    public void setType_(String type_) {
        this.type_ = type_;
    }

    public String getUserId_() {
        return this.userId_;
    }

    public void setUserId_(String userId_) {
        this.userId_ = userId_;
    }

    public String getTaskId_() {
        return this.taskId_;
    }

    public void setTaskId_(String taskId_) {
        this.taskId_ = taskId_;
    }

    public String getProcInstId_() {
        return this.procInstId_;
    }

    public void setProcInstId_(String procInstId_) {
        this.procInstId_ = procInstId_;
    }

    public String getProcDefId_() {
        return this.procDefId_;
    }

    public void setProcDefId_(String procDefId_) {
        this.procDefId_ = procDefId_;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ActRuIdentitylink (");

        sb.append(id_);
        sb.append(", ").append(rev_);
        sb.append(", ").append(groupId_);
        sb.append(", ").append(type_);
        sb.append(", ").append(userId_);
        sb.append(", ").append(taskId_);
        sb.append(", ").append(procInstId_);
        sb.append(", ").append(procDefId_);

        sb.append(")");
        return sb.toString();
    }
}
