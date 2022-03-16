create table workflow.act_hi_attachment
(
    id_           varchar(64) not null
        constraint act_hi_attachment_pkey
            primary key,
    rev_          integer,
    user_id_      varchar(255),
    name_         varchar(255),
    description_  varchar(4000),
    type_         varchar(255),
    task_id_      varchar(64),
    proc_inst_id_ varchar(64),
    url_          varchar(4000),
    content_id_   varchar(64),
    time_         timestamp
);

alter table workflow.act_hi_attachment
    owner to xdeas_dev;

create table workflow.act_hi_actinst
(
    id_                varchar(64)  not null
        constraint act_hi_actinst_pkey
            primary key,
    proc_def_id_       varchar(64)  not null,
    proc_inst_id_      varchar(64)  not null,
    execution_id_      varchar(64)  not null,
    act_id_            varchar(255) not null,
    task_id_           varchar(64),
    call_proc_inst_id_ varchar(64),
    act_name_          varchar(255),
    act_type_          varchar(255) not null,
    assignee_          varchar(255),
    start_time_        timestamp    not null,
    end_time_          timestamp,
    duration_          bigint,
    delete_reason_     varchar(4000),
    tenant_id_         varchar(255) default ''::character varying
);

alter table workflow.act_hi_actinst
    owner to xdeas_dev;

create index act_idx_hi_act_inst_procinst
    on workflow.act_hi_actinst (proc_inst_id_, act_id_);

create index act_idx_hi_act_inst_end
    on workflow.act_hi_actinst (end_time_);

create index act_idx_hi_act_inst_start
    on workflow.act_hi_actinst (start_time_);

create index act_idx_hi_act_inst_exec
    on workflow.act_hi_actinst (execution_id_, act_id_);

create table workflow.act_hi_comment
(
    id_           varchar(64) not null
        constraint act_hi_comment_pkey
            primary key,
    type_         varchar(255),
    time_         timestamp   not null,
    user_id_      varchar(255),
    task_id_      varchar(64),
    proc_inst_id_ varchar(64),
    action_       varchar(255),
    message_      varchar(4000),
    full_msg_     bytea
);

alter table workflow.act_hi_comment
    owner to xdeas_dev;

create table workflow.act_ge_property
(
    name_  varchar(64) not null
        constraint act_ge_property_pkey
            primary key,
    value_ varchar(300),
    rev_   integer
);

alter table workflow.act_ge_property
    owner to xdeas_dev;

create table workflow.act_re_deployment
(
    id_                      varchar(64) not null
        constraint act_re_deployment_pkey
            primary key,
    name_                    varchar(255),
    category_                varchar(255),
    key_                     varchar(255),
    tenant_id_               varchar(255) default ''::character varying,
    deploy_time_             timestamp,
    engine_version_          varchar(255),
    version_                 integer      default 1,
    project_release_version_ varchar(255)
);

alter table workflow.act_re_deployment
    owner to xdeas_dev;

create table workflow.act_ge_bytearray
(
    id_            varchar(64) not null
        constraint act_ge_bytearray_pkey
            primary key,
    rev_           integer,
    name_          varchar(255),
    deployment_id_ varchar(64)
        constraint act_fk_bytearr_depl
            references workflow.act_re_deployment,
    bytes_         bytea,
    generated_     boolean
);

alter table workflow.act_ge_bytearray
    owner to xdeas_dev;

create table workflow.act_re_model
(
    id_                           varchar(64) not null
        constraint act_re_model_pkey
            primary key,
    rev_                          integer,
    name_                         varchar(255),
    key_                          varchar(255),
    category_                     varchar(255),
    create_time_                  timestamp,
    last_update_time_             timestamp,
    version_                      integer,
    meta_info_                    varchar(4000),
    deployment_id_                varchar(64)
        constraint act_fk_model_deployment
            references workflow.act_re_deployment,
    editor_source_value_id_       varchar(64)
        constraint act_fk_model_source
            references workflow.act_ge_bytearray,
    editor_source_extra_value_id_ varchar(64)
        constraint act_fk_model_source_extra
            references workflow.act_ge_bytearray,
    tenant_id_                    varchar(255) default ''::character varying
);

alter table workflow.act_re_model
    owner to xdeas_dev;

create index act_idx_model_deployment
    on workflow.act_re_model (deployment_id_);

create index act_idx_model_source
    on workflow.act_re_model (editor_source_value_id_);

