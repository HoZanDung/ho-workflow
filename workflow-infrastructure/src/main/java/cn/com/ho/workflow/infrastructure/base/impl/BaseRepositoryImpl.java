package cn.com.ho.workflow.infrastructure.base.impl;

import cn.com.ho.workflow.domain.base.BaseModel;
import cn.com.ho.workflow.infrastructure.base.BaseRepository;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.SQL;
import org.jooq.impl.TableImpl;
import org.jooq.impl.UpdatableRecordImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by HOZANDUNG on 2020/12/4
 */
@Component
public abstract class BaseRepositoryImpl<M extends BaseModel, T extends TableImpl<R>, R extends UpdatableRecordImpl<R>> implements BaseRepository<M> {

    @Autowired
    protected DSLContext dslContext;

    private final String basePackagePath = "cn.com.ho.workflow.infrastructure.db.tables.";

    private R returnTableRecord(Class<?> aClass) {
        try {
            T tableRecord = (T) aClass.getDeclaredConstructor().newInstance();
            return dslContext.newRecord(tableRecord);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private R getTableRecordByBaseModel(M baseModel) {
        try {
            Class<?> aClass = Class.forName(basePackagePath + baseModel.getClass().getSimpleName());
            return returnTableRecord(aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private R getTableRecordByClass(Class<M> clazz) {
        try {
            Class<?> aClass = Class.forName(basePackagePath + clazz.getSimpleName());
            return returnTableRecord(aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private T getTableByModel(M baseModel) {
        try {
            Class<?> aClass = Class.forName(basePackagePath + baseModel.getClass().getSimpleName());
            return (T) aClass.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    @Override
    public int save(M baseModel) {
        R updatableRecord = getTableRecordByBaseModel(baseModel);
        BeanUtils.copyProperties(baseModel, updatableRecord);
        return updatableRecord.insert();
    }

    @Override
    public int update(M baseModel) {
        R updatableRecord = getTableRecordByBaseModel(baseModel);
        BeanUtils.copyProperties(baseModel, updatableRecord);
        return updatableRecord.update();
    }

    @Override
    public M findOne(Class<M> clazz, Condition condition) {
        try {
            Class<?> aClass = Class.forName(basePackagePath + clazz.getSimpleName());
            T table = (T) aClass.getDeclaredConstructor().newInstance();
//        dslContext.select().from(table).where(table.field("").eq("")).fetchInto()
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public M findOneBy(Class<M> clazz, String field) {
        R updateRecord = getTableRecordByClass(clazz);
        return null;
    }
}
