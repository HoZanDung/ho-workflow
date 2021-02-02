/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.records;


import cn.com.ho.workflow.infrastructure.db.tables.TaskDefOperation;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
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
public class TaskDefOperationRecord extends UpdatableRecordImpl<TaskDefOperationRecord> implements Record21<String, String, String, Integer, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 675513257;

    /**
     * Setter for <code>workflow.task_def_operation.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>workflow.task_def_operation.value</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    /**
     * Setter for <code>workflow.task_def_operation.status</code>.
     */
    public void setStatus(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.status</code>.
     */
    public String getStatus() {
        return (String) get(2);
    }

    /**
     * Setter for <code>workflow.task_def_operation.priority</code>.
     */
    public void setPriority(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>workflow.task_def_operation.base_id</code>.
     */
    public void setBaseId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.base_id</code>.
     */
    public String getBaseId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>workflow.task_def_operation.process_definition_id</code>.
     */
    public void setProcessDefinitionId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.process_definition_id</code>.
     */
    public String getProcessDefinitionId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>workflow.task_def_operation.flow_method</code>.
     */
    public void setFlowMethod(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.flow_method</code>.
     */
    public String getFlowMethod() {
        return (String) get(6);
    }

    /**
     * Setter for <code>workflow.task_def_operation.op_js_name</code>.
     */
    public void setOpJsName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.op_js_name</code>.
     */
    public String getOpJsName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>workflow.task_def_operation.op_url</code>.
     */
    public void setOpUrl(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.op_url</code>.
     */
    public String getOpUrl() {
        return (String) get(8);
    }

    /**
     * Setter for <code>workflow.task_def_operation.op_expr</code>.
     */
    public void setOpExpr(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.op_expr</code>.
     */
    public String getOpExpr() {
        return (String) get(9);
    }

    /**
     * Setter for <code>workflow.task_def_operation.node_code</code>.
     */
    public void setNodeCode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.node_code</code>.
     */
    public String getNodeCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>workflow.task_def_operation.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>workflow.task_def_operation.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>workflow.task_def_operation.create_by</code>.
     */
    public void setCreateBy(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.create_by</code>.
     */
    public String getCreateBy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>workflow.task_def_operation.update_by</code>.
     */
    public void setUpdateBy(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.update_by</code>.
     */
    public String getUpdateBy() {
        return (String) get(14);
    }

    /**
     * Setter for <code>workflow.task_def_operation.btn_class</code>.
     */
    public void setBtnClass(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.btn_class</code>.
     */
    public String getBtnClass() {
        return (String) get(15);
    }

    /**
     * Setter for <code>workflow.task_def_operation.op_js_param</code>.
     */
    public void setOpJsParam(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.op_js_param</code>.
     */
    public String getOpJsParam() {
        return (String) get(16);
    }

    /**
     * Setter for <code>workflow.task_def_operation.mop_js_name</code>.
     */
    public void setMopJsName(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.mop_js_name</code>.
     */
    public String getMopJsName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>workflow.task_def_operation.mop_url</code>.
     */
    public void setMopUrl(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.mop_url</code>.
     */
    public String getMopUrl() {
        return (String) get(18);
    }

    /**
     * Setter for <code>workflow.task_def_operation.mb_tn_class</code>.
     */
    public void setMbTnClass(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.mb_tn_class</code>.
     */
    public String getMbTnClass() {
        return (String) get(19);
    }

    /**
     * Setter for <code>workflow.task_def_operation.node_name</code>.
     */
    public void setNodeName(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>workflow.task_def_operation.node_name</code>.
     */
    public String getNodeName() {
        return (String) get(20);
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
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<String, String, String, Integer, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<String, String, String, Integer, String, String, String, String, String, String, String, LocalDateTime, LocalDateTime, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TaskDefOperation.TASK_DEF_OPERATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TaskDefOperation.TASK_DEF_OPERATION.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TaskDefOperation.TASK_DEF_OPERATION.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TaskDefOperation.TASK_DEF_OPERATION.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TaskDefOperation.TASK_DEF_OPERATION.BASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TaskDefOperation.TASK_DEF_OPERATION.PROCESS_DEFINITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TaskDefOperation.TASK_DEF_OPERATION.FLOW_METHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TaskDefOperation.TASK_DEF_OPERATION.OP_JS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TaskDefOperation.TASK_DEF_OPERATION.OP_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TaskDefOperation.TASK_DEF_OPERATION.OP_EXPR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TaskDefOperation.TASK_DEF_OPERATION.NODE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field12() {
        return TaskDefOperation.TASK_DEF_OPERATION.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field13() {
        return TaskDefOperation.TASK_DEF_OPERATION.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return TaskDefOperation.TASK_DEF_OPERATION.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return TaskDefOperation.TASK_DEF_OPERATION.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return TaskDefOperation.TASK_DEF_OPERATION.BTN_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return TaskDefOperation.TASK_DEF_OPERATION.OP_JS_PARAM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return TaskDefOperation.TASK_DEF_OPERATION.MOP_JS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return TaskDefOperation.TASK_DEF_OPERATION.MOP_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return TaskDefOperation.TASK_DEF_OPERATION.MB_TN_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return TaskDefOperation.TASK_DEF_OPERATION.NODE_NAME;
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
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPriority();
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
        return getFlowMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getOpJsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getOpUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getOpExpr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getNodeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component12() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component13() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getBtnClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getOpJsParam();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getMopJsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getMopUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getMbTnClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component21() {
        return getNodeName();
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
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPriority();
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
        return getFlowMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getOpJsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOpUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getOpExpr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getNodeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value12() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value13() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getBtnClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getOpJsParam();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getMopJsName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getMopUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getMbTnClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getNodeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value2(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value3(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value4(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value5(String value) {
        setBaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value6(String value) {
        setProcessDefinitionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value7(String value) {
        setFlowMethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value8(String value) {
        setOpJsName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value9(String value) {
        setOpUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value10(String value) {
        setOpExpr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value11(String value) {
        setNodeCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value12(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value13(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value14(String value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value15(String value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value16(String value) {
        setBtnClass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value17(String value) {
        setOpJsParam(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value18(String value) {
        setMopJsName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value19(String value) {
        setMopUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value20(String value) {
        setMbTnClass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord value21(String value) {
        setNodeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskDefOperationRecord values(String value1, String value2, String value3, Integer value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, LocalDateTime value12, LocalDateTime value13, String value14, String value15, String value16, String value17, String value18, String value19, String value20, String value21) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TaskDefOperationRecord
     */
    public TaskDefOperationRecord() {
        super(TaskDefOperation.TASK_DEF_OPERATION);
    }

    /**
     * Create a detached, initialised TaskDefOperationRecord
     */
    public TaskDefOperationRecord(String id, String value, String status, Integer priority, String baseId, String processDefinitionId, String flowMethod, String opJsName, String opUrl, String opExpr, String nodeCode, LocalDateTime createTime, LocalDateTime updateTime, String createBy, String updateBy, String btnClass, String opJsParam, String mopJsName, String mopUrl, String mbTnClass, String nodeName) {
        super(TaskDefOperation.TASK_DEF_OPERATION);

        set(0, id);
        set(1, value);
        set(2, status);
        set(3, priority);
        set(4, baseId);
        set(5, processDefinitionId);
        set(6, flowMethod);
        set(7, opJsName);
        set(8, opUrl);
        set(9, opExpr);
        set(10, nodeCode);
        set(11, createTime);
        set(12, updateTime);
        set(13, createBy);
        set(14, updateBy);
        set(15, btnClass);
        set(16, opJsParam);
        set(17, mopJsName);
        set(18, mopUrl);
        set(19, mbTnClass);
        set(20, nodeName);
    }
}