create index act_idx_model_source_extra
    on workflow.act_re_model (editor_source_extra_value_id_);

create index act_idx_bytear_depl
    on workflow.act_ge_bytearray (deployment_id_);

create table workflow.act_evt_log
(
    log_nr_       integer  default nextval('act_evt_log_log_nr__seq'::regclass) not null
        constraint act_evt_log_pkey
            primary key,
    type_         varchar(64),
    proc_def_id_  varchar(64),
    proc_inst_id_ varchar(64),
    execution_id_ varchar(64),
    task_id_      varchar(64),
    time_stamp_   timestamp                                                     not null,
    user_id_      varchar(255),
    data_         bytea,
    lock_owner_   varchar(255),
    lock_time_    timestamp,
    is_processed_ smallint default 0
);

alter table workflow.act_evt_log
    owner to xdeas_dev;

create table workflow.act_hi_varinst
(
    id_                varchar(64)  not null
        constraint act_hi_varinst_pkey
            primary key,
    proc_inst_id_      varchar(64),
    execution_id_      varchar(64),
    task_id_           varchar(64),
    name_              varchar(255) not null,
    var_type_          varchar(100),
    rev_               integer,
    bytearray_id_      varchar(64),
    double_            double precision,
    long_              bigint,
    text_              varchar(4000),
    text2_             varchar(4000),
    create_time_       timestamp,
    last_updated_time_ timestamp
);

alter table workflow.act_hi_varinst
    owner to xdeas_dev;

create index act_idx_hi_procvar_name_type
    on workflow.act_hi_varinst (name_, var_type_);

create index act_idx_hi_procvar_task_id
    on workflow.act_hi_varinst (task_id_);

create index act_idx_hi_procvar_proc_inst
    on workflow.act_hi_varinst (proc_inst_id_);

create table workflow.act_hi_procinst
(
    id_                        varchar(64) not null
        constraint act_hi_procinst_pkey
            primary key,
    proc_inst_id_              varchar(64) not null
        constraint act_hi_procinst_proc_inst_id__key
            unique,
    business_key_              varchar(255),
    proc_def_id_               varchar(64) not null,
    start_time_                timestamp   not null,
    end_time_                  timestamp,
    duration_                  bigint,
    start_user_id_             varchar(255),
    start_act_id_              varchar(255),
    end_act_id_                varchar(255),
    super_process_instance_id_ varchar(64),
    delete_reason_             varchar(4000),
    tenant_id_                 varchar(255) default ''::character varying,
    name_                      varchar(255)
);

alter table workflow.act_hi_procinst
    owner to xdeas_dev;

create index act_idx_hi_pro_i_buskey
    on workflow.act_hi_procinst (business_key_);

create index act_idx_hi_pro_inst_end
    on workflow.act_hi_procinst (end_time_);

create table workflow.act_hi_taskinst
(
    id_             varchar(64) not null
        constraint act_hi_taskinst_pkey
            primary key,
    proc_def_id_    varchar(64),
    task_def_key_   varchar(255),
    proc_inst_id_   varchar(64),
    execution_id_   varchar(64),
    name_           varchar(255),
    parent_task_id_ varchar(64),
    description_    varchar(4000),
    owner_          varchar(255),
    assignee_       varchar(255),
    start_time_     timestamp   not null,
    claim_time_     timestamp,
    end_time_       timestamp,
    duration_       bigint,
    delete_reason_  varchar(4000),
    priority_       integer,
    due_date_       timestamp,
    form_key_       varchar(255),
    category_       varchar(255),
    tenant_id_      varchar(255) default ''::character varying
);

alter table workflow.act_hi_taskinst
    owner to xdeas_dev;

create index act_idx_hi_task_inst_procinst
    on workflow.act_hi_taskinst (proc_inst_id_);

create table workflow.act_hi_detail
(
    id_           varchar(64)  not null
        constraint act_hi_detail_pkey
            primary key,
    type_         varchar(255) not null,
    proc_inst_id_ varchar(64),
    execution_id_ varchar(64),
    task_id_      varchar(64),
    act_inst_id_  varchar(64),
    name_         varchar(255) not null,
    var_type_     varchar(64),
    rev_          integer,
    time_         timestamp    not null,
    bytearray_id_ varchar(64),
    double_       double precision,
    long_         bigint,
    text_         varchar(4000),
    text2_        varchar(4000)
);

