
package com.developer.diegoalves.controller;

import com.developer.diegoalves.model.DeliveryAddress;
import com.developer.diegoalves.model.Orderp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Diego Alves
 */

@Named
@ViewScoped
public class CadastroPedidoBean implements Serializable {
    
    private Orderp orderp;
    private List<Integer> itens;
    
    public CadastroPedidoBean() {
        orderp = new Orderp();
        orderp.setDeliveryAddress(new DeliveryAddress());
        itens = new ArrayList<>();
        itens.add(1);
    }
    
    public void save() {
        
    }

    public Orderp getOrderp() {
        return orderp;
    }

    public List<Integer> getItens() {
        return itens;
    }
}
