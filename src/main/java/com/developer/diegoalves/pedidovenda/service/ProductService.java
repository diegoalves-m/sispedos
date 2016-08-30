
package com.developer.diegoalves.pedidovenda.service;

import com.developer.diegoalves.model.Product;
import com.developer.diegoalves.repository.Products;
import java.io.Serializable;
import javax.ejb.Stateless;

/**
 *
 * @author Diego Alves
 */
@Stateless
public class ProductService implements Serializable {
    
    private Products products;
    
    public Product save(Product product) {
        products.add(product);
        return product;
    }
    
}