alter table workflow.act_hi_detail
    owner to xdeas_dev;

create index act_idx_hi_detail_act_inst
    on workflow.act_hi_detail (act_inst_id_);

create index act_idx_hi_detail_name
    on workflow.act_hi_detail (name_);

create index act_idx_hi_detail_task_id
    on workflow.act_hi_detail (task_id_);

create index act_idx_hi_detail_proc_inst
    on workflow.act_hi_detail (proc_inst_id_);

create index act_idx_hi_detail_time
    on workflow.act_hi_detail (time_);

create table workflow.act_hi_identitylink
(
    id_           varchar(64) not null
        constraint act_hi_identitylink_pkey
            primary key,
    group_id_     varchar(255),
    type_         varchar(255),
    user_id_      varchar(255),
    task_id_      varchar(64),
    proc_inst_id_ varchar(64)
);

alter table workflow.act_hi_identitylink
    owner to xdeas_dev;

create index act_idx_hi_ident_lnk_task
    on workflow.act_hi_identitylink (task_id_);

create index act_idx_hi_ident_lnk_user
    on workflow.act_hi_identitylink (user_id_);

create index act_idx_hi_ident_lnk_procinst
    on workflow.act_hi_identitylink (proc_inst_id_);

create table workflow.act_re_procdef
(
    id_                     varchar(64)  not null
        constraint act_re_procdef_pkey
            primary key,
    rev_                    integer,
    category_               varchar(255),
    name_                   varchar(255),
    key_                    varchar(255) not null,
    version_                integer      not null,
    deployment_id_          varchar(64),
    resource_name_          varchar(4000),
    dgrm_resource_name_     varchar(4000),
    description_            varchar(4000),
    has_start_form_key_     boolean,
    has_graphical_notation_ boolean,
    suspension_state_       integer,
    tenant_id_              varchar(255) default ''::character varying,
    engine_version_         varchar(255),
    app_version_            integer,
    constraint act_uniq_procdef
        unique (key_, version_, tenant_id_)
);

alter table workflow.act_re_procdef
    owner to xdeas_dev;

create table workflow.act_ru_execution
(
    id_                   varchar(64) not null
        constraint act_ru_execution_pkey
            primary key,
    rev_                  integer,
    proc_inst_id_         varchar(64)
        constraint act_fk_exe_procinst
            references workflow.act_ru_execution,
    business_key_         varchar(255),
    parent_id_            varchar(64)
        constraint act_fk_exe_parent
            references workflow.act_ru_execution,
    proc_def_id_          varchar(64)
        constraint act_fk_exe_procdef
            references workflow.act_re_procdef,
    super_exec_           varchar(64)
        constraint act_fk_exe_super
            references workflow.act_ru_execution,
    root_proc_inst_id_    varchar(64),
    act_id_               varchar(255),
    is_active_            boolean,
    is_concurrent_        boolean,
    is_scope_             boolean,
    is_event_scope_       boolean,
    is_mi_root_           boolean,
    suspension_state_     integer,
    cached_ent_state_     integer,
    tenant_id_            varchar(255) default ''::character varying,
    name_                 varchar(255),
    start_time_           timestamp,
    start_user_id_        varchar(255),
    lock_time_            timestamp,
    is_count_enabled_     boolean,
    evt_subscr_count_     integer,
    task_count_           integer,
    job_count_            integer,
    timer_job_count_      integer,
    susp_job_count_       integer,
    deadletter_job_count_ integer,
    var_count_            integer,
    id_link_count_        integer,
    app_version_          integer
);

alter table workflow.act_ru_execution
    owner to xdeas_dev;

create table workflow.act_ru_integration
(
    id_                  varchar(64) not null
        constraint act_ru_integration_pkey
            primary key,
    execution_id_        varchar(64)
        constraint act_fk_int_execution
            references workflow.act_ru_execution
            on delete cascade,
    process_instance_id_ varchar(64)
        constraint act_fk_int_proc_inst
            references workflow.act_ru_execution,
    proc_def_id_         varchar(64)
        constraint act_fk_int_proc_def
            references workflow.act_re_procdef,
    flow_node_id_        varchar(64),
    created_date_        timestamp
);

alter table workflow.act_ru_integration
    owner to xdeas_dev;

create index act_idx_exe_procinst
    on workflow.act_ru_execution (proc_inst_id_);

create index act_idx_exe_parent
    on workflow.act_ru_execution (parent_id_);

