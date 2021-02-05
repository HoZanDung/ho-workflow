/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.records;


import cn.com.ho.workflow.infrastructure.db.tables.BpmConfNode;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BpmConfNodeRecord extends UpdatableRecordImpl<BpmConfNodeRecord> implements Record22<String, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, String, LocalDateTime, LocalDateTime, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1516546843;

    /**
     * Setter for <code>workflow.bpm_conf_node.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.type</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.conf_user</code>.
     */
    public void setConfUser(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.conf_user</code>.
     */
    public Integer getConfUser() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.conf_listener</code>.
     */
    public void setConfListener(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.conf_listener</code>.
     */
    public Integer getConfListener() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.conf_rule</code>.
     */
    public void setConfRule(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.conf_rule</code>.
     */
    public Integer getConfRule() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.conf_form</code>.
     */
    public void setConfForm(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.conf_form</code>.
     */
    public Integer getConfForm() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.conf_operation</code>.
     */
    public void setConfOperation(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.conf_operation</code>.
     */
    public Integer getConfOperation() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.conf_notice</code>.
     */
    public void setConfNotice(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.conf_notice</code>.
     */
    public Integer getConfNotice() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.priority</code>.
     */
    public void setPriority(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.conf_base_id</code>.
     */
    public void setConfBaseId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.conf_base_id</code>.
     */
    public String getConfBaseId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.skip</code>.
     */
    public void setSkip(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.skip</code>.
     */
    public String getSkip() {
        return (String) get(12);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.status</code>.
     */
    public void setStatus(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.status</code>.
     */
    public String getStatus() {
        return (String) get(13);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(14, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.create_by</code>.
     */
    public void setCreateBy(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.create_by</code>.
     */
    public String getCreateBy() {
        return (String) get(16);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.update_by</code>.
     */
    public void setUpdateBy(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.update_by</code>.
     */
    public String getUpdateBy() {
        return (String) get(17);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.skip_node_expr</code>.
     */
    public void setSkipNodeExpr(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.skip_node_expr</code>.
     */
    public String getSkipNodeExpr() {
        return (String) get(18);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.use_dept_role</code>.
     */
    public void setUseDeptRole(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.use_dept_role</code>.
     */
    public String getUseDeptRole() {
        return (String) get(19);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.grab_order</code>.
     */
    public void setGrabOrder(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.grab_order</code>.
     */
    public String getGrabOrder() {
        return (String) get(20);
    }

    /**
     * Setter for <code>workflow.bpm_conf_node.model_name</code>.
     */
    public void setModelName(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_node.model_name</code>.
     */
    public String getModelName() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, String, LocalDateTime, LocalDateTime, String, String, String, String, String, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, String, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, String, LocalDateTime, LocalDateTime, String, String, String, String, String, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return BpmConfNode.BPM_CONF_NODE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BpmConfNode.BPM_CONF_NODE.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BpmConfNode.BPM_CONF_NODE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BpmConfNode.BPM_CONF_NODE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return BpmConfNode.BPM_CONF_NODE.CONF_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return BpmConfNode.BPM_CONF_NODE.CONF_LISTENER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return BpmConfNode.BPM_CONF_NODE.CONF_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return BpmConfNode.BPM_CONF_NODE.CONF_FORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return BpmConfNode.BPM_CONF_NODE.CONF_OPERATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return BpmConfNode.BPM_CONF_NODE.CONF_NOTICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return BpmConfNode.BPM_CONF_NODE.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return BpmConfNode.BPM_CONF_NODE.CONF_BASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return BpmConfNode.BPM_CONF_NODE.SKIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return BpmConfNode.BPM_CONF_NODE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field15() {
        return BpmConfNode.BPM_CONF_NODE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field16() {
        return BpmConfNode.BPM_CONF_NODE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return BpmConfNode.BPM_CONF_NODE.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return BpmConfNode.BPM_CONF_NODE.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return BpmConfNode.BPM_CONF_NODE.SKIP_NODE_EXPR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return BpmConfNode.BPM_CONF_NODE.USE_DEPT_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return BpmConfNode.BPM_CONF_NODE.GRAB_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field22() {
        return BpmConfNode.BPM_CONF_NODE.MODEL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getConfUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getConfListener();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getConfRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getConfForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getConfOperation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getConfNotice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getConfBaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getSkip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component15() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component16() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getSkipNodeExpr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getUseDeptRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component21() {
        return getGrabOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component22() {
        return getModelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getConfUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getConfListener();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getConfRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getConfForm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getConfOperation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getConfNotice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getConfBaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getSkip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value15() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value16() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getSkipNodeExpr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getUseDeptRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getGrabOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value22() {
        return getModelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value2(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value5(Integer value) {
        setConfUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value6(Integer value) {
        setConfListener(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value7(Integer value) {
        setConfRule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value8(Integer value) {
        setConfForm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value9(Integer value) {
        setConfOperation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value10(Integer value) {
        setConfNotice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value11(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value12(String value) {
        setConfBaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value13(String value) {
        setSkip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value14(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value15(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value16(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value17(String value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value18(String value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value19(String value) {
        setSkipNodeExpr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value20(String value) {
        setUseDeptRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value21(String value) {
        setGrabOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord value22(String value) {
        setModelName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNodeRecord values(String value1, String value2, String value3, String value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, String value12, String value13, String value14, LocalDateTime value15, LocalDateTime value16, String value17, String value18, String value19, String value20, String value21, String value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BpmConfNodeRecord
     */
    public BpmConfNodeRecord() {
        super(BpmConfNode.BPM_CONF_NODE);
    }

    /**
     * Create a detached, initialised BpmConfNodeRecord
     */
    public BpmConfNodeRecord(String id, String code, String name, String type, Integer confUser, Integer confListener, Integer confRule, Integer confForm, Integer confOperation, Integer confNotice, Integer priority, String confBaseId, String skip, String status, LocalDateTime createTime, LocalDateTime updateTime, String createBy, String updateBy, String skipNodeExpr, String useDeptRole, String grabOrder, String modelName) {
        super(BpmConfNode.BPM_CONF_NODE);

        set(0, id);
        set(1, code);
        set(2, name);
        set(3, type);
        set(4, confUser);
        set(5, confListener);
        set(6, confRule);
        set(7, confForm);
        set(8, confOperation);
        set(9, confNotice);
        set(10, priority);
        set(11, confBaseId);
        set(12, skip);
        set(13, status);
        set(14, createTime);
        set(15, updateTime);
        set(16, createBy);
        set(17, updateBy);
        set(18, skipNodeExpr);
        set(19, useDeptRole);
        set(20, grabOrder);
        set(21, modelName);
    }
}
