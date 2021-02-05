package cn.com.ho.workflow.facade.impl.modeler;

import cn.com.ho.workflow.domain.commands.process.SaveProcessCommand;
import cn.com.ho.workflow.facade.param.process.TPProcessParam;
import cn.com.ho.workflow.service.ModelService;
import cn.com.xdeas.common.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jooq.tools.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Response<Integer> deployBpmnModel(@RequestBody String actReModelId) {
        if (StringUtils.isEmpty(actReModelId)) {
            return Response.buildExceptionResponse("400", "流程模型id不能为空");
        }
        int i = modelService.deployBpmnModel(actReModelId);
        if (i == -1) {
            //  模型数据为空
            return Response.buildExceptionResponse("400", "模型数据为空,请先设计流程并成功保存,再进行发布");
        }
        return Response.buildSuccessResponse(1, "流程模型部署");
    }

    /**
     * 迁移配置
     *
     * @param actReModelId
     * @return
     */
    @PostMapping("/migrationConfig")
    @ApiOperation("迁移配置")
    public Response<Integer> migrationConfig(@RequestBody String actReModelId) {
        if (StringUtils.isEmpty(actReModelId)) {
            return Response.buildExceptionResponse("400", "流程模型id不能为空");
        }
        int i = modelService.migrationConfig(actReModelId);
        if (i == -1) {
            return Response.buildExceptionResponse("400", "还未部署流程,无法进行迁移操作");
        }
        return Response.buildSuccessResponse(i, "迁移配置");
    }

    /**
     * @param deploymentId
     * @return
     */
    @PostMapping("/deleteDeploy")
    @ApiOperation("删除流程部署")
    public Response<Integer> deleteDeploy(@RequestBody String deploymentId) {
        if (StringUtils.isEmpty(deploymentId)) {
            return Response.buildExceptionResponse("400", "流程部署id不能为空");
        }
        int delete = modelService.deleteDeploy(deploymentId);
        return Response.buildSuccessResponse(delete, "删除流程部署");
    }

    /**
     * 删除流程模型
     *
     * @param actReModelId
     * @return
     */
    @PostMapping("/deleteModel")
    @ApiOperation("删除流程模型")
    public Response<Integer> deleteModel(@RequestBody String actReModelId) {
        if (StringUtils.isEmpty(actReModelId)) {
            return Response.buildExceptionResponse("400", "流程模型id不能为空");
        }
        int delete = modelService.deleteModel(actReModelId);
        return Response.buildSuccessResponse(delete, "删除流程模型");
    }
}
