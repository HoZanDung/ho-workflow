package cn.com.ho.workflow.domain.entities.bpm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by HOZANDUNG on 2020/11/26
 */
@Data
@NoArgsConstructor
@ApiModel("流程模型设置操作")
public class BpmConfOperation {

    private String id;

    @ApiModelProperty("值")
    private String value;

    @ApiModelProperty("优先级")
    private Integer priority;

    @ApiModelProperty("流程模型id")
    private String processModelId;

    @ApiModelProperty("流向方法")
    private String flowMethod;

    @ApiModelProperty("")
    private String opJsName;

    @ApiModelProperty("")
    private String opUrl;

    @ApiModelProperty("")
    private String opExpr;

    @ApiModelProperty("")
    private String status;

    @ApiModelProperty("")
    private String nodeName;

    @ApiModelProperty("")
    private Date createTime;

    @ApiModelProperty("")
    private Date updateTime;

    @ApiModelProperty("")
    private String createBy;

    @ApiModelProperty("")
    private String updateBy;

    @ApiModelProperty("")
    private String processName;

    @ApiModelProperty("")
    private String btnClass;

    @ApiModelProperty("")
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
