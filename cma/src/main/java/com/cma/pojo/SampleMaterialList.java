package com.cma.pojo;

import javax.persistence.*;

@Table(name = "sample_material_list")
public class SampleMaterialList {
    @Id
    @Column(name = "id")
    private Long materialId;

    @Column(name = "material_name")
    private String materialName;

    @Column(name = "material_note")
    private String materialNote;

    /**
     * @return id
     */
    public Long getMaterialId() {
        return materialId;
    }

    /**
     * @param materialId
     */
    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    /**
     * @return material_name
     */
    public String getMaterialName() {
        return materialName;
    }

    /**
     * @param materialName
     */
    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    /**
     * @return material_note
     */
    public String getMaterialNote() {
        return materialNote;
    }

    /**
     * @param materialNote
     */
    public void setMaterialNote(String materialNote) {
        this.materialNote = materialNote;
    }
}