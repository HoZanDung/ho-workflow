package cn.com.ho.workflow.infrastructure.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfOperation;

import java.util.List;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfOperationRepository {

    List<BpmConfOperation> selectByNodeIdAndStatus(String nodeId, String status);

    int countByNodeId(String nodeId);
}
