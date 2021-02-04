package cn.com.ho.workflow.domain.entities.bpm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by HOZANDUNG on 2020/11/26
 */
@Data
@ApiModel("流程模型设置节点")
@NoArgsConstructor
public class BpmConfNode implements Serializable {

    private String id;

    @ApiModelProperty("模型名字")
    private String modelName;

    @ApiModelProperty("编码")
    private String code;

    @ApiModelProperty("名字")
    private String name;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("优先级")
    private Integer priority;

    @ApiModelProperty("跳跃节点")
    private String skip;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("用户部门角色")
    private String userDeptRole;

    @ApiModelProperty("关键点排序")
    private String grabOrder;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("流程模型id(act_re_model)")
    private String confBaseId;

    @ApiModelProperty("跳跃节点表达式")
    private String skipNodeExpr;

    @ApiModelProperty("统计数量")
    private Integer confUser;

    @ApiModelProperty("统计数量")
    private Integer confListener;

    @ApiModelProperty("统计数量")
    private Integer confRule;

    @ApiModelProperty("统计数量")
    private Integer confForm;

    @ApiModelProperty("统计数量")
    private Integer confOperation;

    @ApiModelProperty("统计数量")
    private Integer confNotice;
}
