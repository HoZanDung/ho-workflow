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
@NoArgsConstructor
@ApiModel("流程部署读取规则")
public class TaskDefRule implements Serializable {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("值")
    private String value;

    @ApiModelProperty("流程定义id")
    private String processDefinitionId;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("节点code")
    private String nodeCode;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("流程名字")
    private String processName;

    @ApiModelProperty("流程部署读取节点name")
    private String baseName;

    @ApiModelProperty("流程部署读取节点id")
    private String baseId;

    @ApiModelProperty("节点名称")
    private String nodeName;
}
