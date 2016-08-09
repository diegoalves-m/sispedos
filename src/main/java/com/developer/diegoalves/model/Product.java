
package com.developer.diegoalves.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Diego Alves
 */
public class Product implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
    private String name;
    private String sku;
    private BigDecimal unitValue;
    private Integer amountStock;
    private Category category;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(BigDecimal unitValue) {
        this.unitValue = unitValue;
    }

    public Integer getAmountStock() {
        return amountStock;
    }

    public void setAmountStock(Integer amountStock) {
        this.amountStock = amountStock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    
    
    
}
