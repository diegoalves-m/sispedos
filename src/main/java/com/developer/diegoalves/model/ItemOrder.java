
package com.developer.diegoalves.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Diego Alves
 */
@Entity
public class ItemOrder implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, length = 3)
    private Integer amount;
    @Column(name = "unitary_value", nullable = false, precision = 10, scale = 2)
    private BigDecimal unitaryValue;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Orderp orderp;

    public ItemOrder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getUnitaryValue() {
        return unitaryValue;
    }

    public void setUnitaryValue(BigDecimal unitaryValue) {
        this.unitaryValue = unitaryValue;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Orderp getOrder() {
        return orderp;
    }

    public void setOrder(Orderp order) {
        this.orderp = order;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemOrder other = (ItemOrder) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
