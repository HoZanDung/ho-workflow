package cn.com.ho.workflow.infrastructure.repositories.bpm;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
public interface BpmConfNoticeRepository {

    int countByNodeId(String nodeId);
}
