package cn.com.ho.workflow.infrastructure.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfCountersign;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfCountersignRepository {

    int insertBpmConfCountersign(BpmConfCountersign bpmConfCountersign);

    int updateBpmConfCounterSign(BpmConfCountersign bpmConfCountersign);

    BpmConfCountersign findOneBySeqParTypeNodeId(String seq, String par, String type, String nodeId);

    BpmConfCountersign findOneByNodeId(String nodeId);
}
