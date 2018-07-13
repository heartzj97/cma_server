package com.cma.pojo;

import javax.persistence.*;

@Table(name = "standard_management")
public class StandardManagement {
    @Id
    @Column(name = "id")
    private Long fileId;

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