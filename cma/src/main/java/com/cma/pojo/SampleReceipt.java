package com.cma.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "sample_receipt")
public class SampleReceipt {
    @Id
    @JsonIgnore
    private Long id;

    @Column(name = "sample_id")
    private Long sampleId;

    @Column(name = "application_unit")
    private String applicationUnit;

    private String version;

    @Column(name = "contract_id")
    private String contractId;

    @Column(name = "test_type")
    private Byte testType;

    @Column(name = "electronic_media")
    private String electronicMedia;

    @Column(name = "software_type")
    private Byte softwareType;

    @Column(name = "receive_unit")
    private String receiveUnit;

    @Column(name = "receive_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date receiveDate;

    private String sender;

    private String receiver;
    
    @Transient
    private String sampleName;
    
    @Transient
    private Byte ReadMe;
    
    @Transient
    private Byte Application;
    
    @Transient
    private Byte MaterialReceipt;
    
    @Transient
    private Byte Functions; 
    
    @Transient
    private Byte Confirmations;
    
    @Transient
    private Byte Introduction; 
    
    @Transient
    private Byte Guarantee;
    
    @Transient
    private Byte softwareSample;

	@Transient
    private String other;

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
     * @return sample_id
     */
    public Long getSampleId() {
        return sampleId;
    }

    /**
     * @param sampleId
     */
    public void setSampleId(Long sampleId) {
        this.sampleId = sampleId;
    }

    /**
     * @return application_unit
     */
    public String getApplicationUnit() {
        return applicationUnit;
    }

    /**
     * @param applicationUnit
     */
    public void setApplicationUnit(String applicationUnit) {
        this.applicationUnit = applicationUnit;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return contract_id
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * @param contractId
     */
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    /**
     * @return test_type
     */
    public Byte getTestType() {
        return testType;
    }

    /**
     * @param testType
     */
    public void setTestType(Byte testType) {
        this.testType = testType;
    }

    /**
     * @return electronic_media
     */
    public String getElectronicMedia() {
        return electronicMedia;
    }

    /**
     * @param electronicMedia
     */
    public void setElectronicMedia(String electronicMedia) {
        this.electronicMedia = electronicMedia;
    }

    /**
     * @return software_type
     */
    public Byte getSoftwareType() {
        return softwareType;
    }

    /**
     * @param softwareType
     */
    public void setSoftwareType(Byte softwareType) {
        this.softwareType = softwareType;
    }

    /**
     * @return receive_unit
     */
    public String getReceiveUnit() {
        return receiveUnit;
    }

    /**
     * @param receiveUnit
     */
    public void setReceiveUnit(String receiveUnit) {
        this.receiveUnit = receiveUnit;
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
     * @return sender
     */
    public String getSender() {
        return sender;
    }

    /**
     * @param sender
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * @return receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * @param receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public Byte getReadMe() {
		return ReadMe;
	}

	public void setReadMe(Byte readMe) {
		ReadMe = readMe;
	}

	public Byte getApplication() {
		return Application;
	}

	public void setApplication(Byte application) {
		Application = application;
	}

	public Byte getMaterialReceipt() {
		return MaterialReceipt;
	}

	public void setMaterialReceipt(Byte materialReceipt) {
		MaterialReceipt = materialReceipt;
	}

	public Byte getFunctions() {
		return Functions;
	}

	public void setFunctions(Byte functions) {
		Functions = functions;
	}

	public Byte getConfirmations() {
		return Confirmations;
	}

	public void setConfirmations(Byte confirmations) {
		Confirmations = confirmations;
	}

	public Byte getIntroduction() {
		return Introduction;
	}

	public void setIntroduction(Byte introduction) {
		Introduction = introduction;
	}

	public Byte getGuarantee() {
		return Guarantee;
	}

	public void setGuarantee(Byte guarantee) {
		Guarantee = guarantee;
	}

	public Byte getSoftwareSample() {
		return softwareSample;
	}

	public void setSoftwareSample(Byte softwareSample) {
		this.softwareSample = softwareSample;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}
}