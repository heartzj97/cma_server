package com.cma.pojo;

import java.util.Date;

public class StaffLeaving {
	private Long id;
	private String name;
	private String department;
	private String position;
	private Date leavingDate;
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
     * @return leaving_date
     */
    public Date getLeavingDate() {
        return leavingDate;
    }

    /**
     * @param leavingDate
     */
    public void setLeavingDate(Date leavingDate) {
        this.leavingDate = leavingDate;
    }
}
