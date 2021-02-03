package cn.com.ho.workflow.infrastructure.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfUser;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfUserRepository {

    int insertBpmConfUser(BpmConfUser bpmConfUser);

    int deleteByProcessModelId(String processModelId);

    int deleteByNodeIdAndCreateBy(String nodeId, String createBy);

    int countByNodeId(String nodeId);
}
