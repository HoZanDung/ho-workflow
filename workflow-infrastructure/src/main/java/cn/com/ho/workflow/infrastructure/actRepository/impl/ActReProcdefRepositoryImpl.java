package cn.com.ho.workflow.infrastructure.actRepository.impl;

import cn.com.ho.workflow.infrastructure.actRepository.ActReProcdefRepository;
import cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by HOZANDUNG on 2021/1/28
 */
@Component
public class ActReProcdefRepositoryImpl implements ActReProcdefRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.ActReProcdef ActReProcdef
            = cn.com.ho.workflow.infrastructure.db.tables.ActReProcdef.ACT_RE_PROCDEF;

    @Override
    public ActReProcdef findOneByDeploymentId(String deploymentId) {
        return dslContext
                .select().from(ActReProcdef)
                .where(ActReProcdef.DEPLOYMENT_ID_.eq(deploymentId))
                .fetchAnyInto(cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef.class);
    }
}
