/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.records;


import cn.com.ho.workflow.infrastructure.db.tables.ActRuTask;

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
public class ActRuTaskRecord extends UpdatableRecordImpl<ActRuTaskRecord> implements Record22<String, Integer, String, String, String, String, String, String, String, String, String, String, String, Integer, LocalDateTime, LocalDateTime, String, Integer, String, String, LocalDateTime, Integer> {

    private static final long serialVersionUID = -1658049752;

    /**
     * Setter for <code>workflow.act_ru_task.id_</code>.
     */
    public void setId_(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.id_</code>.
     */
    public String getId_() {
        return (String) get(0);
    }

    /**
     * Setter for <code>workflow.act_ru_task.rev_</code>.
     */
    public void setRev_(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.rev_</code>.
     */
    public Integer getRev_() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>workflow.act_ru_task.execution_id_</code>.
     */
    public void setExecutionId_(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.execution_id_</code>.
     */
    public String getExecutionId_() {
        return (String) get(2);
    }

    /**
     * Setter for <code>workflow.act_ru_task.proc_inst_id_</code>.
     */
    public void setProcInstId_(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.proc_inst_id_</code>.
     */
    public String getProcInstId_() {
        return (String) get(3);
    }

    /**
     * Setter for <code>workflow.act_ru_task.proc_def_id_</code>.
     */
    public void setProcDefId_(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.proc_def_id_</code>.
     */
    public String getProcDefId_() {
        return (String) get(4);
    }

    /**
     * Setter for <code>workflow.act_ru_task.name_</code>.
     */
    public void setName_(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.name_</code>.
     */
    public String getName_() {
        return (String) get(5);
    }

    /**
     * Setter for <code>workflow.act_ru_task.business_key_</code>.
     */
    public void setBusinessKey_(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.business_key_</code>.
     */
    public String getBusinessKey_() {
        return (String) get(6);
    }

    /**
     * Setter for <code>workflow.act_ru_task.parent_task_id_</code>.
     */
    public void setParentTaskId_(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.parent_task_id_</code>.
     */
    public String getParentTaskId_() {
        return (String) get(7);
    }

    /**
     * Setter for <code>workflow.act_ru_task.description_</code>.
     */
    public void setDescription_(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.description_</code>.
     */
    public String getDescription_() {
        return (String) get(8);
    }

    /**
     * Setter for <code>workflow.act_ru_task.task_def_key_</code>.
     */
    public void setTaskDefKey_(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.task_def_key_</code>.
     */
    public String getTaskDefKey_() {
        return (String) get(9);
    }

    /**
     * Setter for <code>workflow.act_ru_task.owner_</code>.
     */
    public void setOwner_(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.owner_</code>.
     */
    public String getOwner_() {
        return (String) get(10);
    }

    /**
     * Setter for <code>workflow.act_ru_task.assignee_</code>.
     */
    public void setAssignee_(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.assignee_</code>.
     */
    public String getAssignee_() {
        return (String) get(11);
    }

    /**
     * Setter for <code>workflow.act_ru_task.delegation_</code>.
     */
    public void setDelegation_(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.delegation_</code>.
     */
    public String getDelegation_() {
        return (String) get(12);
    }

    /**
     * Setter for <code>workflow.act_ru_task.priority_</code>.
     */
    public void setPriority_(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.priority_</code>.
     */
    public Integer getPriority_() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>workflow.act_ru_task.create_time_</code>.
     */
    public void setCreateTime_(LocalDateTime value) {
        set(14, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.create_time_</code>.
     */
    public LocalDateTime getCreateTime_() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>workflow.act_ru_task.due_date_</code>.
     */
    public void setDueDate_(LocalDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.due_date_</code>.
     */
    public LocalDateTime getDueDate_() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>workflow.act_ru_task.category_</code>.
     */
    public void setCategory_(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.category_</code>.
     */
    public String getCategory_() {
        return (String) get(16);
    }

    /**
     * Setter for <code>workflow.act_ru_task.suspension_state_</code>.
     */
    public void setSuspensionState_(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.suspension_state_</code>.
     */
    public Integer getSuspensionState_() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>workflow.act_ru_task.tenant_id_</code>.
     */
    public void setTenantId_(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.tenant_id_</code>.
     */
    public String getTenantId_() {
        return (String) get(18);
    }

    /**
     * Setter for <code>workflow.act_ru_task.form_key_</code>.
     */
    public void setFormKey_(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.form_key_</code>.
     */
    public String getFormKey_() {
        return (String) get(19);
    }

    /**
     * Setter for <code>workflow.act_ru_task.claim_time_</code>.
     */
    public void setClaimTime_(LocalDateTime value) {
        set(20, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.claim_time_</code>.
     */
    public LocalDateTime getClaimTime_() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>workflow.act_ru_task.app_version_</code>.
     */
    public void setAppVersion_(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>workflow.act_ru_task.app_version_</code>.
     */
    public Integer getAppVersion_() {
        return (Integer) get(21);
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
    public Row22<String, Integer, String, String, String, String, String, String, String, String, String, String, String, Integer, LocalDateTime, LocalDateTime, String, Integer, String, String, LocalDateTime, Integer> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, Integer, String, String, String, String, String, String, String, String, String, String, String, Integer, LocalDateTime, LocalDateTime, String, Integer, String, String, LocalDateTime, Integer> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ActRuTask.ACT_RU_TASK.ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ActRuTask.ACT_RU_TASK.REV_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ActRuTask.ACT_RU_TASK.EXECUTION_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ActRuTask.ACT_RU_TASK.PROC_INST_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ActRuTask.ACT_RU_TASK.PROC_DEF_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ActRuTask.ACT_RU_TASK.NAME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ActRuTask.ACT_RU_TASK.BUSINESS_KEY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ActRuTask.ACT_RU_TASK.PARENT_TASK_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ActRuTask.ACT_RU_TASK.DESCRIPTION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ActRuTask.ACT_RU_TASK.TASK_DEF_KEY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ActRuTask.ACT_RU_TASK.OWNER_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ActRuTask.ACT_RU_TASK.ASSIGNEE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ActRuTask.ACT_RU_TASK.DELEGATION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return ActRuTask.ACT_RU_TASK.PRIORITY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field15() {
        return ActRuTask.ACT_RU_TASK.CREATE_TIME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field16() {
        return ActRuTask.ACT_RU_TASK.DUE_DATE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return ActRuTask.ACT_RU_TASK.CATEGORY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return ActRuTask.ACT_RU_TASK.SUSPENSION_STATE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return ActRuTask.ACT_RU_TASK.TENANT_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return ActRuTask.ACT_RU_TASK.FORM_KEY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field21() {
        return ActRuTask.ACT_RU_TASK.CLAIM_TIME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field22() {
        return ActRuTask.ACT_RU_TASK.APP_VERSION_;
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
    public Integer component2() {
        return getRev_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getExecutionId_();
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
        return getProcDefId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getBusinessKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getParentTaskId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getDescription_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getTaskDefKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getOwner_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getAssignee_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getDelegation_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getPriority_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component15() {
        return getCreateTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component16() {
        return getDueDate_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getCategory_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component18() {
        return getSuspensionState_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getTenantId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getFormKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component21() {
        return getClaimTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component22() {
        return getAppVersion_();
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
    public Integer value2() {
        return getRev_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getExecutionId_();
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
        return getProcDefId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBusinessKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getParentTaskId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDescription_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getTaskDefKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getOwner_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAssignee_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getDelegation_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getPriority_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value15() {
        return getCreateTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value16() {
        return getDueDate_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getCategory_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getSuspensionState_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getTenantId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getFormKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value21() {
        return getClaimTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value22() {
        return getAppVersion_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value1(String value) {
        setId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value2(Integer value) {
        setRev_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value3(String value) {
        setExecutionId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value4(String value) {
        setProcInstId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value5(String value) {
        setProcDefId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value6(String value) {
        setName_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value7(String value) {
        setBusinessKey_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value8(String value) {
        setParentTaskId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value9(String value) {
        setDescription_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value10(String value) {
        setTaskDefKey_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value11(String value) {
        setOwner_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value12(String value) {
        setAssignee_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value13(String value) {
        setDelegation_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value14(Integer value) {
        setPriority_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value15(LocalDateTime value) {
        setCreateTime_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value16(LocalDateTime value) {
        setDueDate_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value17(String value) {
        setCategory_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value18(Integer value) {
        setSuspensionState_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value19(String value) {
        setTenantId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value20(String value) {
        setFormKey_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value21(LocalDateTime value) {
        setClaimTime_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord value22(Integer value) {
        setAppVersion_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuTaskRecord values(String value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, Integer value14, LocalDateTime value15, LocalDateTime value16, String value17, Integer value18, String value19, String value20, LocalDateTime value21, Integer value22) {
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
     * Create a detached ActRuTaskRecord
     */
    public ActRuTaskRecord() {
        super(ActRuTask.ACT_RU_TASK);
    }

    /**
     * Create a detached, initialised ActRuTaskRecord
     */
    public ActRuTaskRecord(String id_, Integer rev_, String executionId_, String procInstId_, String procDefId_, String name_, String businessKey_, String parentTaskId_, String description_, String taskDefKey_, String owner_, String assignee_, String delegation_, Integer priority_, LocalDateTime createTime_, LocalDateTime dueDate_, String category_, Integer suspensionState_, String tenantId_, String formKey_, LocalDateTime claimTime_, Integer appVersion_) {
        super(ActRuTask.ACT_RU_TASK);

        set(0, id_);
        set(1, rev_);
        set(2, executionId_);
        set(3, procInstId_);
        set(4, procDefId_);
        set(5, name_);
        set(6, businessKey_);
        set(7, parentTaskId_);
        set(8, description_);
        set(9, taskDefKey_);
        set(10, owner_);
        set(11, assignee_);
        set(12, delegation_);
        set(13, priority_);
        set(14, createTime_);
        set(15, dueDate_);
        set(16, category_);
        set(17, suspensionState_);
        set(18, tenantId_);
        set(19, formKey_);
        set(20, claimTime_);
        set(21, appVersion_);
    }
}
