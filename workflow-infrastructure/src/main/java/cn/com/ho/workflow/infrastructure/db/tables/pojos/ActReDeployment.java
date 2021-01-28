/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActReDeployment implements Serializable {

    private static final long serialVersionUID = -2068666034;

    private String        id_;
    private String        name_;
    private String        category_;
    private String        key_;
    private String        tenantId_;
    private LocalDateTime deployTime_;
    private String        engineVersion_;
    private Integer       version_;
    private String        projectReleaseVersion_;

    public ActReDeployment() {}

    public ActReDeployment(ActReDeployment value) {
        this.id_ = value.id_;
        this.name_ = value.name_;
        this.category_ = value.category_;
        this.key_ = value.key_;
        this.tenantId_ = value.tenantId_;
        this.deployTime_ = value.deployTime_;
        this.engineVersion_ = value.engineVersion_;
        this.version_ = value.version_;
        this.projectReleaseVersion_ = value.projectReleaseVersion_;
    }

    public ActReDeployment(
        String        id_,
        String        name_,
        String        category_,
        String        key_,
        String        tenantId_,
        LocalDateTime deployTime_,
        String        engineVersion_,
        Integer       version_,
        String        projectReleaseVersion_
    ) {
        this.id_ = id_;
        this.name_ = name_;
        this.category_ = category_;
        this.key_ = key_;
        this.tenantId_ = tenantId_;
        this.deployTime_ = deployTime_;
        this.engineVersion_ = engineVersion_;
        this.version_ = version_;
        this.projectReleaseVersion_ = projectReleaseVersion_;
    }

    public String getId_() {
        return this.id_;
    }

    public void setId_(String id_) {
        this.id_ = id_;
    }

    public String getName_() {
        return this.name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getCategory_() {
        return this.category_;
    }

    public void setCategory_(String category_) {
        this.category_ = category_;
    }

    public String getKey_() {
        return this.key_;
    }

    public void setKey_(String key_) {
        this.key_ = key_;
    }

    public String getTenantId_() {
        return this.tenantId_;
    }

    public void setTenantId_(String tenantId_) {
        this.tenantId_ = tenantId_;
    }

    public LocalDateTime getDeployTime_() {
        return this.deployTime_;
    }

    public void setDeployTime_(LocalDateTime deployTime_) {
        this.deployTime_ = deployTime_;
    }

    public String getEngineVersion_() {
        return this.engineVersion_;
    }

    public void setEngineVersion_(String engineVersion_) {
        this.engineVersion_ = engineVersion_;
    }

    public Integer getVersion_() {
        return this.version_;
    }

    public void setVersion_(Integer version_) {
        this.version_ = version_;
    }

    public String getProjectReleaseVersion_() {
        return this.projectReleaseVersion_;
    }

    public void setProjectReleaseVersion_(String projectReleaseVersion_) {
        this.projectReleaseVersion_ = projectReleaseVersion_;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ActReDeployment (");

        sb.append(id_);
        sb.append(", ").append(name_);
        sb.append(", ").append(category_);
        sb.append(", ").append(key_);
        sb.append(", ").append(tenantId_);
        sb.append(", ").append(deployTime_);
        sb.append(", ").append(engineVersion_);
        sb.append(", ").append(version_);
        sb.append(", ").append(projectReleaseVersion_);

        sb.append(")");
        return sb.toString();
    }
}
