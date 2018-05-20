package com.cma.pojo;

<<<<<<< HEAD
import javax.persistence.*;
=======
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
>>>>>>> cb5d551ea780a4e117f279c6e7e97761f309bac7

@Table(name = "staff_file")
public class StaffFile {
    @Id
    private Long id;
<<<<<<< HEAD

=======
/*
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_time")
    private Date modifyTime;
*/
>>>>>>> cb5d551ea780a4e117f279c6e7e97761f309bac7
    private String name;

    private String department;

    private String position;

    @Column(name = "file_id")
    private String fileId;

    private String location;

    @Column(name = "file_image")
    private String fileImage;

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
=======
//     * @return create_time
//     */
//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    /**
//     * @param createTime
//     */
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }
//
//    /**
//     * @return modify_time
//     */
//    public Date getModifyTime() {
//        return modifyTime;
//    }
//
//    /**
//     * @param modifyTime
//     */
//    public void setModifyTime(Date modifyTime) {
//        this.modifyTime = modifyTime;
//    }

    /**
>>>>>>> cb5d551ea780a4e117f279c6e7e97761f309bac7
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
     * @return position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

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
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
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
}