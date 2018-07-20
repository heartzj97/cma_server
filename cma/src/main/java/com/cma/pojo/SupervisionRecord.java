package com.cma.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "supervision_record")
public class SupervisionRecord {
    @Id
    @Column(name = "id")
    private Long recordId;

    private String department;

    private String supervisor;

    @Column(name = "supervise_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date superviseDate;

    @Column(name = "supervised_person")
    private String supervisedPerson;

    private String record;

    private String conclusion;

    private String operator;

    @Column(name = "record_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date recordDate;

    @Column(name = "plan_id")
    private Long planId;

    /**
     * @return id
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * @param recordId
     */
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
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
     * @return supervisor
     */
    public String getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor
     */
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * @return supervise_date
     */
    public Date getSuperviseDate() {
        return superviseDate;
    }

    /**
     * @param superviseDate
     */
    public void setSuperviseDate(Date superviseDate) {
        this.superviseDate = superviseDate;
    }

    /**
     * @return supervised_person
     */
    public String getSupervisedPerson() {
        return supervisedPerson;
    }

    /**
     * @param supervisedPerson
     */
    public void setSupervisedPerson(String supervisedPerson) {
        this.supervisedPerson = supervisedPerson;
    }

    /**
     * @return record
     */
    public String getRecord() {
        return record;
    }

    /**
     * @param record
     */
    public void setRecord(String record) {
        this.record = record;
    }

    /**
     * @return conclusion
     */
    public String getConclusion() {
        return conclusion;
    }

    /**
     * @param conclusion
     */
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * @return record_date
     */
    public Date getRecordDate() {
        return recordDate;
    }

    /**
     * @param recordDate
     */
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
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
}