package cn.com.ho.workflow.infrastructure.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfNode;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfNodeRepository {

    int insertBpmConfNode(BpmConfNode bpmConfNode);

    int updateBpmConfNode(BpmConfNode bpmConfNode);

    BpmConfNode findOneByCodeAndConfBaseId(String code, String confBaseId);
}
