package cn.com.ho.workflow.domain.aggregates;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by HOZANDUNG on 2020/11/26
 */
@ApiModel("流程模型id")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcessModelId {

    @ApiModelProperty("流程模型id")
    private String id;
}
