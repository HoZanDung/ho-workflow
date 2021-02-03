package cn.com.ho.workflow.infrastructure.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfListener;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfListenerRepository {

    int insertBpmConfListener(BpmConfListener bpmConfListener);

    int updateBpmConfListener(BpmConfListener bpmConfListener);

    BpmConfListener findOneByValueTypeNodeId(String value, String type, String nodeId);

    BpmConfListener findOneByNodeId(String nodeId);

    int countByNodeId(String nodeId);
}
