package cn.com.ho.workflow.activiti.engine.autodeployment;

import org.activiti.core.common.spring.project.ProjectModelService;
import org.activiti.engine.RepositoryService;
import org.activiti.spring.autodeployment.AbstractAutoDeploymentStrategy;
import org.springframework.core.io.Resource;

/**
 * Created by HOZANDUNG on 2021/1/29
 */
public class NoneAutoDeploymentStrategy extends AbstractAutoDeploymentStrategy {

    public static final String DEPLOYMENT_MODE = "none";

    public NoneAutoDeploymentStrategy(ProjectModelService projectModelService) {
        super(projectModelService);
    }

    @Override
    protected String getDeploymentMode() {
        return DEPLOYMENT_MODE;
    }

    @Override
    public void deployResources(String deploymentNameHint, Resource[] resources, RepositoryService repositoryService) {
        System.out.println("测试");
    }
}
