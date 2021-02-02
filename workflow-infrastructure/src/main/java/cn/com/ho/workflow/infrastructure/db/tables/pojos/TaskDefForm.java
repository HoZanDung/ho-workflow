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
public class TaskDefForm implements Serializable {

    private static final long serialVersionUID = -1117185414;

    private String        id;
    private String        value;
    private String        type;
    private String        status;
    private String        nodeCode;
    private String        nodeName;
    private String        mobileFormKey;
    private String        processDefinitionId;
    private String        baseId;
    private String        exprRule;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String        createBy;
    private String        updateBy;

    public TaskDefForm() {}

    public TaskDefForm(TaskDefForm value) {
        this.id = value.id;
        this.value = value.value;
        this.type = value.type;
        this.status = value.status;
        this.nodeCode = value.nodeCode;
        this.nodeName = value.nodeName;
        this.mobileFormKey = value.mobileFormKey;
        this.processDefinitionId = value.processDefinitionId;
        this.baseId = value.baseId;
        this.exprRule = value.exprRule;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.createBy = value.createBy;
        this.updateBy = value.updateBy;
    }

    public TaskDefForm(
        String        id,
        String        value,
        String        type,
        String        status,
        String        nodeCode,
        String        nodeName,
        String        mobileFormKey,
        String        processDefinitionId,
        String        baseId,
        String        exprRule,
        LocalDateTime createTime,
        LocalDateTime updateTime,
        String        createBy,
        String        updateBy
    ) {
        this.id = id;
        this.value = value;
        this.type = type;
        this.status = status;
        this.nodeCode = nodeCode;
        this.nodeName = nodeName;
        this.mobileFormKey = mobileFormKey;
        this.processDefinitionId = processDefinitionId;
        this.baseId = baseId;
        this.exprRule = exprRule;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createBy = createBy;
        this.updateBy = updateBy;
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

    public String getNodeCode() {
        return this.nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    public String getNodeName() {
        return this.nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getMobileFormKey() {
        return this.mobileFormKey;
    }

    public void setMobileFormKey(String mobileFormKey) {
        this.mobileFormKey = mobileFormKey;
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

    public String getExprRule() {
        return this.exprRule;
    }

    public void setExprRule(String exprRule) {
        this.exprRule = exprRule;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TaskDefForm (");

        sb.append(id);
        sb.append(", ").append(value);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(nodeCode);
        sb.append(", ").append(nodeName);
        sb.append(", ").append(mobileFormKey);
        sb.append(", ").append(processDefinitionId);
        sb.append(", ").append(baseId);
        sb.append(", ").append(exprRule);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(createBy);
        sb.append(", ").append(updateBy);

        sb.append(")");
        return sb.toString();
    }
}