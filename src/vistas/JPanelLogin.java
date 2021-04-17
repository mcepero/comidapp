/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.io.IOException;
import model.Restaurante;
import utils.Mensajes;
import utils.SocketHandler;
import utils.UsuarioActual;

/**
 *
 * @author Manuel
 */
public class JPanelLogin extends javax.swing.JPanel {
    VentanaPrincipal parent;
    /**
     * Creates new form JPanelLogin
     */
    public JPanelLogin() {
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

        jLabelMensaje = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldContrasena = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(201, 214, 241));

        jTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldUsuario.setToolTipText("");
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUsuario.setText("Usuario:");

        jLabelContrasena.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelContrasena.setText("Contraseña:");

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Iniciar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldContrasena.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabelTitulo)
                            .addGap(132, 132, 132))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldUsuario)
                                .addComponent(jTextFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabelTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabelUsuario))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelContrasena)
                    .addComponent(jTextFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SocketHandler.getOut().println(Mensajes.PETICION_LOGIN_RESTAURANTE+"--"+jTextFieldUsuario.getText()+"--"+jTextFieldContrasena.getText());
        String received;
        String flag = "";
        String[] args;

        try {
            received = SocketHandler.getIn().readLine();
            args=received.split("--");
            flag = args[0];

            if (flag.equals(Mensajes.PETICION_LOGIN_RESTAURANTE_CORRECTO) && jTextFieldUsuario.getText().equals("admin")){
                Restaurante r = new Restaurante(args[1], args[2], args[3], args[4], args[5]);
                UsuarioActual.setUsuario(args[1]);
                UsuarioActual.setNombre(args[2]);
                UsuarioActual.setEmail(args[3]);
                UsuarioActual.setDireccion(args[4]);
                UsuarioActual.setTelefono(args[5]);
                UsuarioActual.setId(Integer.parseInt(args[6]));
                Administrador admin = new Administrador(r, parent);
                admin.setVisible(true);
                parent.setVisible(false);

            }else if (flag.equals(Mensajes.PETICION_LOGIN_RESTAURANTE_CORRECTO)){
                jLabelMensaje.setForeground(Color.GREEN);
                jLabelMensaje.setText("Login correcto");
                Restaurante r = new Restaurante(args[1], args[2], args[3], args[4], args[5]);
                UsuarioActual.setUsuario(args[1]);
                UsuarioActual.setNombre(args[2]);
                UsuarioActual.setEmail(args[3]);
                UsuarioActual.setDireccion(args[4]);
                UsuarioActual.setTelefono(args[5]);
                UsuarioActual.setId(Integer.parseInt(args[6]));
                Inicio i = new Inicio(r, parent);
                i.setVisible(true);
                parent.setVisible(false);

            }else if(flag.equals(Mensajes.PETICION_LOGIN_RESTAURANTE_ERROR)){
                jLabelMensaje.setForeground(Color.RED);
                jLabelMensaje.setText("Login incorrecto");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void setParent(VentanaPrincipal parent) {
        this.parent = parent;
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jTextFieldContrasena;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
