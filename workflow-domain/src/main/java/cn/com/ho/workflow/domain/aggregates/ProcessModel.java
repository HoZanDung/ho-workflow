package cn.com.ho.workflow.domain.aggregates;

import cn.com.ho.workflow.domain.entities.bpm.*;
import cn.com.ho.workflow.domain.entities.tp.TPVariables;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by HOZANDUNG on 2020/11/26
 */
@Data
@ApiModel("流程模型设置聚合")
public class ProcessModel {

    @ApiModelProperty("流程")
    private TPProcess tpProcess;

    @ApiModelProperty("流程参数")
    private TPVariables tpVariables;

    @ApiModelProperty("模型设置会签节点")
    private List<BpmConfCountersign> bpmConfCountersignList;

    @ApiModelProperty("模型设置表单")
    private List<BpmConfForm> bpmConfFormList;

    @ApiModelProperty("模型设置监听器")
    private List<BpmConfListener> bpmConfListenerList;

    @ApiModelProperty("模型节点")
    private List<BpmConfNode> bpmConfNodeList;

    @ApiModelProperty("模型设置节点通知")
    private List<BpmConfNotice> bpmConfNoticeList;

    @ApiModelProperty("模型设置节点操作")
    private List<BpmConfOperation> bpmConfOperationList;

    @ApiModelProperty("模型设置节点处理规则")
    private List<BpmConfRule> bpmConfRuleList;

    @ApiModelProperty("模型设置节点待办人")
    private List<BpmConfUser> bpmConfUserList;
}
