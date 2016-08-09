
package com.developer.diegoalves.model;

import java.io.Serializable;

/**
 *
 * @author Diego Alves
 */
public class DeliveryAddress implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String publicPlace;
    private String number;
    private String complement;
    private String city;
    private String uf;
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
