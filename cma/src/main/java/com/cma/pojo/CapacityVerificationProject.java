package com.cma.pojo;

import javax.persistence.*;

@Table(name = "capacity_verification_project")
public class CapacityVerificationProject {
    @Id
    @Column(name = "id")
    private Long projectId;

    @Column(name = "plan_id")
    private Long planId;

    private String name;

    private String method;

    private Long state;

    private String note;

    /**
     * @return id
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * @return plan_id
     */
    public Long getPlanId() {
        return planId;
    }

    /**
     * @param planId
     */
    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return method;
    }

    /**
     * @param method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * @return state
     */
    public Long getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Long state) {
        this.state = state;
    }

    /**
     * @return note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }
}