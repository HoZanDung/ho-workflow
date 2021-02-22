package cn.com.ho.workflow.listener;

import cn.com.ho.workflow.cmd.CompleteTaskWithCommentCmd;
import org.activiti.bpmn.model.Process;
import org.activiti.bpmn.model.*;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.impl.context.Context;
import org.activiti.engine.impl.util.ProcessDefinitionUtil;
import org.activiti.engine.task.IdentityLink;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.List;

/**
 * 自动完成第一个任务
 * Created by HOZANDUNG on 2021/2/6
 */
public class AutoCompleteFirstTaskListener extends DefaultTaskListener {

    private static Logger logger = LoggerFactory.getLogger(AutoCompleteFirstTaskListener.class);

    @Override
    public void onCreate(DelegateTask delegateTask) {
        String assignee = delegateTask.getAssignee();
        String currentActivityId = delegateTask.getExecution().getCurrentActivityId();

        String processDefinitionId = delegateTask.getProcessDefinitionId();
        UserTask firstActivity = this.findFirstActivity(processDefinitionId);
        if (firstActivity != null) {
            if (!StringUtils.equals(currentActivityId, firstActivity.getId())) {
                return;
            }
        } else {
            return;
        }

        logger.debug("auto complete first task : {}", delegateTask);

        for (IdentityLink identityLink : delegateTask.getCandidates()) {
            String userId = identityLink.getUserId();
            String groupId = identityLink.getGroupId();

            if (userId != null) {
                delegateTask.deleteCandidateUser(userId);
            }

            if (groupId != null) {
                delegateTask.deleteCandidateGroup(groupId);
            }
        }

        new CompleteTaskWithCommentCmd(delegateTask.getId(), null, "发起流程", assignee)
                .execute(Context.getCommandContext());
    }

    /**
     * 获得第一个节点.
     */
    public UserTask findFirstActivity(String processDefinitionId) {
        BpmnModel bpmnModel = ProcessDefinitionUtil.getBpmnModel(processDefinitionId);
        Process mainProcess = bpmnModel.getMainProcess();
        Collection<FlowElement> flowElements = mainProcess.getFlowElements();
        for (FlowElement flowElement : flowElements) {
            if (flowElement instanceof StartEvent) {
                List<SequenceFlow> outgoingFlows = ((StartEvent) flowElement).getOutgoingFlows();
                for (SequenceFlow outgoingFlow : outgoingFlows) {
                    FlowElement targetFlowElement = outgoingFlow.getTargetFlowElement();
                    if (targetFlowElement instanceof UserTask) {
                        return (UserTask) targetFlowElement;
                    }
                }
            }
        }
        return null;
    }
}
