package cn.com.ho.workflow.domain.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfUser;

import java.util.List;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfUserRepository {

    void insertBpmConfUser(BpmConfUser bpmConfUser);

    int deleteByProcessModelId(String processModelId);

    void deleteByNodeIdAndCreateBy(String nodeId, String createBy);

    int countByNodeId(String nodeId);

    List<BpmConfUser> selectByNodeIdAndStatus(String nodeId, String status);
}