create index act_idx_exe_root
    on workflow.act_ru_execution (root_proc_inst_id_);

create index act_idx_exec_buskey
    on workflow.act_ru_execution (business_key_);

create index act_idx_exe_super
    on workflow.act_ru_execution (super_exec_);

create index act_idx_exe_procdef
    on workflow.act_ru_execution (proc_def_id_);

create table workflow.act_procdef_info
(
    id_           varchar(64) not null
        constraint act_procdef_info_pkey
            primary key,
    proc_def_id_  varchar(64) not null
        constraint act_uniq_info_procdef
            unique
        constraint act_fk_info_procdef
            references workflow.act_re_procdef,
    rev_          integer,
    info_json_id_ varchar(64)
        constraint act_fk_info_json_ba
            references workflow.act_ge_bytearray
);

alter table workflow.act_procdef_info
    owner to xdeas_dev;

create index act_idx_procdef_info_proc
    on workflow.act_procdef_info (proc_def_id_);

create index act_idx_procdef_info_json
    on workflow.act_procdef_info (info_json_id_);

create table workflow.act_ru_event_subscr
(
    id_            varchar(64)  not null
        constraint act_ru_event_subscr_pkey
            primary key,
    rev_           integer,
    event_type_    varchar(255) not null,
    event_name_    varchar(255),
    execution_id_  varchar(64)
        constraint act_fk_event_exec
            references workflow.act_ru_execution,
    proc_inst_id_  varchar(64),
    activity_id_   varchar(64),
    configuration_ varchar(255),
    created_       timestamp    not null,
    proc_def_id_   varchar(64),
    tenant_id_     varchar(255) default ''::character varying
);

alter table workflow.act_ru_event_subscr
    owner to xdeas_dev;

create index act_idx_event_subscr_config_
    on workflow.act_ru_event_subscr (configuration_);

create index act_idx_event_subscr
    on workflow.act_ru_event_subscr (execution_id_);

create table workflow.act_ru_deadletter_job
(
    id_                  varchar(64)  not null
        constraint act_ru_deadletter_job_pkey
            primary key,
    rev_                 integer,
    type_                varchar(255) not null,
    exclusive_           boolean,
    execution_id_        varchar(64)
        constraint act_fk_deadletter_job_execution
            references workflow.act_ru_execution,
    process_instance_id_ varchar(64)
        constraint act_fk_deadletter_job_process_instance
            references workflow.act_ru_execution,
    proc_def_id_         varchar(64)
        constraint act_fk_deadletter_job_proc_def
            references workflow.act_re_procdef,
    exception_stack_id_  varchar(64)
        constraint act_fk_deadletter_job_exception
            references workflow.act_ge_bytearray,
    exception_msg_       varchar(4000),
    duedate_             timestamp,
    repeat_              varchar(255),
    handler_type_        varchar(255),
    handler_cfg_         varchar(4000),
    tenant_id_           varchar(255) default ''::character varying
);

alter table workflow.act_ru_deadletter_job
    owner to xdeas_dev;

create index act_idx_deadletter_job_execution_id
    on workflow.act_ru_deadletter_job (execution_id_);

create index act_idx_deadletter_job_process_instance_id
    on workflow.act_ru_deadletter_job (process_instance_id_);

create index act_idx_deadletter_job_proc_def_id
    on workflow.act_ru_deadletter_job (proc_def_id_);

create index act_idx_deadletter_job_exception
    on workflow.act_ru_deadletter_job (exception_stack_id_);

create table workflow.act_ru_timer_job
(
    id_                  varchar(64)  not null
        constraint act_ru_timer_job_pkey
            primary key,
    rev_                 integer,
    type_                varchar(255) not null,
    lock_exp_time_       timestamp,
    lock_owner_          varchar(255),
    exclusive_           boolean,
    execution_id_        varchar(64)
        constraint act_fk_timer_job_execution
            references workflow.act_ru_execution,
    process_instance_id_ varchar(64)
        constraint act_fk_timer_job_process_instance
            references workflow.act_ru_execution,
    proc_def_id_         varchar(64)
        constraint act_fk_timer_job_proc_def
            references workflow.act_re_procdef,
    retries_             integer,
    exception_stack_id_  varchar(64)
        constraint act_fk_timer_job_exception
            references workflow.act_ge_bytearray,
    exception_msg_       varchar(4000),
    duedate_             timestamp,
    repeat_              varchar(255),
    handler_type_        varchar(255),
    handler_cfg_         varchar(4000),
    tenant_id_           varchar(255) default ''::character varying
);

