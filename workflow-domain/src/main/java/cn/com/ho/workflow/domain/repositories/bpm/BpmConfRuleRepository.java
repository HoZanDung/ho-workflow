package cn.com.ho.workflow.domain.repositories.bpm;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfRuleRepository {

    int countByNodeId(String nodeId);
}
