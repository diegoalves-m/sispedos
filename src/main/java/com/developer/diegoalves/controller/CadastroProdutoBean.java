
package com.developer.diegoalves.controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Diego Alves
 */
@Named
@SessionScoped
public class CadastroProdutoBean implements Serializable {
    
    public void save() {
        throw new RuntimeException("Test exception");
    }
    
    
}
