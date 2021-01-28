package cn.com.ho.workflow.dto;

import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;
import org.activiti.bpmn.model.BpmnModel;

/**
 * Created by HOZANDUNG on 2020/11/30
 */
@Data
public class ProcessPretreatmentReturnDTO {

    private String processKey;

    private String processName;

    private String metaInfo;

    private ObjectNode modelObjectNode;

    private BpmnModel bpmnModel;
}
