package cn.com.ho.workflow.infrastructure.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfListener;

import java.util.List;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfListenerRepository {

    int insertBpmConfListener(BpmConfListener bpmConfListener);

    int deleteByNodeIdAndCreateBy(String nodeId, String createBy);

    int countByNodeId(String nodeId);

    List<BpmConfListener> selectByNodeIdAndStatus(String nodeId, String status);
}