alter table workflow.act_ru_timer_job
    owner to xdeas_dev;

create index act_idx_timer_job_exception
    on workflow.act_ru_timer_job (exception_stack_id_);

create index act_idx_timer_job_execution_id
    on workflow.act_ru_timer_job (execution_id_);

create index act_idx_timer_job_proc_def_id
    on workflow.act_ru_timer_job (proc_def_id_);

create index act_idx_timer_job_process_instance_id
    on workflow.act_ru_timer_job (process_instance_id_);

create table workflow.act_ru_job
(
    id_                  varchar(64)  not null
        constraint act_ru_job_pkey
            primary key,
    rev_                 integer,
    type_                varchar(255) not null,
    lock_exp_time_       timestamp,
    lock_owner_          varchar(255),
    exclusive_           boolean,
    execution_id_        varchar(64)
        constraint act_fk_job_execution
            references workflow.act_ru_execution,
    process_instance_id_ varchar(64)
        constraint act_fk_job_process_instance
            references workflow.act_ru_execution,
    proc_def_id_         varchar(64)
        constraint act_fk_job_proc_def
            references workflow.act_re_procdef,
    retries_             integer,
    exception_stack_id_  varchar(64)
        constraint act_fk_job_exception
            references workflow.act_ge_bytearray,
    exception_msg_       varchar(4000),
    duedate_             timestamp,
    repeat_              varchar(255),
    handler_type_        varchar(255),
    handler_cfg_         varchar(4000),
    tenant_id_           varchar(255) default ''::character varying
);

alter table workflow.act_ru_job
    owner to xdeas_dev;

create index act_idx_job_exception
    on workflow.act_ru_job (exception_stack_id_);

create index act_idx_job_execution_id
    on workflow.act_ru_job (execution_id_);

create index act_idx_job_process_instance_id
    on workflow.act_ru_job (process_instance_id_);

create index act_idx_job_proc_def_id
    on workflow.act_ru_job (proc_def_id_);

create table workflow.act_ru_suspended_job
(
    id_                  varchar(64)  not null
        constraint act_ru_suspended_job_pkey
            primary key,
    rev_                 integer,
    type_                varchar(255) not null,
    exclusive_           boolean,
    execution_id_        varchar(64)
        constraint act_fk_suspended_job_execution
            references workflow.act_ru_execution,
    process_instance_id_ varchar(64)
        constraint act_fk_suspended_job_process_instance
            references workflow.act_ru_execution,
    proc_def_id_         varchar(64)
        constraint act_fk_suspended_job_proc_def
            references workflow.act_re_procdef,
    retries_             integer,
    exception_stack_id_  varchar(64)
        constraint act_fk_suspended_job_exception
            references workflow.act_ge_bytearray,
    exception_msg_       varchar(4000),
    duedate_             timestamp,
    repeat_              varchar(255),
    handler_type_        varchar(255),
    handler_cfg_         varchar(4000),
    tenant_id_           varchar(255) default ''::character varying
);

alter table workflow.act_ru_suspended_job
    owner to xdeas_dev;

create index act_idx_suspended_job_execution_id
    on workflow.act_ru_suspended_job (execution_id_);

create index act_idx_suspended_job_exception
    on workflow.act_ru_suspended_job (exception_stack_id_);

create index act_idx_suspended_job_proc_def_id
    on workflow.act_ru_suspended_job (proc_def_id_);

create index act_idx_suspended_job_process_instance_id
    on workflow.act_ru_suspended_job (process_instance_id_);

create table workflow.act_ru_task
(
    id_               varchar(64) not null
        constraint act_ru_task_pkey
            primary key,
    rev_              integer,
    execution_id_     varchar(64)
        constraint act_fk_task_exe
            references workflow.act_ru_execution,
    proc_inst_id_     varchar(64)
        constraint act_fk_task_procinst
            references workflow.act_ru_execution,
    proc_def_id_      varchar(64)
        constraint act_fk_task_procdef
            references workflow.act_re_procdef,
    name_             varchar(255),
    business_key_     varchar(255),
    parent_task_id_   varchar(64),
    description_      varchar(4000),
    task_def_key_     varchar(255),
    owner_            varchar(255),
    assignee_         varchar(255),
    delegation_       varchar(64),
    priority_         integer,
    create_time_      timestamp,
    due_date_         timestamp,
    category_         varchar(255),
    suspension_state_ integer,
    tenant_id_        varchar(255) default ''::character varying,
    form_key_         varchar(255),
    claim_time_       timestamp,
    app_version_      integer
);

