/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import utils.Mensajes;
import utils.SocketHandler;

/**
 *
 * @author Manuel
 */
public class Registro extends javax.swing.JPanel {

    /**
     * Creates new form Registro
     */
    ArrayList<String> categorias;

    public Registro() {
        initComponents();
        categorias = new ArrayList<>();
        try {
            SocketHandler.getOut().println(Mensajes.PETICION_OBTENER_CATEGORIAS);

            String received = SocketHandler.getIn().readLine();
            String[] args = received.split("--");
            String flag = args[0];
            if (flag.equals(Mensajes.PETICION_OBTENER_CATEGORIAS_CORRECTO)) {
                int numCategorias = Integer.parseInt(args[1]);
                for (int i = 0; i < numCategorias; i++) {
                    received = SocketHandler.getIn().readLine();
                    args = received.split("--");
                    categorias.add(args[1]);
                }
            }
            jComboBoxCategoria.setModel(new DefaultComboBoxModel(categorias.toArray()));

        } catch (IOException ex) {
            System.out.println("Se ha perdido la conexión con el servidor.");
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

        jLabelMensaje = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jTextFieldCiudad = new javax.swing.JTextField();
        jTextFieldContrasena = new javax.swing.JPasswordField();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabelCiudad1 = new javax.swing.JLabel();

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
        jLabelTitulo.setText("ComidApp");

        jButtonRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRegistrar.setText("Registrar restaurante");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEmail.setText("Email:");

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldNombre.setToolTipText("");
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelDireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDireccion.setText("Dirección");

        jTextFieldTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldTelefono.setToolTipText("");
        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });

        jTextFieldDireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionActionPerformed(evt);
            }
        });

        jLabelTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTelefono.setText("Teléfono:");

        jLabelCiudad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCiudad.setText("Ciudad");

        jTextFieldCiudad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCiudadActionPerformed(evt);
            }
        });

        jTextFieldContrasena.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabelCiudad1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCiudad1.setText("Categoría");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(jTextFieldContrasena)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCiudad1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                        .addGap(166, 166, 166))))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelTitulo)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelContrasena))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCiudad1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(jTextFieldEmail.getText());

        if (mather.find() == true) {
            boolean isNumeric = true;
            for (int i = 0; i < jTextFieldTelefono.getText().length(); i++) {
                if (!Character.isDigit(jTextFieldTelefono.getText().charAt(i))) {
                    isNumeric = false;
                }
            }
            if (jTextFieldTelefono.getText().length() == 9 && isNumeric) {

                int numCategoria = jComboBoxCategoria.getSelectedIndex() + 1;
                SocketHandler.getOut().println(Mensajes.PETICION_REGISTRO_RESTAURANTE + "--" + jTextFieldUsuario.getText() + "--" + jTextFieldEmail.getText() + "--" + jTextFieldContrasena.getText() + "--" + jTextFieldNombre.getText() + "--" + jTextFieldDireccion.getText() + "--" + jTextFieldTelefono.getText() + "--" + jTextFieldCiudad.getText() + "--" + numCategoria);
                String received;
                String flag = "";
                String[] args;

                try {
                    received = SocketHandler.getIn().readLine();
                    args = received.split("--");
                    flag = args[0];

                    if (flag.equals(Mensajes.PETICION_REGISTRO_RESTAURANTE_CORRECTO)) {
                        jLabelMensaje.setForeground(Color.GREEN);
                        jLabelMensaje.setText("Registro correcto");

                    } else if (flag.equals(Mensajes.PETICION_REGISTRO_RESTAURANTE_ERROR)) {
                        jLabelMensaje.setForeground(Color.RED);
                        jLabelMensaje.setText("Usuario o email repetidos");
                    }
                } catch (IOException e) {
                    System.out.println("Se ha perdido la conexión con el servidor.");
                }
            }else{
                jLabelMensaje.setForeground(Color.RED);
                jLabelMensaje.setText("Teléfono inválido.");
            }
        } else {
            jLabelMensaje.setForeground(Color.RED);
            jLabelMensaje.setText("Email inválido.");
        }

    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jTextFieldCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCiudadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelCiudad1;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JPasswordField jTextFieldContrasena;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
