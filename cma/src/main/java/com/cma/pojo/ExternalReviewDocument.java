package com.cma.pojo;

import javax.persistence.*;

@Table(name = "external_review_document")
public class ExternalReviewDocument {
    @Id
    @Column(name = "id")
    private Long fileId;

    private Long year;

    @Column(name = "file_name")
    private String fileName;

    /**
     * @return id
     */
    public Long getFileId() {
        return fileId;
    }

    /**
     * @param fileId
     */
    public void setFileId(Long fileId) {
        this.fileId = fileId;
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
}