alter table workflow.act_ru_task
    owner to xdeas_dev;

create table workflow.act_ru_identitylink
(
    id_           varchar(64) not null
        constraint act_ru_identitylink_pkey
            primary key,
    rev_          integer,
    group_id_     varchar(255),
    type_         varchar(255),
    user_id_      varchar(255),
    task_id_      varchar(64)
        constraint act_fk_tskass_task
            references workflow.act_ru_task,
    proc_inst_id_ varchar(64)
        constraint act_fk_idl_procinst
            references workflow.act_ru_execution,
    proc_def_id_  varchar(64)
        constraint act_fk_athrz_procedef
            references workflow.act_re_procdef
);

alter table workflow.act_ru_identitylink
    owner to xdeas_dev;

create index act_idx_athrz_procedef
    on workflow.act_ru_identitylink (proc_def_id_);

create index act_idx_ident_lnk_group
    on workflow.act_ru_identitylink (group_id_);

create index act_idx_idl_procinst
    on workflow.act_ru_identitylink (proc_inst_id_);

create index act_idx_ident_lnk_user
    on workflow.act_ru_identitylink (user_id_);

create index act_idx_tskass_task
    on workflow.act_ru_identitylink (task_id_);

create index act_idx_task_create
    on workflow.act_ru_task (create_time_);

create index act_idx_task_exec
    on workflow.act_ru_task (execution_id_);

create index act_idx_task_procdef
    on workflow.act_ru_task (proc_def_id_);

create index act_idx_task_procinst
    on workflow.act_ru_task (proc_inst_id_);

create table workflow.act_ru_variable
(
    id_           varchar(64)  not null
        constraint act_ru_variable_pkey
            primary key,
    rev_          integer,
    type_         varchar(255) not null,
    name_         varchar(255) not null,
    execution_id_ varchar(64)
        constraint act_fk_var_exe
            references workflow.act_ru_execution,
    proc_inst_id_ varchar(64)
        constraint act_fk_var_procinst
            references workflow.act_ru_execution,
    task_id_      varchar(64),
    bytearray_id_ varchar(64)
        constraint act_fk_var_bytearray
            references workflow.act_ge_bytearray,
    double_       double precision,
    long_         bigint,
    text_         varchar(4000),
    text2_        varchar(4000)
);

alter table workflow.act_ru_variable
    owner to xdeas_dev;

create index act_idx_variable_task_id
    on workflow.act_ru_variable (task_id_);

create index act_idx_var_bytearray
    on workflow.act_ru_variable (bytearray_id_);

create index act_idx_var_exe
    on workflow.act_ru_variable (execution_id_);

create index act_idx_var_procinst
    on workflow.act_ru_variable (proc_inst_id_);

create table workflow.bpm_conf_form
(
    id               varchar not null
        constraint bpm_conf_form_pk
            primary key,
    value            varchar,
    type             varchar,
    status           varchar,
    node_id          varchar,
    mobile_form      varchar,
    process_model_id varchar,
    expr_rule        varchar,
    create_time      timestamp,
    update_time      timestamp,
    node_name        varchar,
    node_code        varchar,
    create_by        varchar,
    update_by        varchar
);

comment on table workflow.bpm_conf_form is '流程模型设置表单';

alter table workflow.bpm_conf_form
    owner to xdeas_dev;

create table workflow.bpm_conf_countersign
(
    id               varchar not null
        constraint bpm_conf_countersign_pk
            primary key,
    sequential       varchar,
    participant      varchar,
    type             varchar,
    rate             varchar,
    node_id          varchar,
    process_model_id varchar,
    status           varchar,
    node_name        varchar,
    node_code        varchar
);

comment on column workflow.bpm_conf_countersign.sequential is '串行/并行';

comment on column workflow.bpm_conf_countersign.participant is '参与者';

alter table workflow.bpm_conf_countersign
    owner to xdeas_dev;

create table workflow.bpm_conf_listener
(
    id               varchar not null
        constraint bpm_conf_listener_pk
            primary key,
    value            varchar,
    type             varchar,
    status           varchar,
    priority         integer,
    node_id          varchar,
    process_model_id varchar,
    ext_status       integer,
    create_time      timestamp,
    update_time      timestamp,
    create_by        varchar,
    update_by        varchar,
    node_name        varchar,
    node_code        varchar,
    bean_name        varchar
);

