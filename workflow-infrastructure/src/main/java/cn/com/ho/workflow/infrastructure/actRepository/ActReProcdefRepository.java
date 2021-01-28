package cn.com.ho.workflow.infrastructure.actRepository;

import cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef;

/**
 * Created by HOZANDUNG on 2021/1/28
 */
public interface ActReProcdefRepository {

    ActReProcdef findOneByDeploymentId(String deploymentId);
}
