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
public class TaskDefRule implements Serializable {

    private static final long serialVersionUID = -460046848;

    private String        id;
    private String        value;
    private String        status;
    private String        nodeCode;
    private String        processDefinitionId;
    private String        baseId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String        createBy;
    private String        updateBy;
    private String        nodeName;

    public TaskDefRule() {}

    public TaskDefRule(TaskDefRule value) {
        this.id = value.id;
        this.value = value.value;
        this.status = value.status;
        this.nodeCode = value.nodeCode;
        this.processDefinitionId = value.processDefinitionId;
        this.baseId = value.baseId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.createBy = value.createBy;
        this.updateBy = value.updateBy;
        this.nodeName = value.nodeName;
    }

    public TaskDefRule(
        String        id,
        String        value,
        String        status,
        String        nodeCode,
        String        processDefinitionId,
        String        baseId,
        LocalDateTime createTime,
        LocalDateTime updateTime,
        String        createBy,
        String        updateBy,
        String        nodeName
    ) {
        this.id = id;
        this.value = value;
        this.status = status;
        this.nodeCode = nodeCode;
        this.processDefinitionId = processDefinitionId;
        this.baseId = baseId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.nodeName = nodeName;
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNodeCode() {
        return this.nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getBaseId() {
        return this.baseId;
    }

    public void setBaseId(String baseId) {
        this.baseId = baseId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TaskDefRule (");

        sb.append(id);
        sb.append(", ").append(value);
        sb.append(", ").append(status);
        sb.append(", ").append(nodeCode);
        sb.append(", ").append(processDefinitionId);
        sb.append(", ").append(baseId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(createBy);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(nodeName);

        sb.append(")");
        return sb.toString();
    }
}
