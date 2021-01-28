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
@NoArgsConstructor
@ApiModel("流程模型设置表单")
public class BpmConfForm {

    private String id;

    @ApiModelProperty("值")
    private String value;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("移动端表单")
    private String mobileForm;

    @ApiModelProperty("表达式规则")
    private String exprRule;

    @ApiModelProperty("流程模型ID")
    private String processModelId;

    @ApiModelProperty("节点名字")
    private String nodeName;

    @ApiModelProperty("流程模型名字")
    private String processName;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("流程模型设置节点id")
    private String nodeId;

    @ApiModelProperty("流程模型设置节点code")
    private String nodeCode;
}
