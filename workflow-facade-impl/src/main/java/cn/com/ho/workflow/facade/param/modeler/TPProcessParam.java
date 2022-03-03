package cn.com.ho.workflow.facade.param.modeler;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by HOZANDUNG on 2020/11/24
 */
@Data
@NoArgsConstructor
@ApiModel("创建流程模型入参")
public class TPProcessParam {

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
}
