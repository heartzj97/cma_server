package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user")
public class Staff {
    @Id
    private Long id;

    private String name;

    private String department;

    private String position;

    private Boolean gender;

    private String title;

    private String degree;

    @Column(name = "graduation_school")
    private String graduationSchool;

    @Column(name = "graduation_major")
    private String graduationMajor;

    @Column(name = "graduation_time")
    private Date graduationTime;

    @Column(name = "working_years")
    private Byte workingYears;

    @Column(name = "is_leaving")
    private Boolean isLeaving;

<<<<<<< HEAD:cma/src/main/java/com/cma/pojo/StaffAppointment.java
    @Column(name = "confirmDate")
    private Date confirmdate;
=======
    @Column(name = "leaving_time")
    private Date leavingTime;
>>>>>>> 6fd371ea060d5a786025a6cd1a2715cdfe725bbb:cma/src/main/java/com/cma/pojo/Staff.java

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
     * @return gender
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
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
     * @return graduation_school
     */
    public String getGraduationSchool() {
        return graduationSchool;
    }

    /**
     * @param graduationSchool
     */
    public void setGraduationSchool(String graduationSchool) {
        this.graduationSchool = graduationSchool;
    }

    /**
     * @return graduation_major
     */
    public String getGraduationMajor() {
        return graduationMajor;
    }

    /**
     * @param graduationMajor
     */
    public void setGraduationMajor(String graduationMajor) {
        this.graduationMajor = graduationMajor;
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
     * @return working_years
     */
    public Byte getWorkingYears() {
        return workingYears;
    }

    /**
     * @param workingYears
     */
    public void setWorkingYears(Byte workingYears) {
        this.workingYears = workingYears;
    }

    /**
     * @return is_leaving
     */
    public Boolean getIsLeaving() {
        return isLeaving;
    }

    /**
     * @param isLeaving
     */
    public void setIsLeaving(Boolean isLeaving) {
        this.isLeaving = isLeaving;
    }

    /**
<<<<<<< HEAD:cma/src/main/java/com/cma/pojo/StaffAppointment.java
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
=======
     * @return leaving_time
     */
    public Date getLeavingTime() {
        return leavingTime;
    }

    /**
     * @param leavingTime
     */
    public void setLeavingTime(Date leavingTime) {
        this.leavingTime = leavingTime;
>>>>>>> 6fd371ea060d5a786025a6cd1a2715cdfe725bbb:cma/src/main/java/com/cma/pojo/Staff.java
    }
}