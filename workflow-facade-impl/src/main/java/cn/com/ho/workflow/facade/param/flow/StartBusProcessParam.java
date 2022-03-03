package cn.com.ho.workflow.facade.param.flow;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Map;

/**
 * Created by HOZANDUNG on 2022/3/3
 */
@Data
@ApiModel("启动流程入参")
public class StartBusProcessParam {

    private String userId;

    private String processDefinitionKey;

    private String businessKey;

    private Map<String, Object> variables;

    private Map<String, Object> businessMap;
}
