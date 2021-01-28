package cn.com.ho.workflow.infrastructure.base;

import cn.com.ho.workflow.domain.base.BaseModel;
import org.jooq.Condition;
import org.jooq.Record;
import org.jooq.impl.TableImpl;
import org.jooq.impl.UpdatableRecordImpl;

/**
 * Created by HOZANDUNG on 2020/12/4
 */
public interface BaseRepository<M extends BaseModel> {

    int save(M baseModel);

    int update(M baseModel);

    M findOne(Class<M> clazz, Condition condition);

    M findOneBy(Class<M> clazz, String field);
}
