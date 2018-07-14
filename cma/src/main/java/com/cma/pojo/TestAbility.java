package com.cma.pojo;

import javax.persistence.*;

@Table(name = "test_ability")
public class TestAbility {
    @Id
    @Column(name = "id")
    private Long year;

    @Column(name = "file_name")
    private String fileName;

    private String file;

    /**
     * @return id
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
     * @return file_name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file
     */
    public void setFile(String file) {
        this.file = file;
    }
}