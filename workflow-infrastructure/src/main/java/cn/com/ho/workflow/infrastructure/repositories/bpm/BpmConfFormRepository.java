package cn.com.ho.workflow.infrastructure.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfForm;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfFormRepository {

    int insertBpmConfForm(BpmConfForm bpmConfForm);

    int updateBpmConfForm(BpmConfForm bpmConfForm);

    BpmConfForm findOneByNodeId(String nodeId);
}
