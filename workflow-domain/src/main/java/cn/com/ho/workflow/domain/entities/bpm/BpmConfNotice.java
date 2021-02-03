package cn.com.ho.workflow.domain.entities.bpm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by HOZANDUNG on 2020/11/26
 */
@Data
@NoArgsConstructor
@ApiModel("流程模型设置通知")
public class BpmConfNotice implements Serializable {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("接受者")
    private String receiver;

    @ApiModelProperty("持续时间")
    private String dueDate;

    @ApiModelProperty("模版code")
    private String templateCode;

    @ApiModelProperty("模版id")
    private String templateId;

    @ApiModelProperty("通知类型")
    private String notificationType;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("流程模型id")
    private String processModelId;

    @ApiModelProperty("流程模型设置节点名字")
    private String nodeName;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("流程模型名字")
    private String processName;

    @ApiModelProperty("流程模型设置节点id")
    private String nodeId;

    @ApiModelProperty("流程模型设置节点编码")
    private String nodeCode;
}
