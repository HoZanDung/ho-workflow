package cn.com.ho.workflow.diagram;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@ApiModel("节点和连线的父类")
@NoArgsConstructor
@AllArgsConstructor
public class GraphElement {

    @ApiModelProperty("实例id,历史的id")
    private String id;

    @ApiModelProperty("节点名称,bpmn图形中的id")
    private String name;
}