package cn.com.ho.workflow.domain.entities.bpm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by HOZANDUNG on 2020/11/26
 */
@Data
@ApiModel("流程模型设置会签")
@NoArgsConstructor
public class BpmConfCountersign implements Serializable {

    private String id;

    @ApiModelProperty("串行/并行")
    private String sequential;

    @ApiModelProperty("参与者")
    private String participant;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("进度")
    private Integer rate;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("流程模型id")
    private String processModelId;

    @ApiModelProperty("父节点id")
    private String nodeId;

    @ApiModelProperty("父节点code")
    private String nodeCode;

    @ApiModelProperty("父节点code")
    private String nodeName;
}
