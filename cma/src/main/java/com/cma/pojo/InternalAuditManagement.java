package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "internal_audit_management")
public class InternalAuditManagement {
    @Id
    private Long id;

    private Long year;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date date;

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
     * @return year
     */
    public Long getYear() {
        return year;
    }

    /**
     * @param year
     */
    public void setYear(Long year) {
        this.year = year;
    }

    /**
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}