/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.records;


import cn.com.ho.workflow.infrastructure.db.tables.TaskDefForm;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class TaskDefFormRecord extends UpdatableRecordImpl<TaskDefFormRecord> implements Record14<String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1987897790;

    /**
     * Setter for <code>workflow.task_def_form.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>workflow.task_def_form.value</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    /**
     * Setter for <code>workflow.task_def_form.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>workflow.task_def_form.status</code>.
     */
    public void setStatus(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.status</code>.
     */
    public String getStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>workflow.task_def_form.node_code</code>.
     */
    public void setNodeCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.node_code</code>.
     */
    public String getNodeCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>workflow.task_def_form.node_name</code>.
     */
    public void setNodeName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.node_name</code>.
     */
    public String getNodeName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>workflow.task_def_form.mobile_form_key</code>.
     */
    public void setMobileFormKey(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.mobile_form_key</code>.
     */
    public String getMobileFormKey() {
        return (String) get(6);
    }

    /**
     * Setter for <code>workflow.task_def_form.process_definition_id</code>.
     */
    public void setProcessDefinitionId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.process_definition_id</code>.
     */
    public String getProcessDefinitionId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>workflow.task_def_form.base_id</code>.
     */
    public void setBaseId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.base_id</code>.
     */
    public String getBaseId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>workflow.task_def_form.expr_rule</code>.
     */
    public void setExprRule(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.expr_rule</code>.
     */
    public String getExprRule() {
        return (String) get(9);
    }

    /**
     * Setter for <code>workflow.task_def_form.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>workflow.task_def_form.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>workflow.task_def_form.create_by</code>.
     */
    public void setCreateBy(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.create_by</code>.
     */
    public String getCreateBy() {
        return (String) get(12);
    }

    /**
     * Setter for <code>workflow.task_def_form.update_by</code>.
     */
    public void setUpdateBy(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>workflow.task_def_form.update_by</code>.
     */
    public String getUpdateBy() {
        return (String) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TaskDefForm.TASK_DEF_FORM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TaskDefForm.TASK_DEF_FORM.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TaskDefForm.TASK_DEF_FORM.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TaskDefForm.TASK_DEF_FORM.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TaskDefForm.TASK_DEF_FORM.NODE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TaskDefForm.TASK_DEF_FORM.NODE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TaskDefForm.TASK_DEF_FORM.MOBILE_FORM_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TaskDefForm.TASK_DEF_FORM.PROCESS_DEFINITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TaskDefForm.TASK_DEF_FORM.BASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TaskDefForm.TASK_DEF_FORM.EXPR_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field11() {
        return TaskDefForm.TASK_DEF_FORM.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field12() {
        return TaskDefForm.TASK_DEF_FORM.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TaskDefForm.TASK_DEF_FORM.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return TaskDefForm.TASK_DEF_FORM.UPDATE_BY;
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
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getNodeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getNodeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getMobileFormKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getProcessDefinitionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getBaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getExprRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getUpdateBy();
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
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNodeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getNodeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMobileFormKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getProcessDefinitionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getExprRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value2(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value4(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value5(String value) {
        setNodeCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value6(String value) {
        setNodeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value7(String value) {
        setMobileFormKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value8(String value) {
        setProcessDefinitionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value9(String value) {
        setBaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value10(String value) {
        setExprRule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value11(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value12(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value13(String value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord value14(String value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefFormRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, LocalDateTime value11, LocalDateTime value12, String value13, String value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TaskDefFormRecord
     */
    public TaskDefFormRecord() {
        super(TaskDefForm.TASK_DEF_FORM);
    }

    /**
     * Create a detached, initialised TaskDefFormRecord
     */
    public TaskDefFormRecord(String id, String value, String type, String status, String nodeCode, String nodeName, String mobileFormKey, String processDefinitionId, String baseId, String exprRule, LocalDateTime createTime, LocalDateTime updateTime, String createBy, String updateBy) {
        super(TaskDefForm.TASK_DEF_FORM);

        set(0, id);
        set(1, value);
        set(2, type);
        set(3, status);
        set(4, nodeCode);
        set(5, nodeName);
        set(6, mobileFormKey);
        set(7, processDefinitionId);
        set(8, baseId);
        set(9, exprRule);
        set(10, createTime);
        set(11, updateTime);
        set(12, createBy);
        set(13, updateBy);
    }
}