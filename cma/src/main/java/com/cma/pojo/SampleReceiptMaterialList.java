package com.cma.pojo;

import javax.persistence.*;

@Table(name = "sample_receipt_material_list")
public class SampleReceiptMaterialList {
    @Column(name = "receipt_id")
    private Long receiptId;

    @Column(name = "material_id")
    private Long materialId;

    @Column(name = "material_type")
    private Byte materialType;

    /**
     * @return receipt_id
     */
    public Long getReceiptId() {
        return receiptId;
    }

    /**
     * @param receiptId
     */
    public void setReceiptId(Long receiptId) {
        this.receiptId = receiptId;
    }

    /**
     * @return material_id
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
     * @return material_type
     */
    public Byte getMaterialType() {
        return materialType;
    }

    /**
     * @param materialType
     */
    public void setMaterialType(Byte materialType) {
        this.materialType = materialType;
    }
}