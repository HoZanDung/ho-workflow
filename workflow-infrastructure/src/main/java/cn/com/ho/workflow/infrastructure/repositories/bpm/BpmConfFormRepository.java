package cn.com.ho.workflow.infrastructure.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfForm;

import java.util.List;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfFormRepository {

    int insertBpmConfForm(BpmConfForm bpmConfForm);

    int deleteByNodeIdAndCreateBy(String nodeId, String createBy);

    int countByNodeId(String nodeId);

    List<BpmConfForm> selectByNodeIdAndStatue(String nodeId, String status);
}
