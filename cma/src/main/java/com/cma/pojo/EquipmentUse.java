package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "equipment_use")
public class EquipmentUse {
    @Id
    private Long id;

    @Column(name = "equipment_id")
    private Long equipmentId;

    @Column(name = "use_date")
    private Date useDate;

    @Column(name = "open_time")
    private Date openTime;

    @Column(name = "close_time")
    private Date closeTime;

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
     * @return open_time
     */
    public Date getOpenTime() {
        return openTime;
    }

    /**
     * @param openTime
     */
    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    /**
     * @return close_time
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * @param closeTime
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
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