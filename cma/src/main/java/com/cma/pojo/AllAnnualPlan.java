package com.cma.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "all_annual_plan")
public class AllAnnualPlan {
    @Id
    private Long year;

    private String author;

    @Column(name = "create_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date createDate;

    private String approver;

    @Column(name = "approve_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date approveDate;

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
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
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