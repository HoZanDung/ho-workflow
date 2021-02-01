package cn.com.ho.workflow.infrastructure.actRepository;

import java.util.List;

/**
 * Created by HOZANDUNG on 2021/1/29
 */
public interface ActReDeploymentRepository {

    List<String> selectAllDeploymentId();
}
