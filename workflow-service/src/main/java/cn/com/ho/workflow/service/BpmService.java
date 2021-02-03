package cn.com.ho.workflow.service;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.activiti.bpmn.model.BpmnModel;

/**
 * Created by HOZANDUNG on 2021/2/3
 */
public interface BpmService {

    void handleBPM(String modelId, ObjectNode modelObjectNode, BpmnModel bpmnModel);
}
