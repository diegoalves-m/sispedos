
package com.developer.diegoalves.jpa;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Diego Alves
 */

@ApplicationScoped
public class EntityManagerProducer {
    
    private EntityManagerFactory factory;

    public EntityManagerProducer() {
        factory = Persistence.createEntityManagerFactory("pedidos_pu");
    }
    
    @Produces @RequestScoped
    public EntityManager createEntityManager() {
        return factory.createEntityManager();
    }
    
    public void close(@Disposes EntityManager manager) {
        manager.close();
    }
    
}
