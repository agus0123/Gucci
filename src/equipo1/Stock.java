/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo1;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Stock {
    ArrayList<ItemStock>items;

    public ArrayList<ItemStock> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemStock> items) {
        this.items = items;
    }
    
    ArrayList<ItemStock>consultarItemFaltante(int cantidadMax){
        ArrayList<ItemStock> aux= new ArrayList<>();
        for(int i=0;i<items.size();i++){
            if(items.get(i).getCantidad()<cantidadMax){
                
            aux.add(items.get(i));
            }
        }
        return aux;
    }
}
