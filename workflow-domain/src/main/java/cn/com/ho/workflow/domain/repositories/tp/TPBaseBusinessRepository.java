package cn.com.ho.workflow.domain.repositories.tp;

import cn.com.ho.workflow.domain.entities.tp.TPBaseBusiness;

/**
 * Created by HOZANDUNG on 2022/2/25
 */
public interface TPBaseBusinessRepository {

    void insertTPBaseBusiness(TPBaseBusiness tpBaseBusiness);

    void updateTPBaseBusiness(TPBaseBusiness tpBaseBusiness);

    TPBaseBusiness findById(String id);
}
