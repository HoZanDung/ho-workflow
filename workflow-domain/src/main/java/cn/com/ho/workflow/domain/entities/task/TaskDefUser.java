package cn.com.ho.workflow.domain.entities.task;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by HOZANDUNG on 2020/02/03
 */
@Data
@ApiModel("流程部署读取用户")
@NoArgsConstructor
public class TaskDefUser implements Serializable {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("值/表达式")
    private String value;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("目录")
    private String catalog;

    @ApiModelProperty("流程定义id")
    private String processDefinitionId;

    @ApiModelProperty("流程部署读取节点name")
    private String baseName;

    @ApiModelProperty("流程名字")
    private String processName;

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

    @ApiModelProperty("用户表达式")
    private String exprUser;

    @ApiModelProperty("流程部署读取节点id")
    private String baseId;

    @ApiModelProperty("用户名或角色名串")
    private String valueText;

    @ApiModelProperty("是否部门用户 0:否 1:是")
    private String isDepart;

    @ApiModelProperty("部门选择级别")
    private String departLevel;

    @ApiModelProperty("节点名字")
    private String nodeName;

    @ApiModelProperty("中文值")
    private String valueCn;
}
