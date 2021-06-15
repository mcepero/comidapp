/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import vistas.Pedidos;

/**
 *
 * @author Manuel
 */
public class RecargarPedidos extends Thread {

    private Pedidos pedidos;
    private boolean recargar;

    public RecargarPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
        this.recargar=true;
    }

    @Override
    public void run() {
        while (recargar) {
            try {
                synchronized (this) {
                    sleep(30000);
                    pedidos.leerCarta();
                }
            } catch (InterruptedException ex) {
               Thread.currentThread().interrupt();
            }
        }
    }

    public boolean isRecargar() {
        return recargar;
    }

    public void setRecargar(boolean recargar) {
        this.recargar = recargar;
    }
    
    

}
