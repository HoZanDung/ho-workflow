package cn.com.ho.workflow.listener;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.ExecutionListener;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by HOZANDUNG on 2021/2/6
 */
public class DefaultTaskListener implements TaskListener, ExecutionListener {

    private static Logger logger = LoggerFactory.getLogger(DefaultTaskListener.class);

    @Override
    public void notify(DelegateTask delegateTask) {
        String eventName = delegateTask.getEventName();
        logger.debug("{}", this);
        logger.debug("{} : {}", eventName, delegateTask);
        if (StringUtils.isNotEmpty(eventName)) {
            switch (eventName) {
                case "create":
                    this.onCreate(delegateTask);
                    break;
                case "assignment":
                    this.onAssignment(delegateTask);
                    break;
                case "complete":
                    this.onComplete(delegateTask);
                    break;
                case "delete":
                    this.onDelete(delegateTask);
                    break;
            }
        }
        ((TaskEntity) delegateTask).setEventName(eventName);
    }

    @Override
    public void notify(DelegateExecution execution) {
        String eventName = execution.getEventName();
        if (StringUtils.isNotEmpty(eventName)) {
            switch (eventName) {
                case "start":
                    logger.info("start");
                    break;
                case "end":
                    logger.info("end");
                    this.onEnd(execution);
                case "task":
                    logger.info("task");
                    break;
            }
        }
    }

    public DefaultTaskListener() {
    }

    public void onCreate(DelegateTask delegateTask) {
    }

    public void onAssignment(DelegateTask delegateTask) {
    }

    public void onComplete(DelegateTask delegateTask) {
    }

    public void onDelete(DelegateTask delegateTask) {
    }

    public void onEnd(DelegateExecution execution) {
    }
}
