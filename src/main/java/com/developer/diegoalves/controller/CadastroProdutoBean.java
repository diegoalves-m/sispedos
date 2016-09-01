package com.developer.diegoalves.controller;

import com.developer.diegoalves.model.Category;
import com.developer.diegoalves.model.Product;
import com.developer.diegoalves.pedidovenda.service.ProductService;
import com.developer.diegoalves.repository.Categories;
import com.developer.diegoalves.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Diego Alves
 */
@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {
    
    private Categories categories;
    private Product product;
    private Category categoryF;
    
    @EJB
    private ProductService productService;
    
    private List<Category> mainCategories;

    public CadastroProdutoBean() {
        cleanFields();
    }
    
    public void init() {
        mainCategories = categories.roots();
    }
    
    public void save() {
        productService.save(product);
        cleanFields();
        FacesUtil.addInfoMessage("Produto salvo com sucesso!");
    }
    
    private void cleanFields() {
        product = new Product();
        categoryF = null;
        mainCategories = new ArrayList<>();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Category> getMainCategories() {
        return mainCategories;
    }

    //@NotNull
    public Category getCategoryF() {
        return categoryF;
    }

    public void setCategoryF(Category categoryF) {
        this.categoryF = categoryF;
    }
    
}
