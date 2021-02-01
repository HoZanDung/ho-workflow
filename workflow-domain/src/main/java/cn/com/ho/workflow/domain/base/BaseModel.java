package cn.com.ho.workflow.domain.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by HOZANDUNG on 2020/12/4
 */
@ApiModel("基础类")
@Data
public class BaseModel implements Serializable {

    @ApiModelProperty("id")
    private String id;

    public boolean isEmpty() {
        return this.id.isEmpty();
    }
}
