package cn.com.ho.workflow.facade.impl.modeler;

import cn.com.ho.workflow.domain.commands.process.SaveProcessCommand;
import cn.com.ho.workflow.facade.param.process.TPProcessParam;
import cn.com.ho.workflow.service.ModelService;
import cn.com.xdeas.common.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HOZANDUNG on 2020/11/24
 */
@RestController
@RequestMapping("/api/modelerController")
@Api(tags = "流程模型操作控制器")
public class ModelerCommandController {

    @Autowired
    private ModelService modelService;

    /**
     * 保存流程模型
     *
     * @param tpProcessParam
     * @return
     */
    @PostMapping("/saveBpmnData")
    @ApiOperation("保存流程模型")
    public Response<Integer> saveBpmnData(TPProcessParam tpProcessParam) {
        SaveProcessCommand saveProcessCommand = new SaveProcessCommand();
        BeanUtils.copyProperties(tpProcessParam, saveProcessCommand);
        int i = modelService.saveBpmnData(saveProcessCommand);
        if (i == -1) {
            //  xml流处理异常
            return Response.buildExceptionResponse("400", "xml流处理异常");
        }
        return Response.buildSuccessResponse(i, "保存流程模型");
    }

    /**
     * @return
     */
    @PostMapping("/modeler-deploy")
    @ApiOperation("流程模型部署")
    public Response<Integer> deployBpmnModel(String actReModelId) {
        int i = modelService.deployBpmnModel(actReModelId);
        if (i == -1) {
            //  模型数据为空
            return Response.buildExceptionResponse("400", "模型数据为空,请先设计流程并成功保存,再进行发布");
        }
        return Response.buildSuccessResponse(1, "流程模型部署");
    }
}
