/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.BorderLayout;
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
public class Valoraciones extends javax.swing.JPanel {

    private Inicio inicio;
    int x = 0;
    int y = 0;

    /**
     * Creates new form Carta
     */
    public Valoraciones(Inicio inicio) {
        this.inicio = inicio;
        initComponents();
        GridBagLayout gl = new java.awt.GridBagLayout();
        jPanelContenedor.setLayout(gl);
        setSize(1000, 1800);

        obtenerValoraciones();
    }

    public void obtenerValoraciones() {

        try {

            GridBagConstraints constraints = new GridBagConstraints();
            constraints.fill = GridBagConstraints.VERTICAL;
            jPanelContenedor.removeAll();
            jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            SocketHandler.getOut().println(Mensajes.PETICION_MOSTRAR_VALORACIONES + "--" + UsuarioActual.getId());
            String received = SocketHandler.getIn().readLine();
            String[] args = received.split("--");
            int numValoraciones = Integer.parseInt(args[1]);

            for (int i = 0; i < numValoraciones; i++) {
                constraints.gridx = x;
                constraints.gridy = y;

                constraints.gridwidth = 1;

                constraints.insets = new Insets(5, 5, 5, 5);
                received = SocketHandler.getIn().readLine();

                args = received.split("--");
                String flag = args[0];
                JPanelValoracion valoracion = new JPanelValoracion(this);
                valoracion.setIdValoracion(Integer.parseInt(args[1]));
                valoracion.getjTextAreaComentario().setText(args[2]);
                valoracion.getjLabelPuntuacion().setText("Puntuación: " + args[3] + "/10");
                jPanelContenedor.add(valoracion, constraints);

                jPanelContenedor.validate();
                valoracion.setVisible(true);
                valoracion.setSize(675, 100);
                jPanelContenedor.repaint();

                y++;
            }

        } catch (IOException ex) {
            System.out.println("Se ha perdido la conexión con el servidor.");
            JFrame newFrame = new JFrame();
            newFrame.setSize(350, 150);
            newFrame.setLocationRelativeTo(null);
            JLabel label = new JLabel("Se ha perdido la conexión con el servidor.", SwingConstants.CENTER);
            label.setFont(new Font("Tahoma", Font.PLAIN, 18));
            newFrame.add(label);
            newFrame.setAlwaysOnTop(true);
            newFrame.setVisible(true);
        }

    }

    public JPanel getjPanelContenedor() {
        return jPanelContenedor;
    }

    public void setjPanelContenedor(JPanel jPanelContenedor) {
        this.jPanelContenedor = jPanelContenedor;
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
