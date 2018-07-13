package com.cma.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "training_application")
public class TrainingApplication {
    @Id
    private Long id;

    private String name;

    private String people;

    @Column(name = "training_unit")
    private String trainingUnit;

    private Long expense;

    private String reason;

    private Byte situation;

    private String department;

    @Column(name = "create_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date createDate;

    private String approver;

    @Column(name = "approve_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date approveDate;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
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
     * @return training_unit
     */
    public String getTrainingUnit() {
        return trainingUnit;
    }

    /**
     * @param trainingUnit
     */
    public void setTrainingUnit(String trainingUnit) {
        this.trainingUnit = trainingUnit;
    }

    /**
     * @return expense
     */
    public Long getExpense() {
        return expense;
    }

    /**
     * @param expense
     */
    public void setExpense(Long expense) {
        this.expense = expense;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return situation
     */
    public Byte getSituation() {
        return situation;
    }

    /**
     * @param situation
     */
    public void setSituation(Byte situation) {
        this.situation = situation;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return approver
     */
    public String getApprover() {
        return approver;
    }

    /**
     * @param approver
     */
    public void setApprover(String approver) {
        this.approver = approver;
    }

    /**
     * @return approve_date
     */
    public Date getApproveDate() {
        return approveDate;
    }

    /**
     * @param approveDate
     */
    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }
}