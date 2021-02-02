/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.records;


import cn.com.ho.workflow.infrastructure.db.tables.TaskDefUser;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
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
public class TaskDefUserRecord extends UpdatableRecordImpl<TaskDefUserRecord> implements Record19<String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, String, String, String, String, String, Integer, String, String, String> {

    private static final long serialVersionUID = 227720362;

    /**
     * Setter for <code>workflow.task_def_user.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>workflow.task_def_user.value</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    /**
     * Setter for <code>workflow.task_def_user.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>workflow.task_def_user.catalog</code>.
     */
    public void setCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.catalog</code>.
     */
    public String getCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>workflow.task_def_user.base_id</code>.
     */
    public void setBaseId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.base_id</code>.
     */
    public String getBaseId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>workflow.task_def_user.process_definition_id</code>.
     */
    public void setProcessDefinitionId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.process_definition_id</code>.
     */
    public String getProcessDefinitionId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>workflow.task_def_user.status</code>.
     */
    public void setStatus(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.status</code>.
     */
    public String getStatus() {
        return (String) get(6);
    }

    /**
     * Setter for <code>workflow.task_def_user.node_code</code>.
     */
    public void setNodeCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.node_code</code>.
     */
    public String getNodeCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>workflow.task_def_user.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>workflow.task_def_user.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>workflow.task_def_user.create_by</code>.
     */
    public void setCreateBy(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.create_by</code>.
     */
    public String getCreateBy() {
        return (String) get(10);
    }

    /**
     * Setter for <code>workflow.task_def_user.update_by</code>.
     */
    public void setUpdateBy(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.update_by</code>.
     */
    public String getUpdateBy() {
        return (String) get(11);
    }

    /**
     * Setter for <code>workflow.task_def_user.expr_user</code>.
     */
    public void setExprUser(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.expr_user</code>.
     */
    public String getExprUser() {
        return (String) get(12);
    }

    /**
     * Setter for <code>workflow.task_def_user.is_depart</code>.
     */
    public void setIsDepart(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.is_depart</code>.
     */
    public String getIsDepart() {
        return (String) get(13);
    }

    /**
     * Setter for <code>workflow.task_def_user.node_name</code>.
     */
    public void setNodeName(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.node_name</code>.
     */
    public String getNodeName() {
        return (String) get(14);
    }

    /**
     * Setter for <code>workflow.task_def_user.priority</code>.
     */
    public void setPriority(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>workflow.task_def_user.depart_level</code>.
     */
    public void setDepartLevel(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.depart_level</code>.
     */
    public String getDepartLevel() {
        return (String) get(16);
    }

    /**
     * Setter for <code>workflow.task_def_user.val_cn</code>.
     */
    public void setValCn(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.val_cn</code>.
     */
    public String getValCn() {
        return (String) get(17);
    }

    /**
     * Setter for <code>workflow.task_def_user.value_text</code>.
     */
    public void setValueText(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>workflow.task_def_user.value_text</code>.
     */
    public String getValueText() {
        return (String) get(18);
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
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, String, String, String, String, String, Integer, String, String, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, String, String, String, String, String, Integer, String, String, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TaskDefUser.TASK_DEF_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TaskDefUser.TASK_DEF_USER.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TaskDefUser.TASK_DEF_USER.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TaskDefUser.TASK_DEF_USER.CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TaskDefUser.TASK_DEF_USER.BASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TaskDefUser.TASK_DEF_USER.PROCESS_DEFINITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TaskDefUser.TASK_DEF_USER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TaskDefUser.TASK_DEF_USER.NODE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field9() {
        return TaskDefUser.TASK_DEF_USER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field10() {
        return TaskDefUser.TASK_DEF_USER.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TaskDefUser.TASK_DEF_USER.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TaskDefUser.TASK_DEF_USER.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TaskDefUser.TASK_DEF_USER.EXPR_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return TaskDefUser.TASK_DEF_USER.IS_DEPART;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return TaskDefUser.TASK_DEF_USER.NODE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return TaskDefUser.TASK_DEF_USER.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return TaskDefUser.TASK_DEF_USER.DEPART_LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return TaskDefUser.TASK_DEF_USER.VAL_CN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return TaskDefUser.TASK_DEF_USER.VALUE_TEXT;
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
        return getCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getProcessDefinitionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getNodeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getExprUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getIsDepart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getNodeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component16() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getDepartLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getValCn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getValueText();
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
        return getCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProcessDefinitionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getNodeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getExprUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getIsDepart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getNodeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getDepartLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getValCn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getValueText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value2(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value4(String value) {
        setCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value5(String value) {
        setBaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value6(String value) {
        setProcessDefinitionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value7(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value8(String value) {
        setNodeCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value9(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value10(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value11(String value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value12(String value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value13(String value) {
        setExprUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value14(String value) {
        setIsDepart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value15(String value) {
        setNodeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value16(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value17(String value) {
        setDepartLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value18(String value) {
        setValCn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord value19(String value) {
        setValueText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefUserRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, LocalDateTime value9, LocalDateTime value10, String value11, String value12, String value13, String value14, String value15, Integer value16, String value17, String value18, String value19) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TaskDefUserRecord
     */
    public TaskDefUserRecord() {
        super(TaskDefUser.TASK_DEF_USER);
    }

    /**
     * Create a detached, initialised TaskDefUserRecord
     */
    public TaskDefUserRecord(String id, String value, String type, String catalog, String baseId, String processDefinitionId, String status, String nodeCode, LocalDateTime createTime, LocalDateTime updateTime, String createBy, String updateBy, String exprUser, String isDepart, String nodeName, Integer priority, String departLevel, String valCn, String valueText) {
        super(TaskDefUser.TASK_DEF_USER);

        set(0, id);
        set(1, value);
        set(2, type);
        set(3, catalog);
        set(4, baseId);
        set(5, processDefinitionId);
        set(6, status);
        set(7, nodeCode);
        set(8, createTime);
        set(9, updateTime);
        set(10, createBy);
        set(11, updateBy);
        set(12, exprUser);
        set(13, isDepart);
        set(14, nodeName);
        set(15, priority);
        set(16, departLevel);
        set(17, valCn);
        set(18, valueText);
    }
}
