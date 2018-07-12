package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "sample_receive")
public class SampleReceive {
    @Column(name = "sample_id")
    private Long sampleId;

    private String requester;

    private String receiver;

    @Column(name = "receive_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date receiveDate;

    private String obtainer;

    @Column(name = "obtain_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date obtainDate;

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
     * @return requester
     */
    public String getRequester() {
        return requester;
    }

    /**
     * @param requester
     */
    public void setRequester(String requester) {
        this.requester = requester;
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

	@Override
	public String toString() {
		return "SampleReceive [sampleId=" + sampleId + ", requester=" + requester + ", receiver=" + receiver
				+ ", receiveDate=" + receiveDate + ", obtainer=" + obtainer + ", obtainDate=" + obtainDate + "]";
	}
    
    
}