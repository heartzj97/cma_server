package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

public class Supervision {
    @Id
    private Long id;

    private String author;

    @Column(name = "create_date")
    private Date createDate;

    private String approver;

    @Column(name = "approve_date")
    private Date approveDate;

    private String remark;

    private Byte situation;

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

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
}