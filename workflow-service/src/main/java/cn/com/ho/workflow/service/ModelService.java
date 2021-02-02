package cn.com.ho.workflow.service;

import cn.com.ho.workflow.domain.commands.process.SaveProcessCommand;

/**
 * Created by HOZANDUNG on 2020/11/24
 */
public interface ModelService {

    int saveBpmnData(SaveProcessCommand createProcessCommand);

    int deployBpmnModel(String actReModelId);

    int migrationConfig(String actReModelId);

    int deleteDeploy(String deploymentId);

    int deleteModel(String actReModelId);
}
