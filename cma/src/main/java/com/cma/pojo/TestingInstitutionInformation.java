package com.cma.pojo;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "testing_institution_information")
public class TestingInstitutionInformation {
    @Id
    @JsonIgnore
    private Long id;

    @Column(name = "testing_institution_name")
    private String testingInstitutionName;

    @Column(name = "testing_institution_address")
    private String testingInstitutionAddress;

    private String postcode;

    private String fax;

    private String email;

    @Column(name = "ti_peopel_in_charge")
    private String tiPeopelInCharge;

    @Column(name = "ti_pic_position")
    private String tiPicPosition;

    @Column(name = "ti_pic_telephone")
    private String tiPicTelephone;

    @Column(name = "ti_pic_mobilephone")
    private String tiPicMobilephone;

    private String liaison;

    @Column(name = "liaison_position")
    private String liaisonPosition;

    @Column(name = "liaison_telephone")
    private String liaisonTelephone;

    @Column(name = "liaison_mobilephone")
    private String liaisonMobilephone;

    @Column(name = "social_credit_code")
    private String socialCreditCode;

    @Column(name = "legal_entity_belonged_name")
    private String legalEntityBelongedName;

    @Column(name = "legal_entity_belonged_address")
    private String legalEntityBelongedAddress;

    @Column(name = "leb_peopel_in_charge")
    private String lebPeopelInCharge;

    @Column(name = "leb_pic_position")
    private String lebPicPosition;

    @Column(name = "leb_pic_telephone")
    private String lebPicTelephone;

    @Column(name = "leb_social_credit_code")
    private String lebSocialCreditCode;

    @Column(name = "competent_department_name")
    private String competentDepartmentName;

    @Column(name = "competent_department_address")
    private String competentDepartmentAddress;

    @Column(name = "cd_peopel_in_charge")
    private String cdPeopelInCharge;

    @Column(name = "cd_pic_position")
    private String cdPicPosition;

    @Column(name = "cd_pic_telephone")
    private String cdPicTelephone;

    private Byte characteristic;

    @Column(name = "legal_entity")
    private Byte legalEntity;

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
     * @return testing_institution_name
     */
    public String getTestingInstitutionName() {
        return testingInstitutionName;
    }

    /**
     * @param testingInstitutionName
     */
    public void setTestingInstitutionName(String testingInstitutionName) {
        this.testingInstitutionName = testingInstitutionName;
    }

    /**
     * @return testing_institution_address
     */
    public String getTestingInstitutionAddress() {
        return testingInstitutionAddress;
    }

    /**
     * @param testingInstitutionAddress
     */
    public void setTestingInstitutionAddress(String testingInstitutionAddress) {
        this.testingInstitutionAddress = testingInstitutionAddress;
    }

    /**
     * @return postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * @return fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return ti_peopel_in_charge
     */
    public String getTiPeopelInCharge() {
        return tiPeopelInCharge;
    }

    /**
     * @param tiPeopelInCharge
     */
    public void setTiPeopelInCharge(String tiPeopelInCharge) {
        this.tiPeopelInCharge = tiPeopelInCharge;
    }

    /**
     * @return ti_pic_position
     */
    public String getTiPicPosition() {
        return tiPicPosition;
    }

    /**
     * @param tiPicPosition
     */
    public void setTiPicPosition(String tiPicPosition) {
        this.tiPicPosition = tiPicPosition;
    }

    /**
     * @return ti_pic_telephone
     */
    public String getTiPicTelephone() {
        return tiPicTelephone;
    }

    /**
     * @param tiPicTelephone
     */
    public void setTiPicTelephone(String tiPicTelephone) {
        this.tiPicTelephone = tiPicTelephone;
    }

    /**
     * @return ti_pic_mobilephone
     */
    public String getTiPicMobilephone() {
        return tiPicMobilephone;
    }

    /**
     * @param tiPicMobilephone
     */
    public void setTiPicMobilephone(String tiPicMobilephone) {
        this.tiPicMobilephone = tiPicMobilephone;
    }

    /**
     * @return liaison
     */
    public String getLiaison() {
        return liaison;
    }

    /**
     * @param liaison
     */
    public void setLiaison(String liaison) {
        this.liaison = liaison;
    }

    /**
     * @return liaison_position
     */
    public String getLiaisonPosition() {
        return liaisonPosition;
    }

    /**
     * @param liaisonPosition
     */
    public void setLiaisonPosition(String liaisonPosition) {
        this.liaisonPosition = liaisonPosition;
    }

    /**
     * @return liaison_telephone
     */
    public String getLiaisonTelephone() {
        return liaisonTelephone;
    }

