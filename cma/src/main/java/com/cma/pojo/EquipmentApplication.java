package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "equipment_application")
public class EquipmentApplication {
    @Id
    private Long id;

    private String applicant;

    @Column(name = "application_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date applicationDate;

    @Column(name = "application_purpose")
    private String applicationPurpose;

    @Column(name = "equipment_use")
    private Byte equipmentUse;

    @Column(name = "equipment_number")
    private String equipmentNumber;

    @Column(name = "software_info")
    private String softwareInfo;

    private String auditor;

    @Column(name = "audit_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date auditDate;

    @Column(name = "audit_opinion")
    private String auditOpinion;

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
     * @return applicant
     */
    public String getApplicant() {
        return applicant;
    }

    /**
     * @param applicant
     */
    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    /**
     * @return application_date
     */
    public Date getApplicationDate() {
        return applicationDate;
    }

    /**
     * @param applicationDate
     */
    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    /**
     * @return application_purpose
     */
    public String getApplicationPurpose() {
        return applicationPurpose;
    }

    /**
     * @param applicationPurpose
     */
    public void setApplicationPurpose(String applicationPurpose) {
        this.applicationPurpose = applicationPurpose;
    }

    /**
     * @return equipment_use
     */
    public Byte getEquipmentUse() {
        return equipmentUse;
    }

    /**
     * @param equipmentUse
     */
    public void setEquipmentUse(Byte equipmentUse) {
        this.equipmentUse = equipmentUse;
    }

    /**
     * @return equipment_number
     */
    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    /**
     * @param equipmentNumber
     */
    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    /**
     * @return software_info
     */
    public String getSoftwareInfo() {
        return softwareInfo;
    }

    /**
     * @param softwareInfo
     */
    public void setSoftwareInfo(String softwareInfo) {
        this.softwareInfo = softwareInfo;
    }

    /**
     * @return auditor
     */
    public String getAuditor() {
        return auditor;
    }

    /**
     * @param auditor
     */
    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    /**
     * @return audit_date
     */
    public Date getAuditDate() {
        return auditDate;
    }

    /**
     * @param auditDate
     */
    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    /**
     * @return audit_opinion
     */
    public String getAuditOpinion() {
        return auditOpinion;
    }

    /**
     * @param auditOpinion
     */
    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }
}