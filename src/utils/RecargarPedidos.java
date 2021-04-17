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

    public RecargarPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (this) {
                    pedidos.leerCarta();
                    sleep(30000);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(RecargarPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
