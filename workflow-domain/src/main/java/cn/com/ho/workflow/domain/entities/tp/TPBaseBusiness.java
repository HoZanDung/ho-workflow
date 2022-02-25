package cn.com.ho.workflow.domain.entities.tp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * Created by HOZANDUNG on 2020/11/26
 */
@Getter
@ApiModel("业务流程记录")
public class TPBaseBusiness {

    @ApiModelProperty("业务id")
    private String id;

    private String title;

    private String remark;

    private String status;

    private String isClaim;

    @ApiModelProperty("流程实例id")
    private String procInstId;

    private String busTables;

    private String priority;

    private LocalDateTime submitTime;

    private String submitter;

    private String submitterEn;

    private String module;

    private String parentId;

    private String acceptUser;

    private String applicant;

    private String busDept;
}
