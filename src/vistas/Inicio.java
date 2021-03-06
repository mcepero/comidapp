/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import model.Restaurante;

/**
 *
 * @author Manuel
 */
public class Inicio extends javax.swing.JFrame {

    private Restaurante usuario;
    private VentanaPrincipal parent;

    /**
     * Creates new form Inicio
     */
    public Inicio(Restaurante usuario, VentanaPrincipal parent) {
        initComponents();
        setSize(1650,1080);
        this.usuario = usuario;
        this.parent = parent;
    }

    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonPerfil = new javax.swing.JButton();
        jButtonPedidos = new javax.swing.JButton();
        jButtonCarta = new javax.swing.JButton();
        jButtonRepartidores = new javax.swing.JButton();
        jButtonValoraciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 800));

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(144, 167, 213));

        jButtonPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        jButtonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilActionPerformed(evt);
            }
        });

        jButtonPedidos.setBackground(new java.awt.Color(144, 167, 213));
        jButtonPedidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jButtonPedidos.setText("Pedidos");
        jButtonPedidos.setToolTipText("");
        jButtonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidosActionPerformed(evt);
            }
        });

        jButtonCarta.setBackground(new java.awt.Color(144, 167, 213));
        jButtonCarta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jButtonCarta.setText("Carta");
        jButtonCarta.setToolTipText("");
        jButtonCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCartaActionPerformed(evt);
            }
        });

        jButtonRepartidores.setBackground(new java.awt.Color(144, 167, 213));
        jButtonRepartidores.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jButtonRepartidores.setText("Repartidores");
        jButtonRepartidores.setToolTipText("");
        jButtonRepartidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepartidoresActionPerformed(evt);
            }
        });

        jButtonValoraciones.setBackground(new java.awt.Color(144, 167, 213));
        jButtonValoraciones.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jButtonValoraciones.setText("Valoraciones");
        jButtonValoraciones.setToolTipText("");
        jButtonValoraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValoracionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRepartidores, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonValoraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(jButtonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButtonPedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonCarta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonValoraciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonRepartidores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilActionPerformed
        jPanelContenedor.removeAll();
        Perfil perfil = new Perfil(this); 
        jPanelContenedor.add(perfil);
        jPanelContenedor.validate();
        jPanelContenedor.setSize(1650,1080);
        perfil.setSize(1000,1080);

        perfil.setVisible(true);
        jPanelContenedor.repaint();
    }//GEN-LAST:event_jButtonPerfilActionPerformed

    private void jButtonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidosActionPerformed
        jPanelContenedor.removeAll();
        Pedidos p = new Pedidos(this);
        jPanelContenedor.add(p, BorderLayout.CENTER);
        jPanelContenedor.validate();
        p.setSize(1000,1800);
        jPanelContenedor.setSize(1000,1800);
        p.setVisible(true);
        jPanelContenedor.repaint();
        
    }//GEN-LAST:event_jButtonPedidosActionPerformed

    private void jButtonCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCartaActionPerformed
        jPanelContenedor.removeAll();
        Carta carta = new Carta(this);
        jPanelContenedor.add(carta);
        jPanelContenedor.validate();
        carta.setSize(1000,1800);
        jPanelContenedor.setSize(1000,1800);
        carta.setVisible(true);
        jPanelContenedor.repaint();
    }//GEN-LAST:event_jButtonCartaActionPerformed

    private void jButtonRepartidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRepartidoresActionPerformed
        jPanelContenedor.removeAll();
        Repartidores repartidores = new Repartidores(this);
        jPanelContenedor.add(repartidores);
        jPanelContenedor.validate();
        repartidores.setSize(1000,1800);
        jPanelContenedor.setSize(1000,1800);
        repartidores.setVisible(true);
        jPanelContenedor.repaint();
    }//GEN-LAST:event_jButtonRepartidoresActionPerformed

    private void jButtonValoracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValoracionesActionPerformed
        jPanelContenedor.removeAll();
        Valoraciones valoraciones = new Valoraciones(this);
        jPanelContenedor.add(valoraciones);
        jPanelContenedor.validate();
        valoraciones.setSize(1000,1800);
        jPanelContenedor.setSize(1000,1800);
        valoraciones.setVisible(true);
        jPanelContenedor.repaint();
    }//GEN-LAST:event_jButtonValoracionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    public Restaurante getUsuario() {
        return usuario;
    }

    public void setUsuario(Restaurante usuario) {
        this.usuario = usuario;
    }

    public JPanel getjPanelContenedor() {
        return jPanelContenedor;
    }
    
     


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCarta;
    private javax.swing.JButton jButtonPedidos;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonRepartidores;
    private javax.swing.JButton jButtonValoraciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelContenedor;
    // End of variables declaration//GEN-END:variables
}
