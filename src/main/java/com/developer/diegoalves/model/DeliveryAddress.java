package com.developer.diegoalves.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Diego Alves
 */

@Embeddable
public class DeliveryAddress implements Serializable {

    @Column(name = "public_place", nullable = false, length = 150)
    private String publicPlace;
    @Column(nullable = false, length = 20)
    private String number;
    @Column(length = 50)
    private String complement;
    @Column(nullable = false, length = 60)
    private String city;
    @Column(nullable = false, length = 60)
    private String uf;
    @Column(nullable = false, length = 9)
    private String cep;

    public DeliveryAddress() {
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
