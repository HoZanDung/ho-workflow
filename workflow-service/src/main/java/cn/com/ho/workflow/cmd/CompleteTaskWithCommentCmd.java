package cn.com.ho.workflow.cmd;

import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntity;

import java.util.Map;

/**
 * Created by HOZANDUNG on 2021/2/7
 */
public class CompleteTaskWithCommentCmd implements Command<Object> {

    private String taskId;

    private Map<String, Object> variables;

    private String comment;

    private String userId;

    public CompleteTaskWithCommentCmd(String taskId, Map<String, Object> variables, String comment, String userId) {
        this.taskId = taskId;
        this.userId = userId;
        this.comment = comment;
        this.variables = variables;
    }

    @Override
    public Object execute(CommandContext commandContext) {
        TaskEntity taskEntity = commandContext.getTaskEntityManager().findById(this.taskId);

        if (this.variables != null) {
            taskEntity.setExecutionVariables(this.variables);
        }
        if (this.userId != null) {
            taskEntity.setAssignee(this.userId);
        }
        commandContext.getHistoryManager().recordTaskId(taskEntity);

        commandContext.getTaskEntityManager().deleteTask(taskEntity, this.comment, false, false);

        return null;
    }
}
