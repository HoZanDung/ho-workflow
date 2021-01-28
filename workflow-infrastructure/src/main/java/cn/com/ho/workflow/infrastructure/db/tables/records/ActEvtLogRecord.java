/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.records;


import cn.com.ho.workflow.infrastructure.db.tables.ActEvtLog;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class ActEvtLogRecord extends UpdatableRecordImpl<ActEvtLogRecord> implements Record12<Integer, String, String, String, String, String, LocalDateTime, String, byte[], String, LocalDateTime, Short> {

    private static final long serialVersionUID = 759769065;

    /**
     * Setter for <code>workflow.act_evt_log.log_nr_</code>.
     */
    public void setLogNr_(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>workflow.act_evt_log.log_nr_</code>.
     */
    public Integer getLogNr_() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>workflow.act_evt_log.type_</code>.
     */
    public void setType_(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>workflow.act_evt_log.type_</code>.
     */
    public String getType_() {
        return (String) get(1);
    }

    /**
     * Setter for <code>workflow.act_evt_log.proc_def_id_</code>.
     */
    public void setProcDefId_(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>workflow.act_evt_log.proc_def_id_</code>.
     */
    public String getProcDefId_() {
        return (String) get(2);
    }

    /**
     * Setter for <code>workflow.act_evt_log.proc_inst_id_</code>.
     */
    public void setProcInstId_(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>workflow.act_evt_log.proc_inst_id_</code>.
     */
    public String getProcInstId_() {
        return (String) get(3);
    }

    /**
     * Setter for <code>workflow.act_evt_log.execution_id_</code>.
     */
    public void setExecutionId_(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>workflow.act_evt_log.execution_id_</code>.
     */
    public String getExecutionId_() {
        return (String) get(4);
    }

    /**
     * Setter for <code>workflow.act_evt_log.task_id_</code>.
     */
    public void setTaskId_(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>workflow.act_evt_log.task_id_</code>.
     */
    public String getTaskId_() {
        return (String) get(5);
    }

    /**
     * Setter for <code>workflow.act_evt_log.time_stamp_</code>.
     */
    public void setTimeStamp_(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>workflow.act_evt_log.time_stamp_</code>.
     */
    public LocalDateTime getTimeStamp_() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>workflow.act_evt_log.user_id_</code>.
     */
    public void setUserId_(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>workflow.act_evt_log.user_id_</code>.
     */
    public String getUserId_() {
        return (String) get(7);
    }

    /**
     * Setter for <code>workflow.act_evt_log.data_</code>.
     */
    public void setData_(byte... value) {
        set(8, value);
    }

    /**
     * Getter for <code>workflow.act_evt_log.data_</code>.
     */
    public byte[] getData_() {
        return (byte[]) get(8);
    }

    /**
     * Setter for <code>workflow.act_evt_log.lock_owner_</code>.
     */
    public void setLockOwner_(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>workflow.act_evt_log.lock_owner_</code>.
     */
    public String getLockOwner_() {
        return (String) get(9);
    }

    /**
     * Setter for <code>workflow.act_evt_log.lock_time_</code>.
     */
    public void setLockTime_(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>workflow.act_evt_log.lock_time_</code>.
     */
    public LocalDateTime getLockTime_() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>workflow.act_evt_log.is_processed_</code>.
     */
    public void setIsProcessed_(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>workflow.act_evt_log.is_processed_</code>.
     */
    public Short getIsProcessed_() {
        return (Short) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, String, String, LocalDateTime, String, byte[], String, LocalDateTime, Short> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, String, String, LocalDateTime, String, byte[], String, LocalDateTime, Short> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ActEvtLog.ACT_EVT_LOG.LOG_NR_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ActEvtLog.ACT_EVT_LOG.TYPE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ActEvtLog.ACT_EVT_LOG.PROC_DEF_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ActEvtLog.ACT_EVT_LOG.PROC_INST_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ActEvtLog.ACT_EVT_LOG.EXECUTION_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ActEvtLog.ACT_EVT_LOG.TASK_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field7() {
        return ActEvtLog.ACT_EVT_LOG.TIME_STAMP_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ActEvtLog.ACT_EVT_LOG.USER_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field9() {
        return ActEvtLog.ACT_EVT_LOG.DATA_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ActEvtLog.ACT_EVT_LOG.LOCK_OWNER_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field11() {
        return ActEvtLog.ACT_EVT_LOG.LOCK_TIME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return ActEvtLog.ACT_EVT_LOG.IS_PROCESSED_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getLogNr_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getType_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getProcDefId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getProcInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getExecutionId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTaskId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component7() {
        return getTimeStamp_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUserId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component9() {
        return getData_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getLockOwner_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component11() {
        return getLockTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component12() {
        return getIsProcessed_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getLogNr_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getType_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProcDefId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProcInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getExecutionId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTaskId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value7() {
        return getTimeStamp_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUserId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value9() {
        return getData_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getLockOwner_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value11() {
        return getLockTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getIsProcessed_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActEvtLogRecord value1(Integer value) {
        setLogNr_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActEvtLogRecord value2(String value) {
        setType_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActEvtLogRecord value3(String value) {
        setProcDefId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActEvtLogRecord value4(String value) {
        setProcInstId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActEvtLogRecord value5(String value) {
        setExecutionId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActEvtLogRecord value6(String value) {
        setTaskId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActEvtLogRecord value7(LocalDateTime value) {
        setTimeStamp_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActEvtLogRecord value8(String value) {
        setUserId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActEvtLogRecord value9(byte... value) {
        setData_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActEvtLogRecord value10(String value) {
        setLockOwner_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActEvtLogRecord value11(LocalDateTime value) {
        setLockTime_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActEvtLogRecord value12(Short value) {
        setIsProcessed_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActEvtLogRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, LocalDateTime value7, String value8, byte[] value9, String value10, LocalDateTime value11, Short value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActEvtLogRecord
     */
    public ActEvtLogRecord() {
        super(ActEvtLog.ACT_EVT_LOG);
    }

    /**
     * Create a detached, initialised ActEvtLogRecord
     */
    public ActEvtLogRecord(Integer logNr_, String type_, String procDefId_, String procInstId_, String executionId_, String taskId_, LocalDateTime timeStamp_, String userId_, byte[] data_, String lockOwner_, LocalDateTime lockTime_, Short isProcessed_) {
        super(ActEvtLog.ACT_EVT_LOG);

        set(0, logNr_);
        set(1, type_);
        set(2, procDefId_);
        set(3, procInstId_);
        set(4, executionId_);
        set(5, taskId_);
        set(6, timeStamp_);
        set(7, userId_);
        set(8, data_);
        set(9, lockOwner_);
        set(10, lockTime_);
        set(11, isProcessed_);
    }
}
