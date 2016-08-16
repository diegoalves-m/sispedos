package com.developer.diegoalves.controller;

import com.developer.diegoalves.model.Product;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Diego Alves
 */
@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {
    
    private Product product;

    public CadastroProdutoBean() {
        this.product = new Product();
    }
    
    

    public void save() {
        
    }

    public Product getProduct() {
        return product;
    }

}
