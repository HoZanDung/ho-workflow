package cn.com.ho.workflow.domain.entities.tp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by HOZANDUNG on 2020/11/26
 */
@Data
@ApiModel("自定义流程部署表")
public class TPProcDefXml {

    @ApiModelProperty("主键,流程定义id")
    private String procDefId;

    @ApiModelProperty("流程名字")
    private String name;

    @ApiModelProperty("activiti流程xml文件内容")
    private String processXml;

    @ApiModelProperty("流程设计bpmn的xml文件内容")
    private String bpmnXml;
}
