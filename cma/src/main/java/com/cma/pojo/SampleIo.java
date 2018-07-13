package com.cma.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "sample_io")
public class SampleIo {
    @Id
    @Column(name = "id")
    private Long sampleIoId;

    @Column(name = "sample_id")
    private Long sampleId;

    private String sender;

    private String receiver;

    @Column(name = "send_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date sendDate;

    private String obtainer;

    @Column(name = "obtain_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date obtainDate;

    private String note;

    @Column(name = "sample_state")
    private Byte sampleState;

    /**
     * @return id
     */
    public Long getSampleIoId() {
        return sampleIoId;
    }

    /**
     * @param sampleIoId
     */
    public void setSampleIoId(Long sampleIoId) {
        this.sampleIoId = sampleIoId;
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

    /**
     * @return send_date
     */
    public Date getSendDate() {
        return sendDate;
    }

    /**
     * @param sendDate
     */
    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    /**
     * @return obtainer
     */
    public String getObtainer() {
        return obtainer;
    }

    /**
     * @param obtainer
     */
    public void setObtainer(String obtainer) {
        this.obtainer = obtainer;
    }

    /**
     * @return obtain_date
     */
    public Date getObtainDate() {
        return obtainDate;
    }

    /**
     * @param obtainDate
     */
    public void setObtainDate(Date obtainDate) {
        this.obtainDate = obtainDate;
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