/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Mensajes;
import utils.SocketHandler;
import utils.UsuarioActual;

/**
 *
 * @author Manuel
 */
public class DetallesPedido extends javax.swing.JPanel {

    private int idPedido;
    private Pedidos pedidos;

    /**
     * Creates new form DetallesPedido
     */
    public DetallesPedido(int idPedido, Pedidos pedidos) {
        this.pedidos = pedidos;
        this.idPedido = idPedido;
        initComponents();
        jTextAreaProductos.setEditable(false);
        rellenarPedido();
    }

    public void rellenarPedido() {
        try {
            SocketHandler.getOut().println(Mensajes.PETICION_MOSTRAR_DETALLESPEDIDO + "--" + idPedido);

            String received = SocketHandler.getIn().readLine();
            String[] args = received.split("--");
            jLabelDireccion.setText("Dirección: " + args[1]);
            jLabelFecha.setText("Fecha pedido: " + args[3]);
            jLabelNombre.setText("Nombre cliente: " + args[2]);
            jLabelPrecioTotal.setText("Precio total: " + args[4]+"€");
            
            int numPedidos = Integer.parseInt(args[8]);
            for (int i = 0; i < numPedidos; i++) {
                received = SocketHandler.getIn().readLine();
                args = received.split("--");
                jTextAreaProductos.setText(jTextAreaProductos.getText()+"Producto: " + args[1]+" - Precio: " + args[3]+"\n");
            }

        } catch (IOException ex) {
            Logger.getLogger(DetallesPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jLabelPrecioTotal = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaProductos = new javax.swing.JTextArea();
        jLabelProductos = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombre.setText("Nombre");

        jLabelPrecioTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPrecioTotal.setText("Precio total: ");

        jLabelFecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFecha.setText("Fecha");

        jTextAreaProductos.setBackground(new java.awt.Color(240, 240, 240));
        jTextAreaProductos.setColumns(20);
        jTextAreaProductos.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jTextAreaProductos.setRows(5);
        jScrollPane1.setViewportView(jTextAreaProductos);

        jLabelProductos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelProductos.setText("Productos");

        jLabelDireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDireccion.setText("Dirección");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabelProductos)))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabelProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecioTotal;
    private javax.swing.JLabel jLabelProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaProductos;
    // End of variables declaration//GEN-END:variables
}