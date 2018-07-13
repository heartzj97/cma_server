package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "operating_instruction")
public class OperatingInstruction {
    @Id
    private Long id;

    private String file;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_id")
    private String fileId;

    private Byte state;

    private Byte current;

    @Column(name = "modify_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date modifyTime;

    private String modifier;

    @Column(name = "modify_content")
    private String modifyContent;

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
     * @return file_id
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * @param fileId
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * @return state
     */
    public Byte getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * @return current
     */
    public Byte getCurrent() {
        return current;
    }

    /**
     * @param current
     */
    public void setCurrent(Byte current) {
        this.current = current;
    }

    /**
     * @return modify_date
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * @param modifier
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * @return modify_content
     */
    public String getModifyContent() {
        return modifyContent;
    }

    /**
     * @param modifyContent
     */
    public void setModifyContent(String modifyContent) {
        this.modifyContent = modifyContent;
    }
}