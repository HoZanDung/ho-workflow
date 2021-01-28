package cn.com.ho.workflow.diagram;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@ApiModel("节点")
@Data
@NoArgsConstructor
public class Node extends GraphElement {

    @ApiModelProperty("类型,比如userTask,startEvent.")
    private String type;

    @ApiModelProperty("是否还未完成.")
    private boolean active;

    @ApiModelProperty("分支编号")
    private String executeId;

    @ApiModelProperty("进入这个节点的所有连线")
    private List<Edge> incomingEdges = new ArrayList<>();

    @ApiModelProperty("外出这个节点的所有连线")
    private List<Edge> outgoingEdges = new ArrayList<>();
}
