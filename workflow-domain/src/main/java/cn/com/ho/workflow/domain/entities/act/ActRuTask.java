package cn.com.ho.workflow.domain.entities.act;

import cn.com.ho.workflow.domain.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by HOZANDUNG on 2020/12/4
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ActRuTask extends BaseModel {

    private String name_;
}
