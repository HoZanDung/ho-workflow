package cn.com.ho.workflow.infrastructure.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfUser;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfUserRepository {

    int insertBpmConfUser(BpmConfUser bpmConfUser);

    int updateBpmConfUser(BpmConfUser bpmConfUser);

    BpmConfUser findOneByValueTypeProNodeId(String value, String type, int priority, String nodeId);

    BpmConfUser findOneByNodeId(String nodeId);
}
