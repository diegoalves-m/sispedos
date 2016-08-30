
package com.developer.diegoalves.repository;

import com.developer.diegoalves.model.Category;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Diego Alves
 */
public class Categories implements Serializable {
    
    @Inject
    private EntityManager manager;
    
    public Category byId(Long id) {
        return manager.find(Category.class, id);
    }
    
    public List<Category> roots() {
        return manager.createQuery("from Category", Category.class).getResultList();
    }
    
}
