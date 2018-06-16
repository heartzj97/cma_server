package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

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
    private Long trainingTime;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
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
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
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