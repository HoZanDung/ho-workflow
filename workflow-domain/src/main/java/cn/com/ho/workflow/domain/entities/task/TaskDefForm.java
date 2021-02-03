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
@ApiModel("流程部署读取表单")
@NoArgsConstructor
public class TaskDefForm implements Serializable {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("表单地址值")
    private String value;

    @ApiModelProperty("internal:内部 电子表单 external:外部 外部表单")
    private String type;

    @ApiModelProperty("状态 0:禁用 1:启用")
    private String status;

    @ApiModelProperty("节点code")
    private String nodeCode;

    @ApiModelProperty("节点名称")
    private String nodeName;

    @ApiModelProperty("移动端表单")
    private String mobileFormKey;

    @ApiModelProperty("流程定义id")
    private String processDefinitionId;

    @ApiModelProperty("流程名字")
    private String processName;

    @ApiModelProperty("流程部署读取节点id")
    private String baseId;

    @ApiModelProperty("表达式规则 根据表达式来确定显示哪一组表单")
    private String exprRule;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;
}

