package cn.com.ho.workflow.domain.commands.process;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by HOZANDUNG on 2020/11/24
 */
@ApiModel("创建流程指令")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveProcessCommand {

    @ApiModelProperty("T_P_Process表的主键id,新增流程没有不用传,更新必填")
    private String id;

    @ApiModelProperty("流程名字")
    private String name;

    @ApiModelProperty("流程key")
    private String processKey;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("对应业务表")
    private String busTable;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("流程设计BpmnXml文件内容")
    private String bpmnXml;

    @ApiModelProperty("关联流程引擎的流程模型id")
    private String modelId;
}
