package com.cma.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "staff_training")
public class StaffTraining {
    @Id
    @Column(name = "id")
    private Long trainingId;

    private String program;

    @Column(name = "start_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date trainingDate;

    private String place;

    private String presenter;

    private String content;

    private String note;

    /**
     * @return id
     */
    public Long getTrainingId() {
        return trainingId;
    }

    /**
     * @param trainingId
     */
    public void setTrainingId(Long trainingId) {
        this.trainingId = trainingId;
    }

    /**
     * @return program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * @return start_date
     */
    public Date getTrainingDate() {
        return trainingDate;
    }

    /**
     * @param trainingDate
     */
    public void setTrainingDate(Date trainingDate) {
        this.trainingDate = trainingDate;
    }

    /**
     * @return place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return presenter
     */
    public String getPresenter() {
        return presenter;
    }

    /**
     * @param presenter
     */
    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
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