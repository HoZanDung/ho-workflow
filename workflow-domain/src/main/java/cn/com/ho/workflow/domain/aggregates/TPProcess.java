package cn.com.ho.workflow.domain.aggregates;

import cn.com.ho.workflow.domain.base.BaseModel;
import cn.com.ho.workflow.domain.commands.process.SaveProcessCommand;
import cn.com.ho.workflow.util.IdWorker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Created by HOZANDUNG on 2020/11/24
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("流程模型聚合")
@NoArgsConstructor
public class TPProcess extends BaseModel {

    @ApiModelProperty("流程模型id")
    private ProcessModelId processModelId;

    @ApiModelProperty("流程名字")
    private String name;

    @ApiModelProperty("流程key")
    private String processKey;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("对应业务表")
    private String busTable;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("流程设计BpmnXml文件内容")
    private String bpmnXml;

    @ApiModelProperty("Activiti流程Xml文件内容")
    private String processXml;

    @ApiModelProperty("关联流程引擎的流程模型id")
    private ActReModelId modelId;

    public TPProcess(SaveProcessCommand saveProcessCommand) {
        BeanUtils.copyProperties(saveProcessCommand, this);
        this.processModelId = new ProcessModelId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
        this.setId(this.processModelId.getId());
        this.status = "1";
        LocalDateTime now = LocalDateTime.now();
        this.createTime = now;
        this.updateBy = this.createBy;
        this.updateTime = now;
    }


    @Override
    public boolean isEmpty() {
        return Optional.ofNullable(this.getProcessModelId()).isPresent();
    }

    public void newUpdateTime() {
        this.updateTime = LocalDateTime.now();
    }

    public void handleXml(String bpmnXml) {
        this.processXml = replaceBpmnToActiviti(bpmnXml);
        this.bpmnXml = bpmnXml.replaceAll("&lt;", "<").replaceAll("&gt;", ">");
    }

    public String replaceBpmnToActiviti(String bpmnXml) {
        String activitiXml = bpmnXml;
        //  不能统一替换bpmn为""和camunda为activiti,因为在xml最上面的命名空间里面会有这两种字眼的出现,但是不能替换掉命名空间,否则会解析出错
        activitiXml = activitiXml.replaceAll("&lt;", "<");
        activitiXml = activitiXml.replaceAll("&gt;", ">");
        //  流程
        activitiXml = activitiXml.replaceAll("bpmn2:process", "process");
        activitiXml = activitiXml.replaceAll("bpmn2:incoming", "incoming");
        activitiXml = activitiXml.replaceAll("bpmn2:outgoing", "outgoing");
        //  开始结束节点
        activitiXml = activitiXml.replaceAll("bpmn2:startEvent", "startEvent");
        activitiXml = activitiXml.replaceAll("bpmn2:endEvent", "endEvent");
        //  条件顺序流
        activitiXml = activitiXml.replaceAll("bpmn2:sequenceFlow", "sequenceFlow");
        activitiXml = activitiXml.replaceAll("bpmn2:conditionExpression", "conditionExpression");
        //  唯一网关
        activitiXml = activitiXml.replaceAll("bpmn2:exclusiveGateway", "exclusiveGateway");
        //  普通任务替换为用户任务
        activitiXml = activitiXml.replaceAll("bpmn2:task", "userTask");
        activitiXml = activitiXml.replaceAll("bpmn2:userTask", "userTask");
        //  以下为针对用户任务的xml处理
        activitiXml = activitiXml.replaceAll("camunda:assignee", "activiti:assignee");
        activitiXml = activitiXml.replaceAll("camunda:cadidateUsers", "activiti:cadidateUsers");
        activitiXml = activitiXml.replaceAll("camunda:cadidateGroups", "activiti:cadidateGroups");
        activitiXml = activitiXml.replaceAll("camunda:dueDate", "activiti:dueDate");
        activitiXml = activitiXml.replaceAll("camunda:priority", "activiti:priority");
        //  以下为针对会签的xml处理
        activitiXml = activitiXml.replaceAll("bpmn2:multiInstanceLoopCharacteristics", "multiInstanceLoopCharacteristics");
        activitiXml = activitiXml.replaceAll("bpmn2:loopCardinality", "loopCardinality");
        activitiXml = activitiXml.replaceAll("bpmn2:completionCondition", "completionCondition");
        activitiXml = activitiXml.replaceAll("camunda:collection", "activiti:collection");
        activitiXml = activitiXml.replaceAll("camunda:elementVariable", "activiti:elementVariable");
        return activitiXml;
    }

    public void combineActReModelAndTPProcess(String actReModelId) {
        this.modelId = new ActReModelId(actReModelId);
    }

    public void replaceSingleQuotesToDoubleQuotation() {
        this.bpmnXml = this.bpmnXml.replaceAll("'", "\"");
        this.processXml = this.processXml.replaceAll("'", "\"");
    }
}
