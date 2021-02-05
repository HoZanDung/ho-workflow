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
public class BpmConfNode implements Serializable {

    private static final long serialVersionUID = -1533350397;

    private String        id;
    private String        code;
    private String        name;
    private String        type;
    private Integer       confUser;
    private Integer       confListener;
    private Integer       confRule;
    private Integer       confForm;
    private Integer       confOperation;
    private Integer       confNotice;
    private Integer       priority;
    private String        confBaseId;
    private String        skip;
    private String        status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String        createBy;
    private String        updateBy;
    private String        skipNodeExpr;
    private String        useDeptRole;
    private String        grabOrder;
    private String        modelName;

    public BpmConfNode() {}

    public BpmConfNode(BpmConfNode value) {
        this.id = value.id;
        this.code = value.code;
        this.name = value.name;
        this.type = value.type;
        this.confUser = value.confUser;
        this.confListener = value.confListener;
        this.confRule = value.confRule;
        this.confForm = value.confForm;
        this.confOperation = value.confOperation;
        this.confNotice = value.confNotice;
        this.priority = value.priority;
        this.confBaseId = value.confBaseId;
        this.skip = value.skip;
        this.status = value.status;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.createBy = value.createBy;
        this.updateBy = value.updateBy;
        this.skipNodeExpr = value.skipNodeExpr;
        this.useDeptRole = value.useDeptRole;
        this.grabOrder = value.grabOrder;
        this.modelName = value.modelName;
    }

    public BpmConfNode(
        String        id,
        String        code,
        String        name,
        String        type,
        Integer       confUser,
        Integer       confListener,
        Integer       confRule,
        Integer       confForm,
        Integer       confOperation,
        Integer       confNotice,
        Integer       priority,
        String        confBaseId,
        String        skip,
        String        status,
        LocalDateTime createTime,
        LocalDateTime updateTime,
        String        createBy,
        String        updateBy,
        String        skipNodeExpr,
        String        useDeptRole,
        String        grabOrder,
        String        modelName
    ) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.type = type;
        this.confUser = confUser;
        this.confListener = confListener;
        this.confRule = confRule;
        this.confForm = confForm;
        this.confOperation = confOperation;
        this.confNotice = confNotice;
        this.priority = priority;
        this.confBaseId = confBaseId;
        this.skip = skip;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.skipNodeExpr = skipNodeExpr;
        this.useDeptRole = useDeptRole;
        this.grabOrder = grabOrder;
        this.modelName = modelName;
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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getConfUser() {
        return this.confUser;
    }

    public void setConfUser(Integer confUser) {
        this.confUser = confUser;
    }

    public Integer getConfListener() {
        return this.confListener;
    }

    public void setConfListener(Integer confListener) {
        this.confListener = confListener;
    }

    public Integer getConfRule() {
        return this.confRule;
    }

    public void setConfRule(Integer confRule) {
        this.confRule = confRule;
    }

    public Integer getConfForm() {
        return this.confForm;
    }

    public void setConfForm(Integer confForm) {
        this.confForm = confForm;
    }

    public Integer getConfOperation() {
        return this.confOperation;
    }

    public void setConfOperation(Integer confOperation) {
        this.confOperation = confOperation;
    }

    public Integer getConfNotice() {
        return this.confNotice;
    }

    public void setConfNotice(Integer confNotice) {
        this.confNotice = confNotice;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getConfBaseId() {
        return this.confBaseId;
    }

    public void setConfBaseId(String confBaseId) {
        this.confBaseId = confBaseId;
    }

    public String getSkip() {
        return this.skip;
    }

    public void setSkip(String skip) {
        this.skip = skip;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getSkipNodeExpr() {
        return this.skipNodeExpr;
    }

    public void setSkipNodeExpr(String skipNodeExpr) {
        this.skipNodeExpr = skipNodeExpr;
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

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BpmConfNode (");

        sb.append(id);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(confUser);
        sb.append(", ").append(confListener);
        sb.append(", ").append(confRule);
        sb.append(", ").append(confForm);
        sb.append(", ").append(confOperation);
        sb.append(", ").append(confNotice);
        sb.append(", ").append(priority);
        sb.append(", ").append(confBaseId);
        sb.append(", ").append(skip);
        sb.append(", ").append(status);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(createBy);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(skipNodeExpr);
        sb.append(", ").append(useDeptRole);
        sb.append(", ").append(grabOrder);
        sb.append(", ").append(modelName);

        sb.append(")");
        return sb.toString();
    }
}
