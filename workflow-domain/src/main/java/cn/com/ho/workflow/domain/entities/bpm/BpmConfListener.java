package cn.com.ho.workflow.domain.entities.bpm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by HOZANDUNG on 2020/11/26
 */
@Data
@ApiModel("流程模型设置监听器")
@NoArgsConstructor
public class BpmConfListener implements Serializable {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("值")
    private String value;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("优先级")
    private Integer priority;

    @ApiModelProperty("流程模型id")
    private String processModelId;

    @ApiModelProperty("流程模型设置节点id")
    private String nodeId;

    @ApiModelProperty("流程模型名字")
    private String processName;

    @ApiModelProperty("执行状态")
    private String extStatus;

    @ApiModelProperty("流程模型设置节点名字")
    private String nodeName;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("流程模型设置节点编码")
    private String nodeCode;

    @ApiModelProperty("要调用的bean名以及方法")
    private String beanName;
}
