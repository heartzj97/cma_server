package com.cma.pojo;

import javax.persistence.*;

@Table(name = "staff_qualification")
public class StaffQualification {
    @Id
    @Column(name = "id")
    private Long qualificationId;

    @Column(name = "qualification_name")
    private String qualificationName;

    @Column(name = "qualification_image")
    private String qualificationImage;

    @Column(name = "user_id")
    private Long userId;

    /**
     * @return id
     */
    public Long getQualificationId() {
        return qualificationId;
    }

    /**
     * @param qualificationId
     */
    public void setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
    }

    /**
     * @return qualification_name
     */
    public String getQualificationName() {
        return qualificationName;
    }

    /**
     * @param qualificationName
     */
    public void setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
    }

    /**
     * @return qualification_image
     */
    public String getQualificationImage() {
        return qualificationImage;
    }

    /**
     * @param qualificationImage
     */
    public void setQualificationImage(String qualificationImage) {
        this.qualificationImage = qualificationImage;
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
}