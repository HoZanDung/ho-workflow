/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.records;


import cn.com.ho.workflow.infrastructure.db.tables.BpmConfListener;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BpmConfListenerRecord extends UpdatableRecordImpl<BpmConfListenerRecord> implements Record15<String, String, String, String, Integer, String, String, Integer, LocalDateTime, LocalDateTime, String, String, String, String, String> {

    private static final long serialVersionUID = 1511790111;

    /**
     * Setter for <code>workflow.bpm_conf_listener.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.value</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.status</code>.
     */
    public void setStatus(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.status</code>.
     */
    public String getStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.priority</code>.
     */
    public void setPriority(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.node_id</code>.
     */
    public void setNodeId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.node_id</code>.
     */
    public String getNodeId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.process_model_id</code>.
     */
    public void setProcessModelId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.process_model_id</code>.
     */
    public String getProcessModelId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.ext_status</code>.
     */
    public void setExtStatus(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.ext_status</code>.
     */
    public Integer getExtStatus() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.create_by</code>.
     */
    public void setCreateBy(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.create_by</code>.
     */
    public String getCreateBy() {
        return (String) get(10);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.update_by</code>.
     */
    public void setUpdateBy(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.update_by</code>.
     */
    public String getUpdateBy() {
        return (String) get(11);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.node_name</code>.
     */
    public void setNodeName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.node_name</code>.
     */
    public String getNodeName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.node_code</code>.
     */
    public void setNodeCode(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.node_code</code>.
     */
    public String getNodeCode() {
        return (String) get(13);
    }

    /**
     * Setter for <code>workflow.bpm_conf_listener.bean_name</code>.
     */
    public void setBeanName(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>workflow.bpm_conf_listener.bean_name</code>.
     */
    public String getBeanName() {
        return (String) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, String, String, String, Integer, String, String, Integer, LocalDateTime, LocalDateTime, String, String, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, String, String, String, Integer, String, String, Integer, LocalDateTime, LocalDateTime, String, String, String, String, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return BpmConfListener.BPM_CONF_LISTENER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BpmConfListener.BPM_CONF_LISTENER.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BpmConfListener.BPM_CONF_LISTENER.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BpmConfListener.BPM_CONF_LISTENER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return BpmConfListener.BPM_CONF_LISTENER.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return BpmConfListener.BPM_CONF_LISTENER.NODE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return BpmConfListener.BPM_CONF_LISTENER.PROCESS_MODEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return BpmConfListener.BPM_CONF_LISTENER.EXT_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field9() {
        return BpmConfListener.BPM_CONF_LISTENER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field10() {
        return BpmConfListener.BPM_CONF_LISTENER.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return BpmConfListener.BPM_CONF_LISTENER.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return BpmConfListener.BPM_CONF_LISTENER.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return BpmConfListener.BPM_CONF_LISTENER.NODE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return BpmConfListener.BPM_CONF_LISTENER.NODE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return BpmConfListener.BPM_CONF_LISTENER.BEAN_NAME;
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
    public Integer component5() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getNodeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getProcessModelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getExtStatus();
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
        return getNodeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getNodeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getBeanName();
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
    public Integer value5() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getNodeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getProcessModelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getExtStatus();
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
        return getNodeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getNodeCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getBeanName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value2(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value4(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value5(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value6(String value) {
        setNodeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value7(String value) {
        setProcessModelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value8(Integer value) {
        setExtStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value9(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value10(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value11(String value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value12(String value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value13(String value) {
        setNodeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value14(String value) {
        setNodeCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord value15(String value) {
        setBeanName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfListenerRecord values(String value1, String value2, String value3, String value4, Integer value5, String value6, String value7, Integer value8, LocalDateTime value9, LocalDateTime value10, String value11, String value12, String value13, String value14, String value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BpmConfListenerRecord
     */
    public BpmConfListenerRecord() {
        super(BpmConfListener.BPM_CONF_LISTENER);
    }

    /**
     * Create a detached, initialised BpmConfListenerRecord
     */
    public BpmConfListenerRecord(String id, String value, String type, String status, Integer priority, String nodeId, String processModelId, Integer extStatus, LocalDateTime createTime, LocalDateTime updateTime, String createBy, String updateBy, String nodeName, String nodeCode, String beanName) {
        super(BpmConfListener.BPM_CONF_LISTENER);

        set(0, id);
        set(1, value);
        set(2, type);
        set(3, status);
        set(4, priority);
        set(5, nodeId);
        set(6, processModelId);
        set(7, extStatus);
        set(8, createTime);
        set(9, updateTime);
        set(10, createBy);
        set(11, updateBy);
        set(12, nodeName);
        set(13, nodeCode);
        set(14, beanName);
    }
}