comment on table workflow.bpm_conf_listener is '流程模型设置监听器';

alter table workflow.bpm_conf_listener
    owner to xdeas_dev;

create table workflow.dts_postgres_heartbeat
(
    slot_name        varchar(64) not null
        constraint dts_postgres_heartbeat_pkey
            primary key,
    revice_time      bigint,
    revice_lsn       varchar(64),
    flushed_lsn      varchar(64),
    update_time      timestamp with time zone,
    dts_service_time bigint
);

alter table workflow.dts_postgres_heartbeat
    owner to xdeas_dev;

create table workflow.bpm_conf_user
(
    id               varchar not null
        constraint bpm_conf_user_pk
            primary key,
    value            varchar,
    type             varchar,
    status           varchar,
    priority         integer,
    node_id          varchar,
    process_model_id varchar,
    create_time      timestamp,
    update_time      timestamp,
    create_by        varchar,
    update_by        varchar,
    expr_user        varchar,
    is_depart        varchar,
    node_name        varchar,
    depart_level     char,
    val_cn           varchar,
    node_code        varchar,
    value_text       varchar
);

alter table workflow.bpm_conf_user
    owner to xdeas_dev;

create table workflow.bpm_conf_node
(
    id             varchar not null
        constraint bpm_conf_node_pk
            primary key,
    code           varchar,
    name           varchar,
    type           varchar,
    conf_user      integer,
    conf_listener  integer,
    conf_rule      integer,
    conf_form      integer,
    conf_operation integer,
    conf_notice    integer,
    priority       integer,
    conf_base_id   varchar,
    skip           varchar,
    status         varchar,
    create_time    timestamp,
    update_time    timestamp,
    create_by      varchar,
    update_by      varchar,
    skip_node_expr varchar,
    user_dept_role varchar,
    grab_order     varchar,
    model_name     varchar
);

alter table workflow.bpm_conf_node
    owner to xdeas_dev;

create table workflow.bpm_conf_rule
(
    id               varchar not null
        constraint bpm_conf_rule_pk
            primary key,
    value            varchar,
    node_id          varchar,
    process_model_id varchar,
    status           varchar,
    create_time      timestamp,
    update_time      timestamp,
    create_by        varchar,
    update_by        varchar,
    node_name        varchar,
    node_code        varchar
);

alter table workflow.bpm_conf_rule
    owner to xdeas_dev;

create table workflow.bpm_conf_notice
(
    id                varchar not null
        constraint bpm_conf_notice_pk
            primary key,
    type              varchar,
    receiver          varchar,
    due_date          varchar,
    node_id           varchar,
    template_id       varchar,
    template_code     varchar,
    notification_type varchar,
    process_model_id  varchar,
    status            varchar,
    create_time       timestamp,
    update_time       timestamp,
    create_by         varchar,
    update_by         varchar,
    node_name         varchar,
    node_code         varchar
);

comment on table workflow.bpm_conf_notice is '流程模型设置通知';

alter table workflow.bpm_conf_notice
    owner to xdeas_dev;

create table workflow.bpm_conf_operation
(
    id               varchar not null
        constraint bpm_conf_operation_pk
            primary key,
    value            varchar,
    priority         integer,
    node_id          varchar,
    process_model_id varchar,
    status           varchar,
    flow_method      varchar,
    op_jsname        varchar,
    op_url           varchar,
    op_expr          varchar,
    create_time      timestamp,
    update_time      timestamp,
    create_by        varchar,
    update_by        varchar,
    btn_class        varchar,
    opjs_param       varchar,
    mop_jsname       varchar,
    mop_url          varchar,
    mop_class        varchar,
    node_name        varchar,
    node_code        varchar
);

alter table workflow.bpm_conf_operation
    owner to xdeas_dev;

create table workflow.t_p_process
(
    id          varchar not null
        constraint t_p_process_pk
            primary key,
    name        varchar,
    status      varchar,
    process_xml text,
    bus_table   varchar,
    bpmn_xml    text,
    create_time timestamp,
    create_by   varchar,
    update_time timestamp,
    update_by   varchar,
    remark      varchar,
    process_key varchar,
    model_id    varchar
);

alter table workflow.t_p_process
    owner to xdeas_dev;

