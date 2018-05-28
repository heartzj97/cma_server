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

    private Byte gender;

    private String title;

    private String degree;

    @Column(name = "graduation_school")
    private String graduationSchool;

    @Column(name = "graduation_major")
    private String graduationMajor;

    @Column(name = "graduation_date")
    private Date graduationDate;

    @Column(name = "working_years")
    private Byte workingYears;

    @Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", department=" + department + ", position=" + position
				+ ", gender=" + gender + ", title=" + title + ", degree=" + degree + ", graduationSchool="
				+ graduationSchool + ", graduationMajor=" + graduationMajor + ", graduationDate=" + graduationDate
				+ ", workingYears=" + workingYears + "]";
	}

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
    public Byte getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(Byte gender) {
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
     * @return graduation_date
     */
    public Date getGraduationDate() {
        return graduationDate;
    }

    /**
     * @param graduationDate
     */
    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
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
}