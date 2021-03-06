/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables;


import cn.com.ho.workflow.infrastructure.db.Indexes;
import cn.com.ho.workflow.infrastructure.db.Keys;
import cn.com.ho.workflow.infrastructure.db.Workflow;
import cn.com.ho.workflow.infrastructure.db.tables.records.ActRuIdentitylinkRecord;

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
public class ActRuIdentitylink extends TableImpl<ActRuIdentitylinkRecord> {

    private static final long serialVersionUID = 1751233674;

    /**
     * The reference instance of <code>workflow.act_ru_identitylink</code>
     */
    public static final ActRuIdentitylink ACT_RU_IDENTITYLINK = new ActRuIdentitylink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActRuIdentitylinkRecord> getRecordType() {
        return ActRuIdentitylinkRecord.class;
    }

    /**
     * The column <code>workflow.act_ru_identitylink.id_</code>.
     */
    public final TableField<ActRuIdentitylinkRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>workflow.act_ru_identitylink.rev_</code>.
     */
    public final TableField<ActRuIdentitylinkRecord, Integer> REV_ = createField("rev_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_ru_identitylink.group_id_</code>.
     */
    public final TableField<ActRuIdentitylinkRecord, String> GROUP_ID_ = createField("group_id_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_ru_identitylink.type_</code>.
     */
    public final TableField<ActRuIdentitylinkRecord, String> TYPE_ = createField("type_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_ru_identitylink.user_id_</code>.
     */
    public final TableField<ActRuIdentitylinkRecord, String> USER_ID_ = createField("user_id_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_ru_identitylink.task_id_</code>.
     */
    public final TableField<ActRuIdentitylinkRecord, String> TASK_ID_ = createField("task_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>workflow.act_ru_identitylink.proc_inst_id_</code>.
     */
    public final TableField<ActRuIdentitylinkRecord, String> PROC_INST_ID_ = createField("proc_inst_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>workflow.act_ru_identitylink.proc_def_id_</code>.
     */
    public final TableField<ActRuIdentitylinkRecord, String> PROC_DEF_ID_ = createField("proc_def_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>workflow.act_ru_identitylink</code> table reference
     */
    public ActRuIdentitylink() {
        this(DSL.name("act_ru_identitylink"), null);
    }

    /**
     * Create an aliased <code>workflow.act_ru_identitylink</code> table reference
     */
    public ActRuIdentitylink(String alias) {
        this(DSL.name(alias), ACT_RU_IDENTITYLINK);
    }

    /**
     * Create an aliased <code>workflow.act_ru_identitylink</code> table reference
     */
    public ActRuIdentitylink(Name alias) {
        this(alias, ACT_RU_IDENTITYLINK);
    }

    private ActRuIdentitylink(Name alias, Table<ActRuIdentitylinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActRuIdentitylink(Name alias, Table<ActRuIdentitylinkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ActRuIdentitylink(Table<O> child, ForeignKey<O, ActRuIdentitylinkRecord> key) {
        super(child, key, ACT_RU_IDENTITYLINK);
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
        return Arrays.<Index>asList(Indexes.ACT_IDX_ATHRZ_PROCEDEF, Indexes.ACT_IDX_IDENT_LNK_GROUP, Indexes.ACT_IDX_IDENT_LNK_USER, Indexes.ACT_IDX_IDL_PROCINST, Indexes.ACT_IDX_TSKASS_TASK, Indexes.ACT_RU_IDENTITYLINK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActRuIdentitylinkRecord> getPrimaryKey() {
        return Keys.ACT_RU_IDENTITYLINK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActRuIdentitylinkRecord>> getKeys() {
        return Arrays.<UniqueKey<ActRuIdentitylinkRecord>>asList(Keys.ACT_RU_IDENTITYLINK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ActRuIdentitylinkRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ActRuIdentitylinkRecord, ?>>asList(Keys.ACT_RU_IDENTITYLINK__ACT_FK_TSKASS_TASK, Keys.ACT_RU_IDENTITYLINK__ACT_FK_IDL_PROCINST, Keys.ACT_RU_IDENTITYLINK__ACT_FK_ATHRZ_PROCEDEF);
    }

    public ActRuTask actRuTask() {
        return new ActRuTask(this, Keys.ACT_RU_IDENTITYLINK__ACT_FK_TSKASS_TASK);
    }

    public ActRuExecution actRuExecution() {
        return new ActRuExecution(this, Keys.ACT_RU_IDENTITYLINK__ACT_FK_IDL_PROCINST);
    }

    public ActReProcdef actReProcdef() {
        return new ActReProcdef(this, Keys.ACT_RU_IDENTITYLINK__ACT_FK_ATHRZ_PROCEDEF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuIdentitylink as(String alias) {
        return new ActRuIdentitylink(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuIdentitylink as(Name alias) {
        return new ActRuIdentitylink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActRuIdentitylink rename(String name) {
        return new ActRuIdentitylink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActRuIdentitylink rename(Name name) {
        return new ActRuIdentitylink(name, null);
    }
}
