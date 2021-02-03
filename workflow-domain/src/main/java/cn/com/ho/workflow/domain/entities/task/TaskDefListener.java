package cn.com.ho.workflow.domain.entities.task;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by HOZANDUNG on 2021/02/03
 */
@Data
@ApiModel("流程部署读取监听器")
@NoArgsConstructor
public class TaskDefListener implements Serializable {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("流程部署读取节点id")
    private String baseId;

    @ApiModelProperty("值")
    private String value;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("流程定义id")
    private String processDefinitionId;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("流程模型设置节点名字")
    private String nodeName;

    @ApiModelProperty("流程模型名字")
    private String processName;

    @ApiModelProperty("流程模型设置节点编码")
    private String nodeCode;

    @ApiModelProperty("执行状态:1：流程设计器 0：人工扩展")
    private String extStatus;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("要调用的bean名以及方法")
    private String beanName;
}
