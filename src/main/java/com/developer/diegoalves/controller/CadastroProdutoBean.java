
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
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void save() {
        throw new RuntimeException("Test exception");
    }
    
    
}