create table workflow.t_p_proc_def_xml
(
    proc_def_id varchar not null
        constraint t_p_proc_def_xml_pkey
            primary key,
    name        varchar,
    process_xml text,
    bpmn_xml    text
);

alter table workflow.t_p_proc_def_xml
    owner to xdeas_dev;

create table workflow.task_def_base
(
    id                    varchar not null
        constraint task_def_base_pk
            primary key,
    code                  varchar,
    name                  varchar,
    process_definition_id varchar,
    status                varchar default 1,
    skip                  varchar default 0,
    countersign_rate      integer,
    countersign_strategy  varchar,
    countersign_user      varchar,
    countersign_type      varchar,
    assign_strategy       varchar,
    create_time           timestamp,
    update_time           timestamp,
    create_by             varchar,
    update_by             varchar,
    use_dept_role         varchar default 0,
    grab_order            varchar default 0,
    skip_node_expr        varchar
);

alter table workflow.task_def_base
    owner to xdeas_dev;

create table workflow.task_def_form
(
    id                    varchar not null
        constraint task_def_form_pk
            primary key,
    value                 varchar,
    type                  varchar,
    status                varchar default 1,
    node_code             varchar,
    node_name             varchar,
    mobile_form_key       varchar,
    process_definition_id varchar,
    base_id               varchar,
    expr_rule             varchar,
    create_time           timestamp,
    update_time           timestamp,
    create_by             varchar,
    update_by             varchar
);

alter table workflow.task_def_form
    owner to xdeas_dev;

create table workflow.task_def_listener
(
    id                    varchar not null
        constraint task_def_listener_pk
            primary key,
    value                 varchar,
    type                  varchar,
    base_id               varchar,
    process_definition_id varchar,
    status                varchar default 1,
    node_code             varchar,
    ext_status            varchar default 1,
    create_time           timestamp,
    update_time           timestamp,
    create_by             varchar,
    update_by             varchar,
    node_name             varchar,
    bean_name             varchar
);

alter table workflow.task_def_listener
    owner to xdeas_dev;

create table workflow.task_def_notification
(
    id                    varchar not null
        constraint task_def_notification_pkey
            primary key,
    event_name            varchar,
    receiver              varchar,
    type                  varchar,
    template_code         varchar,
    base_id               varchar,
    process_definition_id varchar,
    status                varchar default 1,
    node_code             varchar,
    create_time           timestamp,
    update_time           timestamp,
    create_by             varchar,
    update_by             varchar,
    node_name             varchar
);

alter table workflow.task_def_notification
    owner to xdeas_dev;

create table workflow.task_def_operation
(
    id                    varchar not null
        constraint task_def_operation_pk
            primary key,
    value                 varchar,
    status                varchar default 1,
    priority              integer,
    base_id               varchar,
    process_definition_id varchar,
    flow_method           varchar,
    op_js_name            varchar,
    op_url                varchar,
    op_expr               varchar,
    node_code             varchar,
    create_time           timestamp,
    update_time           timestamp,
    create_by             varchar,
    update_by             varchar,
    btn_class             varchar,
    op_js_param           varchar,
    mop_js_name           varchar,
    mop_url               varchar,
    mb_tn_class           varchar,
    node_name             varchar
);

alter table workflow.task_def_operation
    owner to xdeas_dev;

create table workflow.task_def_rule
(
    id                    varchar not null
        constraint task_def_rule_pk
            primary key,
    value                 varchar,
    status                varchar default 1,
    node_code             varchar,
    process_definition_id varchar,
    base_id               varchar,
    create_time           timestamp,
    update_time           timestamp,
    create_by             varchar,
    update_by             varchar,
    node_name             varchar
);

alter table workflow.task_def_rule
    owner to xdeas_dev;

create table workflow.task_def_user
(
    id                    varchar not null
        constraint task_def_user_pk
            primary key,
    value                 varchar,
    type                  varchar,
    catalog               varchar,
    base_id               varchar,
    process_definition_id varchar,
    status                varchar default 1,
    node_code             varchar,
    create_time           timestamp,
    update_time           timestamp,
    create_by             varchar,
    update_by             varchar,
    expr_user             varchar,
    is_depart             varchar default 0,
    node_name             varchar,
    priority              integer,
    depart_level          varchar,
    val_cn                varchar,
    value_text            varchar
);

alter table workflow.task_def_user
    owner to xdeas_dev;

