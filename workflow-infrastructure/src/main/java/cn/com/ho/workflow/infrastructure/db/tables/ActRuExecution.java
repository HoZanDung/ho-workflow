/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables;


import cn.com.ho.workflow.infrastructure.db.Indexes;
import cn.com.ho.workflow.infrastructure.db.Keys;
import cn.com.ho.workflow.infrastructure.db.Workflow;
import cn.com.ho.workflow.infrastructure.db.tables.records.ActRuExecutionRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ActRuExecution extends TableImpl<ActRuExecutionRecord> {

    private static final long serialVersionUID = -1808919213;

    /**
     * The reference instance of <code>workflow.act_ru_execution</code>
     */
    public static final ActRuExecution ACT_RU_EXECUTION = new ActRuExecution();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActRuExecutionRecord> getRecordType() {
        return ActRuExecutionRecord.class;
    }

    /**
     * The column <code>workflow.act_ru_execution.id_</code>.
     */
    public final TableField<ActRuExecutionRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>workflow.act_ru_execution.rev_</code>.
     */
    public final TableField<ActRuExecutionRecord, Integer> REV_ = createField("rev_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_ru_execution.proc_inst_id_</code>.
     */
    public final TableField<ActRuExecutionRecord, String> PROC_INST_ID_ = createField("proc_inst_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>workflow.act_ru_execution.business_key_</code>.
     */
    public final TableField<ActRuExecutionRecord, String> BUSINESS_KEY_ = createField("business_key_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_ru_execution.parent_id_</code>.
     */
    public final TableField<ActRuExecutionRecord, String> PARENT_ID_ = createField("parent_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>workflow.act_ru_execution.proc_def_id_</code>.
     */
    public final TableField<ActRuExecutionRecord, String> PROC_DEF_ID_ = createField("proc_def_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>workflow.act_ru_execution.super_exec_</code>.
     */
    public final TableField<ActRuExecutionRecord, String> SUPER_EXEC_ = createField("super_exec_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>workflow.act_ru_execution.root_proc_inst_id_</code>.
     */
    public final TableField<ActRuExecutionRecord, String> ROOT_PROC_INST_ID_ = createField("root_proc_inst_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>workflow.act_ru_execution.act_id_</code>.
     */
    public final TableField<ActRuExecutionRecord, String> ACT_ID_ = createField("act_id_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_ru_execution.is_active_</code>.
     */
    public final TableField<ActRuExecutionRecord, Boolean> IS_ACTIVE_ = createField("is_active_", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>workflow.act_ru_execution.is_concurrent_</code>.
     */
    public final TableField<ActRuExecutionRecord, Boolean> IS_CONCURRENT_ = createField("is_concurrent_", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>workflow.act_ru_execution.is_scope_</code>.
     */
    public final TableField<ActRuExecutionRecord, Boolean> IS_SCOPE_ = createField("is_scope_", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>workflow.act_ru_execution.is_event_scope_</code>.
     */
    public final TableField<ActRuExecutionRecord, Boolean> IS_EVENT_SCOPE_ = createField("is_event_scope_", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>workflow.act_ru_execution.is_mi_root_</code>.
     */
    public final TableField<ActRuExecutionRecord, Boolean> IS_MI_ROOT_ = createField("is_mi_root_", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>workflow.act_ru_execution.suspension_state_</code>.
     */
    public final TableField<ActRuExecutionRecord, Integer> SUSPENSION_STATE_ = createField("suspension_state_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_ru_execution.cached_ent_state_</code>.
     */
    public final TableField<ActRuExecutionRecord, Integer> CACHED_ENT_STATE_ = createField("cached_ent_state_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_ru_execution.tenant_id_</code>.
     */
    public final TableField<ActRuExecutionRecord, String> TENANT_ID_ = createField("tenant_id_", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>workflow.act_ru_execution.name_</code>.
     */
    public final TableField<ActRuExecutionRecord, String> NAME_ = createField("name_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_ru_execution.start_time_</code>.
     */
    public final TableField<ActRuExecutionRecord, LocalDateTime> START_TIME_ = createField("start_time_", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>workflow.act_ru_execution.start_user_id_</code>.
     */
    public final TableField<ActRuExecutionRecord, String> START_USER_ID_ = createField("start_user_id_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_ru_execution.lock_time_</code>.
     */
    public final TableField<ActRuExecutionRecord, LocalDateTime> LOCK_TIME_ = createField("lock_time_", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>workflow.act_ru_execution.is_count_enabled_</code>.
     */
    public final TableField<ActRuExecutionRecord, Boolean> IS_COUNT_ENABLED_ = createField("is_count_enabled_", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>workflow.act_ru_execution.evt_subscr_count_</code>.
     */
    public final TableField<ActRuExecutionRecord, Integer> EVT_SUBSCR_COUNT_ = createField("evt_subscr_count_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_ru_execution.task_count_</code>.
     */
    public final TableField<ActRuExecutionRecord, Integer> TASK_COUNT_ = createField("task_count_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_ru_execution.job_count_</code>.
     */
    public final TableField<ActRuExecutionRecord, Integer> JOB_COUNT_ = createField("job_count_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_ru_execution.timer_job_count_</code>.
     */
    public final TableField<ActRuExecutionRecord, Integer> TIMER_JOB_COUNT_ = createField("timer_job_count_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_ru_execution.susp_job_count_</code>.
     */
    public final TableField<ActRuExecutionRecord, Integer> SUSP_JOB_COUNT_ = createField("susp_job_count_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_ru_execution.deadletter_job_count_</code>.
     */
    public final TableField<ActRuExecutionRecord, Integer> DEADLETTER_JOB_COUNT_ = createField("deadletter_job_count_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_ru_execution.var_count_</code>.
     */
    public final TableField<ActRuExecutionRecord, Integer> VAR_COUNT_ = createField("var_count_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_ru_execution.id_link_count_</code>.
     */
    public final TableField<ActRuExecutionRecord, Integer> ID_LINK_COUNT_ = createField("id_link_count_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_ru_execution.app_version_</code>.
     */
    public final TableField<ActRuExecutionRecord, Integer> APP_VERSION_ = createField("app_version_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>workflow.act_ru_execution</code> table reference
     */
    public ActRuExecution() {
        this(DSL.name("act_ru_execution"), null);
    }

    /**
     * Create an aliased <code>workflow.act_ru_execution</code> table reference
     */
    public ActRuExecution(String alias) {
        this(DSL.name(alias), ACT_RU_EXECUTION);
    }

    /**
     * Create an aliased <code>workflow.act_ru_execution</code> table reference
     */
    public ActRuExecution(Name alias) {
        this(alias, ACT_RU_EXECUTION);
    }

    private ActRuExecution(Name alias, Table<ActRuExecutionRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActRuExecution(Name alias, Table<ActRuExecutionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ActRuExecution(Table<O> child, ForeignKey<O, ActRuExecutionRecord> key) {
        super(child, key, ACT_RU_EXECUTION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Workflow.WORKFLOW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ACT_IDX_EXE_PARENT, Indexes.ACT_IDX_EXE_PROCDEF, Indexes.ACT_IDX_EXE_PROCINST, Indexes.ACT_IDX_EXE_ROOT, Indexes.ACT_IDX_EXE_SUPER, Indexes.ACT_IDX_EXEC_BUSKEY, Indexes.ACT_RU_EXECUTION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActRuExecutionRecord> getPrimaryKey() {
        return Keys.ACT_RU_EXECUTION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActRuExecutionRecord>> getKeys() {
        return Arrays.<UniqueKey<ActRuExecutionRecord>>asList(Keys.ACT_RU_EXECUTION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ActRuExecutionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ActRuExecutionRecord, ?>>asList(Keys.ACT_RU_EXECUTION__ACT_FK_EXE_PROCINST, Keys.ACT_RU_EXECUTION__ACT_FK_EXE_PARENT, Keys.ACT_RU_EXECUTION__ACT_FK_EXE_PROCDEF, Keys.ACT_RU_EXECUTION__ACT_FK_EXE_SUPER);
    }

    public cn.com.ho.workflow.infrastructure.db.tables.ActRuExecution actRuExecution_ActFkExeProcinst() {
        return new cn.com.ho.workflow.infrastructure.db.tables.ActRuExecution(this, Keys.ACT_RU_EXECUTION__ACT_FK_EXE_PROCINST);
    }

    public cn.com.ho.workflow.infrastructure.db.tables.ActRuExecution actRuExecution_ActFkExeParent() {
        return new cn.com.ho.workflow.infrastructure.db.tables.ActRuExecution(this, Keys.ACT_RU_EXECUTION__ACT_FK_EXE_PARENT);
    }

    public ActReProcdef actReProcdef() {
        return new ActReProcdef(this, Keys.ACT_RU_EXECUTION__ACT_FK_EXE_PROCDEF);
    }

    public cn.com.ho.workflow.infrastructure.db.tables.ActRuExecution actRuExecution_ActFkExeSuper() {
        return new cn.com.ho.workflow.infrastructure.db.tables.ActRuExecution(this, Keys.ACT_RU_EXECUTION__ACT_FK_EXE_SUPER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecution as(String alias) {
        return new ActRuExecution(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecution as(Name alias) {
        return new ActRuExecution(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActRuExecution rename(String name) {
        return new ActRuExecution(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActRuExecution rename(Name name) {
        return new ActRuExecution(name, null);
    }
}
