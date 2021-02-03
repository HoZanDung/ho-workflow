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
@ApiModel("流程部署读取通知")
public class TaskDefNotification implements Serializable {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("流程部署读取节点id")
    private String baseId;

    @ApiModelProperty("事件名字")
    private String eventName;

    @ApiModelProperty("接受者")
    private String receiver;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("模版code")
    private String templateCode;

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

    @ApiModelProperty("流程模型名字")
    private String processName;

    @ApiModelProperty("流程模型设置节点名字")
    private String nodeName;
}
