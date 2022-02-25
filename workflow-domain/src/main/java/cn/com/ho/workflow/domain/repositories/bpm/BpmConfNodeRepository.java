package cn.com.ho.workflow.domain.repositories.bpm;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfNode;

import java.util.List;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfNodeRepository {

    void insertBpmConfNode(BpmConfNode bpmConfNode);

    void updateBpmConfNode(BpmConfNode bpmConfNode);

    int deleteByConfBaseId(String confBaseId);

    BpmConfNode findOneByCodeAndConfBaseId(String code, String confBaseId);

    List<BpmConfNode> selectByConfBaseId(String confBaseId);
}
