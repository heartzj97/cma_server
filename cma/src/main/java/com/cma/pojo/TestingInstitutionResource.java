package com.cma.pojo;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "testing_institution_resource")
public class TestingInstitutionResource {
    @Id
    @JsonIgnore
    private Long id;

    @Column(name = "total_number")
    private Byte totalNumber;

    @Column(name = "senior_professional_title")
    private Byte seniorProfessionalTitle;

    @Column(name = "intermediate_professional_title")
    private Byte intermediateProfessionalTitle;

    @Column(name = "primary_professional_title")
    private Byte primaryProfessionalTitle;

    @Column(name = "fixed_assets")
    private Double fixedAssets;

    @Column(name = "equipment_number")
    private Byte equipmentNumber;

    @Column(name = "floor_space")
    private Double floorSpace;

    @Column(name = "stable_area")
    private Double stableArea;

    @Column(name = "outdoors_area")
    private Double outdoorsArea;

    @Column(name = "name_and_address")
    private String nameAndAddress;

    @Column(name = "new_place")
    private String newPlace;

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
     * @return total_number
     */
    public Byte getTotalNumber() {
        return totalNumber;
    }

    /**
     * @param totalNumber
     */
    public void setTotalNumber(Byte totalNumber) {
        this.totalNumber = totalNumber;
    }

    /**
     * @return senior_professional_title
     */
    public Byte getSeniorProfessionalTitle() {
        return seniorProfessionalTitle;
    }

    /**
     * @param seniorProfessionalTitle
     */
    public void setSeniorProfessionalTitle(Byte seniorProfessionalTitle) {
        this.seniorProfessionalTitle = seniorProfessionalTitle;
    }

    /**
     * @return intermediate_professional_title
     */
    public Byte getIntermediateProfessionalTitle() {
        return intermediateProfessionalTitle;
    }

    /**
     * @param intermediateProfessionalTitle
     */
    public void setIntermediateProfessionalTitle(Byte intermediateProfessionalTitle) {
        this.intermediateProfessionalTitle = intermediateProfessionalTitle;
    }

    /**
     * @return primary_professional_title
     */
    public Byte getPrimaryProfessionalTitle() {
        return primaryProfessionalTitle;
    }

    /**
     * @param primaryProfessionalTitle
     */
    public void setPrimaryProfessionalTitle(Byte primaryProfessionalTitle) {
        this.primaryProfessionalTitle = primaryProfessionalTitle;
    }

    /**
     * @return fixed_assets
     */
    public Double getFixedAssets() {
        return fixedAssets;
    }

    /**
     * @param fixedAssets
     */
    public void setFixedAssets(Double fixedAssets) {
        this.fixedAssets = fixedAssets;
    }

    /**
     * @return equipment_number
     */
    public Byte getEquipmentNumber() {
        return equipmentNumber;
    }

    /**
     * @param equipmentNumber
     */
    public void setEquipmentNumber(Byte equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    /**
     * @return floor_space
     */
    public Double getFloorSpace() {
        return floorSpace;
    }

    /**
     * @param floorSpace
     */
    public void setFloorSpace(Double floorSpace) {
        this.floorSpace = floorSpace;
    }

    /**
     * @return stable_area
     */
    public Double getStableArea() {
        return stableArea;
    }

    /**
     * @param stableArea
     */
    public void setStableArea(Double stableArea) {
        this.stableArea = stableArea;
    }

    /**
     * @return outdoors_area
     */
    public Double getOutdoorsArea() {
        return outdoorsArea;
    }

    /**
     * @param outdoorsArea
     */
    public void setOutdoorsArea(Double outdoorsArea) {
        this.outdoorsArea = outdoorsArea;
    }

    /**
     * @return name_and_address
     */
    public String getNameAndAddress() {
        return nameAndAddress;
    }

    /**
     * @param nameAndAddress
     */
    public void setNameAndAddress(String nameAndAddress) {
        this.nameAndAddress = nameAndAddress;
    }

    /**
     * @return new_place
     */
    public String getNewPlace() {
        return newPlace;
    }

    /**
     * @param newPlace
     */
    public void setNewPlace(String newPlace) {
        this.newPlace = newPlace;
    }
}