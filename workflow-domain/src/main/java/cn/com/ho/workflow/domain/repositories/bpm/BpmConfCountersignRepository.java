package cn.com.ho.workflow.domain.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfCountersign;

import java.util.List;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfCountersignRepository {

    int insertBpmConfCountersign(BpmConfCountersign bpmConfCountersign);

    int deleteByNodeId(String nodeId);

    BpmConfCountersign selectByNodeIdAndStatus(String nodeId, String status);
}
