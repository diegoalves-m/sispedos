
package com.developer.diegoalves.repository;

import com.developer.diegoalves.model.Product;
import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Diego Alves
 */
public class Products implements Serializable {
    
    @Inject
    private EntityManager entityManager;
    
    public Product add(Product product) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(product);
        transaction.commit();
        return product;
    }
    
}
