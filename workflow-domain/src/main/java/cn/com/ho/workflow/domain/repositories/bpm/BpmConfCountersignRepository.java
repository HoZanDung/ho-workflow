package cn.com.ho.workflow.domain.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfCountersign;

import java.util.List;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfCountersignRepository {

    void insertBpmConfCountersign(BpmConfCountersign bpmConfCountersign);

    void deleteByNodeId(String nodeId);

    BpmConfCountersign selectByNodeIdAndStatus(String nodeId, String status);
}
