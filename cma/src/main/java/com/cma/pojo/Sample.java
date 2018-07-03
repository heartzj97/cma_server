package com.cma.pojo;

import javax.persistence.*;

public class Sample {
    @Id
    @Column(name = "id")
    private Long sampleId;

    @Column(name = "sample_number")
    private String sampleNumber;

    @Column(name = "sample_name")
    private String sampleName;

    @Column(name = "sample_amount")
    private Byte sampleAmount;

    @Column(name = "sample_state")
    private Byte sampleState;

    /**
     * @return id
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
     * @return sample_name
     */
    public String getSampleName() {
        return sampleName;
    }

    /**
     * @param sampleName
     */
    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    /**
     * @return sample_amount
     */
    public Byte getSampleAmount() {
        return sampleAmount;
    }

    /**
     * @param sampleAmount
     */
    public void setSampleAmount(Byte sampleAmount) {
        this.sampleAmount = sampleAmount;
    }

    /**
     * @return sample_state
     */
    public Byte getSampleState() {
        return sampleState;
    }

    /**
     * @param sampleState
     */
    public void setSampleState(Byte sampleState) {
        this.sampleState = sampleState;
    }
}