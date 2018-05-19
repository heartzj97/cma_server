package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "staff_file")
public class StaffFile {
    @Id
    private Long id;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_time")
    private Date modifyTime;

    private String name;

    private String department;

    @Column(name = "fileId")
    private String fileid;

    private String location;

    @Column(name = "fileImage")
    private String fileimage;

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
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return modify_time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
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
}