package cn.com.ho.workflow.domain.entities.bpm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by HOZANDUNG on 2020/11/26
 */
@Data
@NoArgsConstructor
@ApiModel("流程模型设置操作")
public class BpmConfOperation implements Serializable {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("值")
    private String value;

    @ApiModelProperty("优先级")
    private Integer priority;

    @ApiModelProperty("流程模型id")
    private String processModelId;

    @ApiModelProperty("流向方法")
    private String flowMethod;

    @ApiModelProperty("操作对应的js按钮名字")
    private String opJsName;

    @ApiModelProperty("提交的Url地址")
    private String opUrl;

    @ApiModelProperty("操作按钮出现的表达式")
    private String opExpr;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("节点名字")
    private String nodeName;

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

    @ApiModelProperty("按钮样式")
    private String btnClass;

    @ApiModelProperty("提交时需要传的json参数")
    private String opJsParam;

    @ApiModelProperty("移动端调用的js方法名称")
    private String mopJsName;

    @ApiModelProperty("移动端提交的Url地址")
    private String mopUrl;

    @ApiModelProperty("移动端按钮样式")
    private String mopClass;

    @ApiModelProperty("流程模型设置节点id")
    private String nodeId;

    @ApiModelProperty("流程模型设置节点编码")
    private String nodeCode;
}
