package com.cma.pojo;

import javax.persistence.*;

@Table(name = "capacity_verification_plan")
public class CapacityVerificationPlan {
    @Id
    @Column(name = "id")
    private Long planId;

    private String name;

    private String organizer;

    private Long state;

    private String year;

    private String note;

    private String analysis;

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
     * @return organizer
     */
    public String getOrganizer() {
        return organizer;
    }

    /**
     * @param organizer
     */
    public void setOrganizer(String organizer) {
        this.organizer = organizer;
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
     * @return year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
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

    /**
     * @return analysis
     */
    public String getAnalysis() {
        return analysis;
    }

    /**
     * @param analysis
     */
    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }
}