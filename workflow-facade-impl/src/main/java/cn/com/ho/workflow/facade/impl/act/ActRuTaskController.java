package cn.com.ho.workflow.facade.impl.act;

import cn.com.ho.workflow.domain.entities.act.ActRuTask;
import cn.com.ho.workflow.infrastructure.actRepository.impl.ActRuTaskRepositoryImpl;
import org.jooq.DSLContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by HOZANDUNG on 2020/12/4
 */
@RestController
@RequestMapping("/actRuTaskController")
public class ActRuTaskController {

    @Resource
    private ActRuTaskRepositoryImpl actRuTaskRepository;

    @Resource
    private DSLContext dslContext;

    @GetMapping("/test")
    public void test() {

    }
}
