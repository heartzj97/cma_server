package com.cma.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "annual_training_plan")
public class AnnualTrainingPlan {
    @Id
    @Column(name = "id")
    private Long planId;

    private Long year;

    @Column(name = "train_project")
    private String trainProject;

    private String people;

    private String method;

    @Column(name = "training_time")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Long trainingTime;

    @Column(name = "strat_time")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date stratTime;

    @Column(name = "end_time")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date endTime;

    private String note;

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
     * @return year
     */
    public Long getYear() {
        return year;
    }

    /**
     * @param year
     */
    public void setYear(Long year) {
        this.year = year;
    }

    /**
     * @return train_project
     */
    public String getTrainProject() {
        return trainProject;
    }

    /**
     * @param trainProject
     */
    public void setTrainProject(String trainProject) {
        this.trainProject = trainProject;
    }

    /**
     * @return people
     */
    public String getPeople() {
        return people;
    }

    /**
     * @param people
     */
    public void setPeople(String people) {
        this.people = people;
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
     * @return training_time
     */
    public Long getTrainingTime() {
        return trainingTime;
    }

    /**
     * @param trainingTime
     */
    public void setTrainingTime(Long trainingTime) {
        this.trainingTime = trainingTime;
    }

    /**
     * @return strat_time
     */
    public Date getStratTime() {
        return stratTime;
    }

    /**
     * @param stratTime
     */
    public void setStratTime(Date stratTime) {
        this.stratTime = stratTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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