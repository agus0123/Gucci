/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo1;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class ItemStock {
    computadora computadora;
    int cantidad;
    Date ultimafechademodificacion;

    public ItemStock(computadora computadora, int cantidad, Date ultimafechademodificacion) {
        this.computadora = computadora;
        this.cantidad = cantidad;
        this.ultimafechademodificacion = ultimafechademodificacion;
    }

    public computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(computadora computadora) {
        this.computadora = computadora;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getUltimafechademodificacion() {
        return ultimafechademodificacion;
    }

    public void setUltimafechademodificacion(Date ultimafechademodificacion) {
        this.ultimafechademodificacion = ultimafechademodificacion;
    }
    
    
}
