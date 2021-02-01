package cn.com.ho.workflow.infrastructure.actRepository.impl;

import cn.com.ho.workflow.infrastructure.actRepository.ActReDeploymentRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by HOZANDUNG on 2021/1/29
 */
@Component
public class ActReDeploymentRepositoryImpl implements ActReDeploymentRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.ActReDeployment ActReDeployment
            = cn.com.ho.workflow.infrastructure.db.tables.ActReDeployment.ACT_RE_DEPLOYMENT;

    @Override
    public List<String> selectAllDeploymentId() {
        return dslContext
                .select(ActReDeployment.ID_).from(ActReDeployment)
                .fetchInto(String.class);
    }
}
