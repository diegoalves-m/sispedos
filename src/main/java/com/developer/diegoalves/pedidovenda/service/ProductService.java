
package com.developer.diegoalves.pedidovenda.service;

import com.developer.diegoalves.model.Product;
import com.developer.diegoalves.repository.ProductImpl;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego Alves
 */

@Named
@RequestScoped
public class ProductService implements ProductImpl {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void save(Product product) {
        entityManager.persist(product);
    }
    
}
