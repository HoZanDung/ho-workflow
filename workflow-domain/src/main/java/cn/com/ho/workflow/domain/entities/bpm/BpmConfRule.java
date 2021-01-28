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
@ApiModel("流程模型设置规则")
public class BpmConfRule {

    private String id;

    @ApiModelProperty("")
    private String value;

    @ApiModelProperty("")
    private String processModelId;

    @ApiModelProperty("")
    private String status;

    @ApiModelProperty("")
    private String nodeName;

    @ApiModelProperty("")
    private LocalDateTime createTime;

    @ApiModelProperty("")
    private LocalDateTime updateTime;

    @ApiModelProperty("")
    private String createBy;

    @ApiModelProperty("")
    private String updateBy;

    @ApiModelProperty("")
    private String processName;

    @ApiModelProperty("")
    private String nodeId;

    @ApiModelProperty("")
    private String nodeCode;
}
