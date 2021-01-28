/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.records;


import cn.com.ho.workflow.infrastructure.db.tables.ActHiIdentitylink;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class ActHiIdentitylinkRecord extends UpdatableRecordImpl<ActHiIdentitylinkRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 894501681;

    /**
     * Setter for <code>workflow.act_hi_identitylink.id_</code>.
     */
    public void setId_(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>workflow.act_hi_identitylink.id_</code>.
     */
    public String getId_() {
        return (String) get(0);
    }

    /**
     * Setter for <code>workflow.act_hi_identitylink.group_id_</code>.
     */
    public void setGroupId_(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>workflow.act_hi_identitylink.group_id_</code>.
     */
    public String getGroupId_() {
        return (String) get(1);
    }

    /**
     * Setter for <code>workflow.act_hi_identitylink.type_</code>.
     */
    public void setType_(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>workflow.act_hi_identitylink.type_</code>.
     */
    public String getType_() {
        return (String) get(2);
    }

    /**
     * Setter for <code>workflow.act_hi_identitylink.user_id_</code>.
     */
    public void setUserId_(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>workflow.act_hi_identitylink.user_id_</code>.
     */
    public String getUserId_() {
        return (String) get(3);
    }

    /**
     * Setter for <code>workflow.act_hi_identitylink.task_id_</code>.
     */
    public void setTaskId_(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>workflow.act_hi_identitylink.task_id_</code>.
     */
    public String getTaskId_() {
        return (String) get(4);
    }

    /**
     * Setter for <code>workflow.act_hi_identitylink.proc_inst_id_</code>.
     */
    public void setProcInstId_(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>workflow.act_hi_identitylink.proc_inst_id_</code>.
     */
    public String getProcInstId_() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ActHiIdentitylink.ACT_HI_IDENTITYLINK.ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ActHiIdentitylink.ACT_HI_IDENTITYLINK.GROUP_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ActHiIdentitylink.ACT_HI_IDENTITYLINK.TYPE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ActHiIdentitylink.ACT_HI_IDENTITYLINK.USER_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ActHiIdentitylink.ACT_HI_IDENTITYLINK.TASK_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ActHiIdentitylink.ACT_HI_IDENTITYLINK.PROC_INST_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGroupId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUserId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTaskId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getProcInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGroupId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUserId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTaskId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProcInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiIdentitylinkRecord value1(String value) {
        setId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiIdentitylinkRecord value2(String value) {
        setGroupId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiIdentitylinkRecord value3(String value) {
        setType_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiIdentitylinkRecord value4(String value) {
        setUserId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiIdentitylinkRecord value5(String value) {
        setTaskId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiIdentitylinkRecord value6(String value) {
        setProcInstId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiIdentitylinkRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActHiIdentitylinkRecord
     */
    public ActHiIdentitylinkRecord() {
        super(ActHiIdentitylink.ACT_HI_IDENTITYLINK);
    }

    /**
     * Create a detached, initialised ActHiIdentitylinkRecord
     */
    public ActHiIdentitylinkRecord(String id_, String groupId_, String type_, String userId_, String taskId_, String procInstId_) {
        super(ActHiIdentitylink.ACT_HI_IDENTITYLINK);

        set(0, id_);
        set(1, groupId_);
        set(2, type_);
        set(3, userId_);
        set(4, taskId_);
        set(5, procInstId_);
    }
}
