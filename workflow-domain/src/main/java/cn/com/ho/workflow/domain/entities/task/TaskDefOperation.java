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
@ApiModel("流程读取设置操作")
public class TaskDefOperation implements Serializable {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("值")
    private String value;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("优先级")
    private Integer priority;

    @ApiModelProperty("流程定义id")
    private String processDefinitionId;

    @ApiModelProperty("流向方法")
    private String flowMethod;

    @ApiModelProperty("调用的js方法名称")
    private String opJsName;

    @ApiModelProperty("提交的Url地址")
    private String opUrl;

    @ApiModelProperty("操作按钮出现的表达式")
    private String opExpr;

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

    @ApiModelProperty("按钮样式")
    private String btnClass;

    @ApiModelProperty("提交时需要传的json参数")
    private String opJsParam;

    @ApiModelProperty("流程名字")
    private String processName;

    @ApiModelProperty("节点名称")
    private String nodeName;

    @ApiModelProperty("流程部署读取节点id")
    private String baseId;

    @ApiModelProperty("移动端调用的js方法名称")
    private String mopJsName;

    @ApiModelProperty("移动端提交的Url地址")
    private String mopUrl;

    @ApiModelProperty("移动端按钮样式")
    private String mbTnClass;
}
