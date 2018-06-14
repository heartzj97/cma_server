package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "intermediate_checks_record")
public class IntermediateChecksRecord {
    @Id
    @Column(name = "id")
    private Long recordId;

    @Column(name = "plan_id")
    private Long planId;

    private String object;

    @Column(name = "check_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date checkDate;

    @Column(name = "process_record")
    private String processRecord;

    @Column(name = "process_record_person")
    private String processRecordPerson;

    @Column(name = "process_record_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date processRecordDate;

    @Column(name = "result_record")
    private String resultRecord;

    @Column(name = "result_record_person")
    private String resultRecordPerson;

    @Column(name = "result_record_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date resultRecordDate;

    private String note;

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
     * @return check_date
     */
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * @param checkDate
     */
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * @return process_record
     */
    public String getProcessRecord() {
        return processRecord;
    }

    /**
     * @param processRecord
     */
    public void setProcessRecord(String processRecord) {
        this.processRecord = processRecord;
    }

    /**
     * @return process_record_person
     */
    public String getProcessRecordPerson() {
        return processRecordPerson;
    }

    /**
     * @param processRecordPerson
     */
    public void setProcessRecordPerson(String processRecordPerson) {
        this.processRecordPerson = processRecordPerson;
    }

    /**
     * @return process_record_date
     */
    public Date getProcessRecordDate() {
        return processRecordDate;
    }

    /**
     * @param processRecordDate
     */
    public void setProcessRecordDate(Date processRecordDate) {
        this.processRecordDate = processRecordDate;
    }

    /**
     * @return result_record
     */
    public String getResultRecord() {
        return resultRecord;
    }

    /**
     * @param resultRecord
     */
    public void setResultRecord(String resultRecord) {
        this.resultRecord = resultRecord;
    }

    /**
     * @return result_record_person
     */
    public String getResultRecordPerson() {
        return resultRecordPerson;
    }

    /**
     * @param resultRecordPerson
     */
    public void setResultRecordPerson(String resultRecordPerson) {
        this.resultRecordPerson = resultRecordPerson;
    }

    /**
     * @return result_record_date
     */
    public Date getResultRecordDate() {
        return resultRecordDate;
    }

    /**
     * @param resultRecordDate
     */
    public void setResultRecordDate(Date resultRecordDate) {
        this.resultRecordDate = resultRecordDate;
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