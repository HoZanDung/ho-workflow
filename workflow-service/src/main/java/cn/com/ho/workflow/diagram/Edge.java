package cn.com.ho.workflow.diagram;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@ApiModel("边界")
@Data
@NoArgsConstructor
public class Edge extends GraphElement {

    @ApiModelProperty("起点")
    private Node src;

    @ApiModelProperty("终点")
    private Node dest;

    @ApiModelProperty("循环")
    private boolean cycle;
}