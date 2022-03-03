package cn.com.ho.workflow.facade.impl.flow;

import cn.com.ho.workflow.facade.param.flow.StartBusProcessParam;
import cn.com.ho.workflow.service.FlowOperationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.com.xdeas.common.Response;

import javax.validation.Valid;

/**
 * Created by HOZANDUNG on 2022/3/3
 */
@RestController
@RequestMapping("/flowOperation")
@Validated
public class FlowOperationController {

    @Autowired
    private FlowOperationService flowOperationService;

    @PostMapping("/startBusProcess")
    @ApiOperation("启动流程")
    public Response<Void> startBusProcess(@RequestBody @Valid StartBusProcessParam param) {
        flowOperationService.startBusProcess(param.getUserId(), param.getProcessDefinitionKey(), param.getBusinessKey(), param.getVariables(), param.getBusinessMap());
        return Response.buildSuccessResponse(null, "启动流程");
    }
}
