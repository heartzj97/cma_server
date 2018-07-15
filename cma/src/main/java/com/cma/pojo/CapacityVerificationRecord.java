package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "capacity_verification_record")
public class CapacityVerificationRecord {
    @Id
    @Column(name = "id")
    private Long recordId;

    @Column(name = "project_id")
    private Long projectId;

    private Date date;

    @Column(name = "method_id")
    private String methodId;

    @Column(name = "equipment_name")
    private String equipmentName;

    @Column(name = "equipment_id")
    private String equipmentId;

    private String experimenter;

    private String result;

    @Column(name = "result_deal")
    private String resultDeal;

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
     * @return project_id
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return method_id
     */
    public String getMethodId() {
        return methodId;
    }

    /**
     * @param methodId
     */
    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    /**
     * @return equipment_name
     */
    public String getEquipmentName() {
        return equipmentName;
    }

    /**
     * @param equipmentName
     */
    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    /**
     * @return equipment_id
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * @param equipmentId
     */
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * @return experimenter
     */
    public String getExperimenter() {
        return experimenter;
    }

    /**
     * @param experimenter
     */
    public void setExperimenter(String experimenter) {
        this.experimenter = experimenter;
    }

    /**
     * @return result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return result_deal
     */
    public String getResultDeal() {
        return resultDeal;
    }

    /**
     * @param resultDeal
     */
    public void setResultDeal(String resultDeal) {
        this.resultDeal = resultDeal;
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