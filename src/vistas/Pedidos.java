/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;
import javax.swing.SwingConstants;
import model.Producto;
import utils.Mensajes;
import utils.RecargarPedidos;
import utils.SocketHandler;
import utils.UsuarioActual;

/**
 *
 * @author Manuel
 */
public class Pedidos extends javax.swing.JPanel {

    private Inicio inicio;
    RecargarPedidos recargarPedidos;
    int x = 0;
    int y = 0;

    /**
     * Creates new form Carta
     */
    public Pedidos(Inicio inicio) {
        this.inicio = inicio;
        initComponents();
        GridBagLayout gl = new java.awt.GridBagLayout();
        jPanelContenedor.setLayout(gl);
        setSize(1000, 1800);

        leerCarta();
        recargarPedidos = new RecargarPedidos(this);
        recargarPedidos.start();
    }

    public void leerCarta() {
        //ObjectInputStream objectOutputStream = null;
        try {
//            objectOutputStream = new ObjectInputStream(SocketHandler.getSocket().getInputStream());
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.fill = GridBagConstraints.VERTICAL;
            jPanelContenedor.removeAll();
            jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            SocketHandler.getOut().println(Mensajes.PETICION_MOSTRAR_PEDIDOS + "--" + UsuarioActual.getId());
            try {
                String received = SocketHandler.getIn().readLine();
                String[] args = received.split("--");
                int numPedidos = Integer.parseInt(args[1]);

                try {
                    for (int i = 0; i < numPedidos; i++) {
                        constraints.gridx = x;
                        constraints.gridy = y;

                        constraints.gridwidth = 1;

                        constraints.insets = new Insets(5, 5, 5, 5);
                        received = SocketHandler.getIn().readLine();
//                        ArrayList<Producto> productos = (ArrayList<Producto>) objectOutputStream.readObject();

                        args = received.split("--");
                        String flag = args[0];
                        JPanelPedido pedido = new JPanelPedido(this);
                        pedido.setId(Integer.parseInt(args[1]));
                        pedido.getjLabelFecha().setAlignmentX(CENTER_ALIGNMENT);
                        pedido.getjLabelFecha().setText("Fecha: " + args[2]);
                        pedido.getjLabelPrecio().setText("Total: " + args[3] + "???");
                        pedido.getjLabelDireccion().setText("Direcci??n: " + args[4]);
                        jPanelContenedor.add(pedido, constraints);
                        //jScrollPane1.add(producto, constraints);
                        jPanelContenedor.validate();
                        pedido.setVisible(true);
                        pedido.setSize(675, 100);
                        jPanelContenedor.repaint();
                        //x++;
                        y++;
                    }

                } catch (IOException ex) {
                    Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
                }
                /*catch (ClassNotFoundException ex) {
                    Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
                }*/

            } catch (IOException ex) {
                System.out.println("Se ha perdido la conexi??n con el servidor.");
                if (recargarPedidos!=null) {
                    recargarPedidos.interrupt();
                }
                JFrame newFrame = new JFrame();
                newFrame.setSize(350, 150);
                newFrame.setLocationRelativeTo(null);
                JLabel label = new JLabel("Se ha perdido la conexi??n con el servidor.", SwingConstants.CENTER);
                label.setFont(new Font("Tahoma", Font.PLAIN, 18));
                newFrame.add(label);
                newFrame.setAlwaysOnTop(true);
                newFrame.setVisible(true);
            }

            /*   } catch (IOException ex) {
            Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
             */
        } finally {

        }

    }

    public JPanel getjPanelContenedor() {
        return jPanelContenedor;
    }

    public void setjPanelContenedor(JPanel jPanelContenedor) {
        this.jPanelContenedor = jPanelContenedor;
    }

    public RecargarPedidos getRecargarPedidos() {
        return recargarPedidos;
    }

    public void setRecargarPedidos(RecargarPedidos recargarPedidos) {
        this.recargarPedidos = recargarPedidos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelContenedor = new javax.swing.JPanel();

        jPanelContenedor.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(jPanelContenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /* public JPanel getjPanelContenedor() {
        return jPanelContenedor;
    }

    public void setjPanelContenedor(JPanel jPanelContenedor) {
        this.jPanelContenedor = jPanelContenedor;
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
