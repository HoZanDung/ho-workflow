/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.pojos;


import java.io.Serializable;

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
public class TPProcDefXml implements Serializable {

    private static final long serialVersionUID = 1476309931;

    private String procDefId;
    private String name;
    private String processXml;
    private String bpmnXml;

    public TPProcDefXml() {}

    public TPProcDefXml(TPProcDefXml value) {
        this.procDefId = value.procDefId;
        this.name = value.name;
        this.processXml = value.processXml;
        this.bpmnXml = value.bpmnXml;
    }

    public TPProcDefXml(
        String procDefId,
        String name,
        String processXml,
        String bpmnXml
    ) {
        this.procDefId = procDefId;
        this.name = name;
        this.processXml = processXml;
        this.bpmnXml = bpmnXml;
    }

    public String getProcDefId() {
        return this.procDefId;
    }

    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProcessXml() {
        return this.processXml;
    }

    public void setProcessXml(String processXml) {
        this.processXml = processXml;
    }

    public String getBpmnXml() {
        return this.bpmnXml;
    }

    public void setBpmnXml(String bpmnXml) {
        this.bpmnXml = bpmnXml;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TPProcDefXml (");

        sb.append(procDefId);
        sb.append(", ").append(name);
        sb.append(", ").append(processXml);
        sb.append(", ").append(bpmnXml);

        sb.append(")");
        return sb.toString();
    }
}
