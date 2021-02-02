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
public class TaskDefBase implements Serializable {

    private static final long serialVersionUID = 1476338466;

    private String        id;
    private String        code;
    private String        name;
    private String        processDefinitionId;
    private String        status;
    private String        skip;
    private Integer       countersignRate;
    private String        countersignStrategy;
    private String        countersignUser;
    private String        countersignType;
    private String        assignStrategy;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String        createBy;
    private String        updateBy;
    private String        useDeptRole;
    private String        grabOrder;
    private String        skipNodeExpr;

    public TaskDefBase() {}

    public TaskDefBase(TaskDefBase value) {
        this.id = value.id;
        this.code = value.code;
        this.name = value.name;
        this.processDefinitionId = value.processDefinitionId;
        this.status = value.status;
        this.skip = value.skip;
        this.countersignRate = value.countersignRate;
        this.countersignStrategy = value.countersignStrategy;
        this.countersignUser = value.countersignUser;
        this.countersignType = value.countersignType;
        this.assignStrategy = value.assignStrategy;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.createBy = value.createBy;
        this.updateBy = value.updateBy;
        this.useDeptRole = value.useDeptRole;
        this.grabOrder = value.grabOrder;
        this.skipNodeExpr = value.skipNodeExpr;
    }

    public TaskDefBase(
        String        id,
        String        code,
        String        name,
        String        processDefinitionId,
        String        status,
        String        skip,
        Integer       countersignRate,
        String        countersignStrategy,
        String        countersignUser,
        String        countersignType,
        String        assignStrategy,
        LocalDateTime createTime,
        LocalDateTime updateTime,
        String        createBy,
        String        updateBy,
        String        useDeptRole,
        String        grabOrder,
        String        skipNodeExpr
    ) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.processDefinitionId = processDefinitionId;
        this.status = status;
        this.skip = skip;
        this.countersignRate = countersignRate;
        this.countersignStrategy = countersignStrategy;
        this.countersignUser = countersignUser;
        this.countersignType = countersignType;
        this.assignStrategy = assignStrategy;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.useDeptRole = useDeptRole;
        this.grabOrder = grabOrder;
        this.skipNodeExpr = skipNodeExpr;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSkip() {
        return this.skip;
    }

    public void setSkip(String skip) {
        this.skip = skip;
    }

    public Integer getCountersignRate() {
        return this.countersignRate;
    }

    public void setCountersignRate(Integer countersignRate) {
        this.countersignRate = countersignRate;
    }

    public String getCountersignStrategy() {
        return this.countersignStrategy;
    }

    public void setCountersignStrategy(String countersignStrategy) {
        this.countersignStrategy = countersignStrategy;
    }

    public String getCountersignUser() {
        return this.countersignUser;
    }

    public void setCountersignUser(String countersignUser) {
        this.countersignUser = countersignUser;
    }

    public String getCountersignType() {
        return this.countersignType;
    }

    public void setCountersignType(String countersignType) {
        this.countersignType = countersignType;
    }

    public String getAssignStrategy() {
        return this.assignStrategy;
    }

    public void setAssignStrategy(String assignStrategy) {
        this.assignStrategy = assignStrategy;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return this.updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUseDeptRole() {
        return this.useDeptRole;
    }

    public void setUseDeptRole(String useDeptRole) {
        this.useDeptRole = useDeptRole;
    }

    public String getGrabOrder() {
        return this.grabOrder;
    }

    public void setGrabOrder(String grabOrder) {
        this.grabOrder = grabOrder;
    }

    public String getSkipNodeExpr() {
        return this.skipNodeExpr;
    }

    public void setSkipNodeExpr(String skipNodeExpr) {
        this.skipNodeExpr = skipNodeExpr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TaskDefBase (");

        sb.append(id);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(processDefinitionId);
        sb.append(", ").append(status);
        sb.append(", ").append(skip);
        sb.append(", ").append(countersignRate);
        sb.append(", ").append(countersignStrategy);
        sb.append(", ").append(countersignUser);
        sb.append(", ").append(countersignType);
        sb.append(", ").append(assignStrategy);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(createBy);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(useDeptRole);
        sb.append(", ").append(grabOrder);
        sb.append(", ").append(skipNodeExpr);

        sb.append(")");
        return sb.toString();
    }
}