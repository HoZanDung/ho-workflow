package cn.com.ho.workflow.domain.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfForm;

import java.util.List;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfFormRepository {

    void insertBpmConfForm(BpmConfForm bpmConfForm);

    void deleteByNodeIdAndCreateBy(String nodeId, String createBy);

    int countByNodeId(String nodeId);

    List<BpmConfForm> selectByNodeIdAndStatue(String nodeId, String status);
}
