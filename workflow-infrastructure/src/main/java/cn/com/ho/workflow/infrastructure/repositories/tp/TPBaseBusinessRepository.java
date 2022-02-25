package cn.com.ho.workflow.infrastructure.repositories.tp;

import cn.com.ho.workflow.domain.entities.tp.TPBaseBusiness;

/**
 * Created by HOZANDUNG on 2022/2/25
 */
public interface TPBaseBusinessRepository {

    TPBaseBusiness findById(String id);
}
