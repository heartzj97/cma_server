package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "staff_appointment")
public class StaffAppointment {
    @Id
    private Long id;

    private String name;

    private String title;

    private String degree;

    private String major;

    @Column(name = "graduation_time")
    private Date graduationTime;

    private String department;

    private String position;

    @Column(name = "comfirm_person")
    private String comfirmPerson;

    @Column(name = "confirmDate")
    private Date confirmdate;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @param degree
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return graduation_time
     */
    public Date getGraduationTime() {
        return graduationTime;
    }

    /**
     * @param graduationTime
     */
    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
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
     * @return comfirm_person
     */
    public String getComfirmPerson() {
        return comfirmPerson;
    }

    /**
     * @param comfirmPerson
     */
    public void setComfirmPerson(String comfirmPerson) {
        this.comfirmPerson = comfirmPerson;
    }

    /**
     * @return confirmDate
     */
    public Date getConfirmdate() {
        return confirmdate;
    }

    /**
     * @param confirmdate
     */
    public void setConfirmdate(Date confirmdate) {
        this.confirmdate = confirmdate;
    }
}