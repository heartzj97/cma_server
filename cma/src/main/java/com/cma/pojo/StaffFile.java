package com.cma.pojo;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "staff_file")
public class StaffFile {
    @Column(name = "file_id")
    private String fileId;

    @Column(name = "file_location")
    private String fileLocation;

    @Column(name = "file_image")
    private String fileImage;

    @Column(name = "user_id")
    @JsonIgnore
    private Long userId;

    /**
     * @return file_id
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * @param fileId
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * @return file_location
     */
    public String getFileLocation() {
        return fileLocation;
    }

    /**
     * @param fileLocation
     */
    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    /**
     * @return file_image
     */
    public String getFileImage() {
        return fileImage;
    }

    /**
     * @param fileImage
     */
    public void setFileImage(String fileImage) {
        this.fileImage = fileImage;
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