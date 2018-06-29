package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "equipment_receive")
public class EquipmentReceive {
    @Id
    private Long id;

    private String name;

    private String model;

    private String manufacturer;

    @Column(name = "receive_situation")
    private String receiveSituation;

    private String recipient;

    @Column(name = "receive_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date receiveDate;

    @Column(name = "equipment_situation")
    private String equipmentSituation;

    private String acceptance;

    @Column(name = "acceptance_person")
    private String acceptancePerson;

    @Column(name = "acceptance_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date acceptanceDate;

    private String attachment;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return receive_situation
     */
    public String getReceiveSituation() {
        return receiveSituation;
    }

    /**
     * @param receiveSituation
     */
    public void setReceiveSituation(String receiveSituation) {
        this.receiveSituation = receiveSituation;
    }

    /**
     * @return recipient
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * @param recipient
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * @return receive_date
     */
    public Date getReceiveDate() {
        return receiveDate;
    }

    /**
     * @param receiveDate
     */
    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    /**
     * @return equipment_situation
     */
    public String getEquipmentSituation() {
        return equipmentSituation;
    }

    /**
     * @param equipmentSituation
     */
    public void setEquipmentSituation(String equipmentSituation) {
        this.equipmentSituation = equipmentSituation;
    }

    /**
     * @return acceptance
     */
    public String getAcceptance() {
        return acceptance;
    }

    /**
     * @param acceptance
     */
    public void setAcceptance(String acceptance) {
        this.acceptance = acceptance;
    }

    /**
     * @return acceptance_person
     */
    public String getAcceptancePerson() {
        return acceptancePerson;
    }

    /**
     * @param acceptancePerson
     */
    public void setAcceptancePerson(String acceptancePerson) {
        this.acceptancePerson = acceptancePerson;
    }

    /**
     * @return acceptance_date
     */
    public Date getAcceptanceDate() {
        return acceptanceDate;
    }

    /**
     * @param acceptanceDate
     */
    public void setAcceptanceDate(Date acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    /**
     * @return attachment
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * @param attachment
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
}