    /**
     * @param liaisonTelephone
     */
    public void setLiaisonTelephone(String liaisonTelephone) {
        this.liaisonTelephone = liaisonTelephone;
    }

    /**
     * @return liaison_mobilephone
     */
    public String getLiaisonMobilephone() {
        return liaisonMobilephone;
    }

    /**
     * @param liaisonMobilephone
     */
    public void setLiaisonMobilephone(String liaisonMobilephone) {
        this.liaisonMobilephone = liaisonMobilephone;
    }

    /**
     * @return social_credit_code
     */
    public String getSocialCreditCode() {
        return socialCreditCode;
    }

    /**
     * @param socialCreditCode
     */
    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
    }

    /**
     * @return legal_entity_belonged_name
     */
    public String getLegalEntityBelongedName() {
        return legalEntityBelongedName;
    }

    /**
     * @param legalEntityBelongedName
     */
    public void setLegalEntityBelongedName(String legalEntityBelongedName) {
        this.legalEntityBelongedName = legalEntityBelongedName;
    }

    /**
     * @return legal_entity_belonged_address
     */
    public String getLegalEntityBelongedAddress() {
        return legalEntityBelongedAddress;
    }

    /**
     * @param legalEntityBelongedAddress
     */
    public void setLegalEntityBelongedAddress(String legalEntityBelongedAddress) {
        this.legalEntityBelongedAddress = legalEntityBelongedAddress;
    }

    /**
     * @return leb_peopel_in_charge
     */
    public String getLebPeopelInCharge() {
        return lebPeopelInCharge;
    }

    /**
     * @param lebPeopelInCharge
     */
    public void setLebPeopelInCharge(String lebPeopelInCharge) {
        this.lebPeopelInCharge = lebPeopelInCharge;
    }

    /**
     * @return leb_pic_position
     */
    public String getLebPicPosition() {
        return lebPicPosition;
    }

    /**
     * @param lebPicPosition
     */
    public void setLebPicPosition(String lebPicPosition) {
        this.lebPicPosition = lebPicPosition;
    }

    /**
     * @return leb_pic_telephone
     */
    public String getLebPicTelephone() {
        return lebPicTelephone;
    }

    /**
     * @param lebPicTelephone
     */
    public void setLebPicTelephone(String lebPicTelephone) {
        this.lebPicTelephone = lebPicTelephone;
    }

    /**
     * @return leb_social_credit_code
     */
    public String getLebSocialCreditCode() {
        return lebSocialCreditCode;
    }

    /**
     * @param lebSocialCreditCode
     */
    public void setLebSocialCreditCode(String lebSocialCreditCode) {
        this.lebSocialCreditCode = lebSocialCreditCode;
    }

    /**
     * @return competent_department_name
     */
    public String getCompetentDepartmentName() {
        return competentDepartmentName;
    }

    /**
     * @param competentDepartmentName
     */
    public void setCompetentDepartmentName(String competentDepartmentName) {
        this.competentDepartmentName = competentDepartmentName;
    }

    /**
     * @return competent_department_address
     */
    public String getCompetentDepartmentAddress() {
        return competentDepartmentAddress;
    }

    /**
     * @param competentDepartmentAddress
     */
    public void setCompetentDepartmentAddress(String competentDepartmentAddress) {
        this.competentDepartmentAddress = competentDepartmentAddress;
    }

    /**
     * @return cd_peopel_in_charge
     */
    public String getCdPeopelInCharge() {
        return cdPeopelInCharge;
    }

    /**
     * @param cdPeopelInCharge
     */
    public void setCdPeopelInCharge(String cdPeopelInCharge) {
        this.cdPeopelInCharge = cdPeopelInCharge;
    }

    /**
     * @return cd_pic_position
     */
    public String getCdPicPosition() {
        return cdPicPosition;
    }

    /**
     * @param cdPicPosition
     */
    public void setCdPicPosition(String cdPicPosition) {
        this.cdPicPosition = cdPicPosition;
    }

    /**
     * @return cd_pic_telephone
     */
    public String getCdPicTelephone() {
        return cdPicTelephone;
    }

    /**
     * @param cdPicTelephone
     */
    public void setCdPicTelephone(String cdPicTelephone) {
        this.cdPicTelephone = cdPicTelephone;
    }

    /**
     * @return characteristic
     */
    public Byte getCharacteristic() {
        return characteristic;
    }

    /**
     * @param characteristic
     */
    public void setCharacteristic(Byte characteristic) {
        this.characteristic = characteristic;
    }

    /**
     * @return legal_entity
     */
    public Byte getLegalEntity() {
        return legalEntity;
    }

    /**
     * @param legalEntity
     */
    public void setLegalEntity(Byte legalEntity) {
        this.legalEntity = legalEntity;
    }
}