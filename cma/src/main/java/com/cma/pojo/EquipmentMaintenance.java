package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "equipment_maintenance")
public class EquipmentMaintenance {
    @Id
    private Long id;

    @Column(name = "equipment_id")
    private Long equipmentId;

    @Column(name = "maintenance_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date maintenanceDate;

    @Column(name = "maintenance_content")
    private String maintenanceContent;

    @Column(name = "maintenance_person")
    private String maintenancePerson;

    private String confirmer;

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
     * @return maintenance_date
     */
    public Date getMaintenanceDate() {
        return maintenanceDate;
    }

    /**
     * @param maintenanceDate
     */
    public void setMaintenanceDate(Date maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    /**
     * @return maintenance_content
     */
    public String getMaintenanceContent() {
        return maintenanceContent;
    }

    /**
     * @param maintenanceContent
     */
    public void setMaintenanceContent(String maintenanceContent) {
        this.maintenanceContent = maintenanceContent;
    }

    /**
     * @return maintenance_person
     */
    public String getMaintenancePerson() {
        return maintenancePerson;
    }

    /**
     * @param maintenancePerson
     */
    public void setMaintenancePerson(String maintenancePerson) {
        this.maintenancePerson = maintenancePerson;
    }

    /**
     * @return confirmer
     */
    public String getConfirmer() {
        return confirmer;
    }

    /**
     * @param confirmer
     */
    public void setConfirmer(String confirmer) {
        this.confirmer = confirmer;
    }
}