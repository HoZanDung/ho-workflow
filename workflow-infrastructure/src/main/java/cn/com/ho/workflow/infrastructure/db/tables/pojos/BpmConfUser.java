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
public class BpmConfUser implements Serializable {

    private static final long serialVersionUID = -2099772161;

    private String        id;
    private String        value;
    private String        type;
    private String        status;
    private Integer       priority;
    private String        nodeId;
    private String        processModelId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String        createBy;
    private String        updateBy;
    private String        exprUser;
    private String        isDepart;
    private String        nodeName;
    private String        departLevel;
    private String        valCn;
    private String        nodeCode;
    private String        valueText;

    public BpmConfUser() {}

    public BpmConfUser(BpmConfUser value) {
        this.id = value.id;
        this.value = value.value;
        this.type = value.type;
        this.status = value.status;
        this.priority = value.priority;
        this.nodeId = value.nodeId;
        this.processModelId = value.processModelId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.createBy = value.createBy;
        this.updateBy = value.updateBy;
        this.exprUser = value.exprUser;
        this.isDepart = value.isDepart;
        this.nodeName = value.nodeName;
        this.departLevel = value.departLevel;
        this.valCn = value.valCn;
        this.nodeCode = value.nodeCode;
        this.valueText = value.valueText;
    }

    public BpmConfUser(
        String        id,
        String        value,
        String        type,
        String        status,
        Integer       priority,
        String        nodeId,
        String        processModelId,
        LocalDateTime createTime,
        LocalDateTime updateTime,
        String        createBy,
        String        updateBy,
        String        exprUser,
        String        isDepart,
        String        nodeName,
        String        departLevel,
        String        valCn,
        String        nodeCode,
        String        valueText
    ) {
        this.id = id;
        this.value = value;
        this.type = type;
        this.status = status;
        this.priority = priority;
        this.nodeId = nodeId;
        this.processModelId = processModelId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.exprUser = exprUser;
        this.isDepart = isDepart;
        this.nodeName = nodeName;
        this.departLevel = departLevel;
        this.valCn = valCn;
        this.nodeCode = nodeCode;
        this.valueText = valueText;
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

    public String getExprUser() {
        return this.exprUser;
    }

    public void setExprUser(String exprUser) {
        this.exprUser = exprUser;
    }

    public String getIsDepart() {
        return this.isDepart;
    }

    public void setIsDepart(String isDepart) {
        this.isDepart = isDepart;
    }

    public String getNodeName() {
        return this.nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getDepartLevel() {
        return this.departLevel;
    }

    public void setDepartLevel(String departLevel) {
        this.departLevel = departLevel;
    }

    public String getValCn() {
        return this.valCn;
    }

    public void setValCn(String valCn) {
        this.valCn = valCn;
    }

    public String getNodeCode() {
        return this.nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    public String getValueText() {
        return this.valueText;
    }

    public void setValueText(String valueText) {
        this.valueText = valueText;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BpmConfUser (");

        sb.append(id);
        sb.append(", ").append(value);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(priority);
        sb.append(", ").append(nodeId);
        sb.append(", ").append(processModelId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(createBy);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(exprUser);
        sb.append(", ").append(isDepart);
        sb.append(", ").append(nodeName);
        sb.append(", ").append(departLevel);
        sb.append(", ").append(valCn);
        sb.append(", ").append(nodeCode);
        sb.append(", ").append(valueText);

        sb.append(")");
        return sb.toString();
    }
}
