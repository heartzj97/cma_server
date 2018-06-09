package com.cma.pojo;

import javax.persistence.*;

@Table(name = "supervision_plan")
public class SupervisionPlan {
    @Id
    @Column(name = "id")
    private Long planId;

    @Column(name = "supervise_id")
    private Long superviseId;

    private String content;

    private String object;

    @Column(name = "date_frequency")
    private String dateFrequency;

    /**
     * @return id
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
     * @return supervise_id
     */
    public Long getSuperviseId() {
        return superviseId;
    }

    /**
     * @param superviseId
     */
    public void setSuperviseId(Long superviseId) {
        this.superviseId = superviseId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return object
     */
    public String getObject() {
        return object;
    }

    /**
     * @param object
     */
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * @return date_frequency
     */
    public String getDateFrequency() {
        return dateFrequency;
    }

    /**
     * @param dateFrequency
     */
    public void setDateFrequency(String dateFrequency) {
        this.dateFrequency = dateFrequency;
    }
}