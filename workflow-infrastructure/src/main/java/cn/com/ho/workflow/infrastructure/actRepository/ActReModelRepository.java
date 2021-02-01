package cn.com.ho.workflow.infrastructure.actRepository;

import cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel;

import java.util.List;

/**
 * Created by HOZANDUNG on 2020/11/25
 */
public interface ActReModelRepository {

    List<ActReModel> selectActReModelListByActReModelIdList(List<String> actReModelIdList);

    ActReModel findOneByActReModelId(String actReModelId);

    ActReModel findOneByActReModelKey(String actReModelKey);

    int selectCountByActReModelKey(String actReModelKey);

    List<String> selectAllModelId();
}
