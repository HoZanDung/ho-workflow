/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * 流程模型设置监听器
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BpmConfListener implements Serializable {

    private static final long serialVersionUID = 569082525;

    private String        id;
    private String        value;
    private String        type;
    private String        status;
    private Integer       priority;
    private String        nodeId;
    private String        processModelId;
    private Integer       extStatus;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String        createBy;
    private String        updateBy;
    private String        nodeName;
    private String        nodeCode;
    private String        beanName;

    public BpmConfListener() {}

    public BpmConfListener(BpmConfListener value) {
        this.id = value.id;
        this.value = value.value;
        this.type = value.type;
        this.status = value.status;
        this.priority = value.priority;
        this.nodeId = value.nodeId;
        this.processModelId = value.processModelId;
        this.extStatus = value.extStatus;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.createBy = value.createBy;
        this.updateBy = value.updateBy;
        this.nodeName = value.nodeName;
        this.nodeCode = value.nodeCode;
        this.beanName = value.beanName;
    }

    public BpmConfListener(
        String        id,
        String        value,
        String        type,
        String        status,
        Integer       priority,
        String        nodeId,
        String        processModelId,
        Integer       extStatus,
        LocalDateTime createTime,
        LocalDateTime updateTime,
        String        createBy,
        String        updateBy,
        String        nodeName,
        String        nodeCode,
        String        beanName
    ) {
        this.id = id;
        this.value = value;
        this.type = type;
        this.status = status;
        this.priority = priority;
        this.nodeId = nodeId;
        this.processModelId = processModelId;
        this.extStatus = extStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.nodeName = nodeName;
        this.nodeCode = nodeCode;
        this.beanName = beanName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getProcessModelId() {
        return this.processModelId;
    }

    public void setProcessModelId(String processModelId) {
        this.processModelId = processModelId;
    }

    public Integer getExtStatus() {
        return this.extStatus;
    }

    public void setExtStatus(Integer extStatus) {
        this.extStatus = extStatus;
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

    public String getNodeName() {
        return this.nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeCode() {
        return this.nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    public String getBeanName() {
        return this.beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BpmConfListener (");

        sb.append(id);
        sb.append(", ").append(value);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(priority);
        sb.append(", ").append(nodeId);
        sb.append(", ").append(processModelId);
        sb.append(", ").append(extStatus);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(createBy);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(nodeName);
        sb.append(", ").append(nodeCode);
        sb.append(", ").append(beanName);

        sb.append(")");
        return sb.toString();
    }
}
