package cn.com.ho.workflow.infrastructure.repositories.tp;

import cn.com.ho.workflow.domain.aggregates.TPProcess;

/**
 * Created by HOZANDUNG on 2020/11/24
 */
public interface TPProcessRepository {

    int insertTPProcess(TPProcess tpProcess);

    int updateTPProcess(TPProcess tpProcess);

    int deleteTPProcessByActReModelId(String actReModelId);

    TPProcess findOneByProcessId(String processId);

    TPProcess findOneByProcessKey(String processKey);

    TPProcess findOneByModelId(String actReModelId);
}
