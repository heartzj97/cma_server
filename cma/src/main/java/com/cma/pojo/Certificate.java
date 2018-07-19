package com.cma.pojo;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Certificate {
    @Id
    @Column(name = "id")
    private Long fileId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_path")
    @JsonIgnore
    private String filePath;

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

    /**
     * @return file_path
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}