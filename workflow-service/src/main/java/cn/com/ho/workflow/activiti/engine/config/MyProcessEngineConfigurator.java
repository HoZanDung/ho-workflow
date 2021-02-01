package cn.com.ho.workflow.activiti.engine.config;

import cn.com.ho.workflow.activiti.engine.db.IdGenerator;
import org.activiti.engine.cfg.AbstractProcessEngineConfigurator;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyProcessEngineConfigurator extends AbstractProcessEngineConfigurator {

    private final IdGenerator idGenerator;

    public MyProcessEngineConfigurator(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }

    @Override
    public void beforeInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
        processEngineConfiguration.setIdGenerator(idGenerator);
    }
}