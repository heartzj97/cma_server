package com.cma.pojo;

import javax.persistence.*;

@Table(name = "equipment_receive_attachment")
public class EquipmentReceiveAttachment {
    @Id
    @Column(name = "id")
    private Long attachmentId;

    private String name;

    @Column(name = "receive_id")
    private Long receiveId;

    /**
     * @return id
     */
    public Long getAttachmentId() {
        return attachmentId;
    }

    /**
     * @param attachmentId
     */
    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
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
     * @return receive_id
     */
    public Long getReceiveId() {
        return receiveId;
    }

    /**
     * @param receiveId
     */
    public void setReceiveId(Long receiveId) {
        this.receiveId = receiveId;
    }
}