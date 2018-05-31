package com.cma.pojo;

import javax.persistence.*;

@Table(name = "staff_training_result")
public class StaffTrainingResult {
    @Id
    private Long id;

    @Column(name = "training_id")
    private Long trainingId;

    @Column(name = "user_id")
    private Long userId;

    private String result;

    private String note;
    
    //用于做1对1级联，一个培训结果对应一项培训
    private StaffTraining staffTraining;
    
    //用于做培训结果对应到人员的一对一级联
    private Staff staff;

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
     * @return training_id
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
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
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
     * @return staffTraining
     */
    public StaffTraining getstaffTraining() {
        return staffTraining;
    }

    /**
     * @param staffTraining
     */
    public void setstaffTraining(StaffTraining staffTraining) {
        this.staffTraining = staffTraining;
    }
    
    /**
     * @return staff
     */
    public Staff getstaff() {
        return staff;
    }

    /**
     * @param staff
     */
    public void setstaff(Staff staff) {
        this.staff = staff;
    }
}