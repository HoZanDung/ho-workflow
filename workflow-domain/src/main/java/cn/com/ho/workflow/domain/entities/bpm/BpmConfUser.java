package cn.com.ho.workflow.domain.entities.bpm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by HOZANDUNG on 2020/11/26
 */
@Data
@ApiModel("流程模型设置用户")
@NoArgsConstructor
public class BpmConfUser {

    private String id;

    @ApiModelProperty("值/表达式")
    private String value;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("优先级")
    private Integer priority;

    @ApiModelProperty("流程模型ID")
    private String processModelId;

    @ApiModelProperty("流程模型设置节点id")
    private String nodeId;

    @ApiModelProperty("节点名字")
    private String nodeName;

    @ApiModelProperty("节点code")
    private String nodeCode;

    @ApiModelProperty("流程名字")
    private String processName;

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

    @ApiModelProperty("用户名或角色名串")
    private String valueText;

    @ApiModelProperty("是否部门用户 0:否 1:是")
    private String isDepart;

    @ApiModelProperty("部门选择级别")
    private String departLevel;

    @ApiModelProperty("中文值")
    private String valCn;
}
