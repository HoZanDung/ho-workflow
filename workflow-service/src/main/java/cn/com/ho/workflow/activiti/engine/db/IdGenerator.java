package cn.com.ho.workflow.activiti.engine.db;

import cn.com.ho.workflow.util.IdWorker;
import org.springframework.stereotype.Component;

/**
 * Created by HOZANDUNG on 2021/1/28
 */
@Component
public class IdGenerator implements org.activiti.engine.impl.cfg.IdGenerator {

    @Override
    public String getNextId() {
        return IdWorker.getFlowIdWorkerInstance().nextIdStr();
    }
}
