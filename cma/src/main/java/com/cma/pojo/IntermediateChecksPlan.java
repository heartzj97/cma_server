package com.cma.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "intermediate_checks_plan")
public class IntermediateChecksPlan {
    @Id
    @Column(name = "id")
    private Long planId;

    private String object;

    private String content;

    @Column(name = "check_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date checkDate;

    @Column(name = "person_in_charge")
    private String personInCharge;

    private Byte state;

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
     * @return person_in_charge
     */
    public String getPersonInCharge() {
        return personInCharge;
    }

    /**
     * @param personInCharge
     */
    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    /**
     * @return state
     */
    public Byte getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Byte state) {
        this.state = state;
    }
}