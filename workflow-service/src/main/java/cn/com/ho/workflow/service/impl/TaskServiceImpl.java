package cn.com.ho.workflow.service.impl;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfForm;
import cn.com.ho.workflow.domain.entities.bpm.BpmConfListener;
import cn.com.ho.workflow.domain.entities.bpm.BpmConfUser;
import cn.com.ho.workflow.domain.entities.task.TaskDefForm;
import cn.com.ho.workflow.domain.entities.task.TaskDefListener;
import cn.com.ho.workflow.domain.entities.task.TaskDefUser;
import cn.com.ho.workflow.domain.enums.CreateUpdateByEnum;
import cn.com.ho.workflow.infrastructure.repositories.bpm.BpmConfFormRepository;
import cn.com.ho.workflow.infrastructure.repositories.bpm.BpmConfListenerRepository;
import cn.com.ho.workflow.infrastructure.repositories.bpm.BpmConfUserRepository;
import cn.com.ho.workflow.infrastructure.repositories.task.TaskDefFormRepository;
import cn.com.ho.workflow.infrastructure.repositories.task.TaskDefListenerRepository;
import cn.com.ho.workflow.infrastructure.repositories.task.TaskDefUserRepository;
import cn.com.ho.workflow.service.TaskService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HOZANDUNG on 2021/2/4
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Resource
    private BpmConfUserRepository bpmConfUserRepository;

    @Resource
    private BpmConfFormRepository bpmConfFormRepository;

    @Resource
    private BpmConfListenerRepository bpmConfListenerRepository;

    @Resource
    private TaskDefUserRepository taskDefUserRepository;

    @Resource
    private TaskDefFormRepository taskDefFormRepository;

    @Resource
    private TaskDefListenerRepository taskDefListenerRepository;

    private final static String Auto = CreateUpdateByEnum.AUTO.getText();

    @Override
    @Async
    @Transactional
    public void migrateBpmUserToTaskUser(String bpmConfNodeId, String bpmConfNodeCode, String processDefinitionId, String taskBaseId, LocalDateTime now) {
        List<BpmConfUser> bpmConfUsers = bpmConfUserRepository.selectByNodeIdAndStatus(bpmConfNodeId, "1");
        List<TaskDefUser> taskDefUserList = new ArrayList<>();
        for (BpmConfUser bpmConfUser : bpmConfUsers) {
            String catalog = "";
            String type = bpmConfUser.getType();
            if (StringUtils.isNotEmpty(type)) {
                switch (type) {
                    case "0":
                        catalog = "assignee";
                        break;
                    case "1":
                    case "2":
                        catalog = "candidate";
                        break;
                }
            }
            TaskDefUser taskDefUser = new TaskDefUser();
            BeanUtils.copyProperties(bpmConfUser, taskDefUser);
            taskDefUser.setCatalog(catalog);
            taskDefUser.setBaseId(taskBaseId);
            taskDefUser.setProcessDefinitionId(processDefinitionId);
            taskDefUser.setCreateTime(now);
            taskDefUser.setUpdateTime(now);
            taskDefUserList.add(taskDefUser);
        }

        taskDefUserRepository.deleteByNodeCodeAndProcDefIdAndCreateBy(bpmConfNodeCode, processDefinitionId, Auto);
        taskDefUserRepository.batchInsertTaskDefUser(taskDefUserList);
    }

    @Override
    @Async
    @Transactional
    public void migrateBpmFormToTaskForm(String bpmConfNodeId, String bpmConfNodeCode, String processDefinitionId, String taskBaseId, LocalDateTime now) {
        List<BpmConfForm> bpmConfForms = bpmConfFormRepository.selectByNodeIdAndStatue(bpmConfNodeId, "1");
        List<TaskDefForm> taskDefFormList = new ArrayList<>();
        for (BpmConfForm bpmConfForm : bpmConfForms) {
            TaskDefForm taskDefForm = new TaskDefForm();
            BeanUtils.copyProperties(bpmConfForm, taskDefForm);
            taskDefForm.setBaseId(taskBaseId);
            taskDefForm.setProcessDefinitionId(processDefinitionId);
            taskDefForm.setCreateTime(now);
            taskDefForm.setUpdateTime(now);
            taskDefForm.setMobileFormKey(bpmConfForm.getMobileForm());
            taskDefFormList.add(taskDefForm);
        }

        taskDefFormRepository.deleteByNodeCodeAndProcDefIdAndCreateBy(bpmConfNodeCode, processDefinitionId, Auto);
        taskDefFormRepository.batchInsertTaskDefForm(taskDefFormList);
    }

    @Override
    @Async
    @Transactional
    public void migrateBpmFormToTaskListener(String bpmConfNodeId, String bpmConfNodeCode, String processDefinitionId, String taskBaseId, LocalDateTime now) {
        List<BpmConfListener> bpmConfListeners = bpmConfListenerRepository.selectByNodeIdAndStatus(bpmConfNodeId, "1");
        List<TaskDefListener> taskDefListenerList = new ArrayList<>();
        for (BpmConfListener bpmConfListener : bpmConfListeners) {
            TaskDefListener taskDefListener = new TaskDefListener();
            BeanUtils.copyProperties(bpmConfListener, taskDefListener);
            taskDefListener.setBaseId(taskBaseId);
            taskDefListener.setProcessDefinitionId(processDefinitionId);
            taskDefListener.setCreateTime(now);
            taskDefListener.setUpdateTime(now);
            taskDefListenerList.add(taskDefListener);
        }

        taskDefListenerRepository.deleteByNodeCodeAndProcDefIdAndCreateBy(bpmConfNodeCode, processDefinitionId, Auto);
        taskDefListenerRepository.batchInsertTaskDefListener(taskDefListenerList);
    }
}
