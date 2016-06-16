/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.diegoalves.controller;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;

/**
 *
 * @author Diego Alves
 */

@Named
public class CadastroPedidoBean {
    
    private List<Integer> itens;
    
    public CadastroPedidoBean() {
        itens = new ArrayList<>();
        itens.add(1);
    }

    public List<Integer> getItens() {
        return itens;
    }
}
