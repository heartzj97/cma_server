package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "equipment_use")
public class EquipmentUse {
    @Id
    private Long id;

    @Column(name = "equipment_id")
    private Long equipmentId;

    @Column(name = "use_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date useDate;

    @Column(name = "open_date")
    @JsonFormat(pattern = "HH:mm:ss",timezone="GMT+8")
    private Date openDate;

    @Column(name = "close_date")
    @JsonFormat(pattern = "HH:mm:ss",timezone="GMT+8")
    private Date closeDate;

    @Column(name = "sample_number")
    private String sampleNumber;

    @Column(name = "test_project")
    private String testProject;

    @Column(name = "before_use")
    private String beforeUse;

    @Column(name = "after_use")
    private String afterUse;

    private String user;

    private String remark;

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
     * @return equipment_id
     */
    public Long getEquipmentId() {
        return equipmentId;
    }

    /**
     * @param equipmentId
     */
    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * @return use_date
     */
    public Date getUseDate() {
        return useDate;
    }

    /**
     * @param useDate
     */
    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    /**
     * @return open_date
     */
    public Date getOpenDate() {
        return openDate;
    }

    /**
     * @param openDate
     */
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    /**
     * @return close_date
     */
    public Date getCloseDate() {
        return closeDate;
    }

    /**
     * @param closeDate
     */
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    /**
     * @return sample_number
     */
    public String getSampleNumber() {
        return sampleNumber;
    }

    /**
     * @param sampleNumber
     */
    public void setSampleNumber(String sampleNumber) {
        this.sampleNumber = sampleNumber;
    }

    /**
     * @return test_project
     */
    public String getTestProject() {
        return testProject;
    }

    /**
     * @param testProject
     */
    public void setTestProject(String testProject) {
        this.testProject = testProject;
    }

    /**
     * @return before_use
     */
    public String getBeforeUse() {
        return beforeUse;
    }

    /**
     * @param beforeUse
     */
    public void setBeforeUse(String beforeUse) {
        this.beforeUse = beforeUse;
    }

    /**
     * @return after_use
     */
    public String getAfterUse() {
        return afterUse;
    }

    /**
     * @param afterUse
     */
    public void setAfterUse(String afterUse) {
        this.afterUse = afterUse;
    }

    /**
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
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
}