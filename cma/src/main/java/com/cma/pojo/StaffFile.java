package com.cma.pojo;

import javax.persistence.*;

@Table(name = "staff_file")
public class StaffFile {
    @Id
    private Long id;

<<<<<<< HEAD
    private String name;

    private String department;

    @Column(name = "fileId")
    private String fileid;
=======
    @Column(name = "file_id")
    private String fileId;
>>>>>>> 6fd371ea060d5a786025a6cd1a2715cdfe725bbb

    @Column(name = "file_location")
    private String fileLocation;

    @Column(name = "fileImage")
    private String fileimage;

    @Column(name = "user_id")
    private Long userId;

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
<<<<<<< HEAD
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return fileId
=======
     * @return file_id
>>>>>>> 6fd371ea060d5a786025a6cd1a2715cdfe725bbb
     */
    public String getFileid() {
        return fileid;
    }

    /**
     * @param fileid
     */
    public void setFileid(String fileid) {
        this.fileid = fileid;
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
     * @return fileImage
     */
    public String getFileimage() {
        return fileimage;
    }

    /**
     * @param fileimage
     */
    public void setFileimage(String fileimage) {
        this.fileimage = fileimage;
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