package cn.com.ho.workflow.infrastructure.actRepository.impl;

import cn.com.ho.workflow.infrastructure.actRepository.ActReModelRepository;
import cn.com.ho.workflow.infrastructure.db.tables.daos.ActReModelDao;
import cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by HOZANDUNG on 2020/11/25
 */
@Component
public class ActReModelRepositoryImpl implements ActReModelRepository {

    @Autowired
    private DSLContext dslContext;

    @Resource
    private ActReModelDao actReModelDao;

    private cn.com.ho.workflow.infrastructure.db.tables.ActReModel ActReModel
            = cn.com.ho.workflow.infrastructure.db.tables.ActReModel.ACT_RE_MODEL;

    @Override
    public List<ActReModel> selectActReModelListByActReModelIdList(List<String> actReModelIdList) {
        String[] strings = new String[actReModelIdList.size()];
        actReModelIdList.toArray(strings);
        return actReModelDao.fetchById_(strings);
    }

    @Override
    public ActReModel findOneByActReModelId(String actReModelId) {
        return actReModelDao.findById(actReModelId);
    }

    @Override
    public ActReModel findOneByActReModelKey(String actReModelKey) {
        return actReModelDao.fetchOne(ActReModel.KEY_, actReModelKey);
    }

    @Override
    public int selectCountByActReModelKey(String actReModelKey) {
        return dslContext
                .select().from(ActReModel)
                .where(ActReModel.KEY_.eq(actReModelKey))
                .fetchOne(0, Integer.class);
    }
}
