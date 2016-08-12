package com.developer.diegoalves.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Diego Alves
 */
@Entity
public class Orderp implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "creation_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Column(columnDefinition = "text")
    private String observation;
    @Column(name = "delivery_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date deliveryDate;
    @Column(name = "freight_value", nullable = false, precision = 10, scale = 2)
    private BigDecimal freightValue;
    @Column(name = "discount_value", nullable = false, precision = 10, scale = 2)
    private BigDecimal discountValue;
    @Column(name = "total_value", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalValue;
    @Enumerated(EnumType.STRING)
    @Column(name = "status_order", nullable = false, length = 20)
    private StatusOrder statusOrder;
    @Enumerated(EnumType.STRING)
    @Column(name = "form_payment", nullable = false, length = 20)
    private FormPayment formPayment;
    @ManyToOne
    @JoinColumn(name = "salesman_id", nullable = false)
    private Userc salesman;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    @Embedded
    private DeliveryAddress deliveryAddress;
    @OneToMany(mappedBy = "orderp", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemOrder> itens;

    public Orderp() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public BigDecimal getFreightValue() {
        return freightValue;
    }

    public void setFreightValue(BigDecimal freightValue) {
        this.freightValue = freightValue;
    }

    public BigDecimal getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(BigDecimal discountValue) {
        this.discountValue = discountValue;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
    }

    public FormPayment getFormPayment() {
        return formPayment;
    }

    public void setFormPayment(FormPayment formPayment) {
        this.formPayment = formPayment;
    }

    public Userc getSalesman() {
        return salesman;
    }

    public void setSalesman(Userc salesman) {
        this.salesman = salesman;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<ItemOrder> getItens() {
        return itens;
    }

    public void setItens(List<ItemOrder> itens) {
        this.itens = itens;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Orderp other = (Orderp) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
