package com.cma.pojo;

import javax.persistence.*;

@Table(name = "self_inspection_file")
public class SelfInspectionFile {
    @Id
    private Long id;

    @Column(name = "self_inspection_id")
    private Long selfInspectionId;

    @Column(name = "file_name")
    private String fileName;

    private String file;

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
     * @return self_inspection_id
     */
    public Long getSelfInspectionId() {
        return selfInspectionId;
    }

    /**
     * @param selfInspectionId
     */
    public void setSelfInspectionId(Long selfInspectionId) {
        this.selfInspectionId = selfInspectionId;
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