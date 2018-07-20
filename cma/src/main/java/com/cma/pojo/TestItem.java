package com.cma.pojo;

import javax.persistence.*;

@Table(name = "test_item")
public class TestItem {
    @Id
    private Long id;

    @Column(name = "production_name")
    private String productionName;

    private String ability;

    private String referrence;

    private Long year;

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
     * @return production_name
     */
    public String getProductionName() {
        return productionName;
    }

    /**
     * @param productionName
     */
    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    /**
     * @return ability
     */
    public String getAbility() {
        return ability;
    }

    /**
     * @param ability
     */
    public void setAbility(String ability) {
        this.ability = ability;
    }

    /**
     * @return referrence
     */
    public String getReferrence() {
        return referrence;
    }

    /**
     * @param referrence
     */
    public void setReferrence(String referrence) {
        this.referrence = referrence;
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
}