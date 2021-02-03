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
@ApiModel("流程部署读取节点")
@NoArgsConstructor
public class TaskDefBase implements Serializable {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("编码")
    private String code;

    @ApiModelProperty("名字")
    private String name;

    @ApiModelProperty("流程定义id")
    private String processDefinitionId;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("会签类型")
    private String countersignType;

    @ApiModelProperty("会签人")
    private String countersignUser;

    @ApiModelProperty("是否跳过")
    private String skip;

    @ApiModelProperty("会签策略")
    private String countersignStrategy;

    @ApiModelProperty("会签通过率")
    private Integer countersignRate;

    @ApiModelProperty("分配策略")
    private String assignStrategy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("是否用部门角色")
    private String useDeptRole;

    @ApiModelProperty("排序")
    private String grabOrder;

    @ApiModelProperty("跳跃节点表达式")
    private String skipNodeExpr;
}
