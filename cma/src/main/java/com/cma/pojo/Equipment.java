package com.cma.pojo;

import javax.persistence.*;

public class Equipment {
    @Id
    private Long id;

    private String name;

    private String model;

    private String cpu;

    private String memory;

    @Column(name = "hard_disk")
    private String hardDisk;

    private String application;

    private Byte state;

    @Column(name = "equipment_number")
    private String equipmentNumber;

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
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * @param cpu
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    /**
     * @param memory
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * @return hard_disk
     */
    public String getHardDisk() {
        return hardDisk;
    }

    /**
     * @param hardDisk
     */
    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    /**
     * @return application
     */
    public String getApplication() {
        return application;
    }

    /**
     * @param application
     */
    public void setApplication(String application) {
        this.application = application;
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
     * @return equipment_number
     */
    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    /**
     * @param equipmentNumber
     */
    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }
}