
package com.developer.diegoalves.pedidovenda.service;

import com.developer.diegoalves.model.Product;
import com.developer.diegoalves.repository.ProductImpl;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego Alves
 */
@Stateless
@Local(ProductImpl.class)
public class ProductService implements ProductImpl {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void save(Product product) {
        entityManager.persist(product);
    }
    
}
