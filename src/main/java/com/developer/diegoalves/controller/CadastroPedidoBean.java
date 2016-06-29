
package com.developer.diegoalves.controller;

import com.developer.diegoalves.pedidovenda.service.NegocioException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Diego Alves
 */

@Named
@RequestScoped
public class CadastroPedidoBean {
    
    private List<Integer> itens;
    
    public CadastroPedidoBean() {
        itens = new ArrayList<>();
        itens.add(1);
    }
    
    public void save() {
        throw new NegocioException("Pedido não pode ser salvo.");
    }

    public List<Integer> getItens() {
        return itens;
    }
}
