/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;
import utils.Mensajes;
import utils.SocketHandler;
import utils.UsuarioActual;

/**
 *
 * @author Manuel
 */
public class Carta extends javax.swing.JPanel {

    private Inicio inicio;
    int x = 0;
    int y = 0;

    /**
     * Creates new form Carta
     */
    public Carta(Inicio inicio) {
        this.inicio = inicio;
        initComponents();
        GridBagLayout gl = new java.awt.GridBagLayout();
        jPanelContenedor.setLayout(gl);
        setSize(1000, 1800);

        leerCarta();
    }

    public void leerCarta() {
        ArrayList<JPanelProducto> productos = new ArrayList<>();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.VERTICAL;

        jPanelContenedor.removeAll();
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        SocketHandler.getOut().println(Mensajes.PETICION_MOSTRAR_CARTA + "--" + UsuarioActual.getId());
        try {
            String received = SocketHandler.getIn().readLine();
            String[] args = received.split("--");
            int numProductos = Integer.parseInt(args[1]);

            try {
                for (int i = 0; i < numProductos; i++) {
                    constraints.gridx = x;
                    constraints.gridy = y;

                    constraints.gridwidth = 1;

                    constraints.insets = new Insets(5, 5, 5, 5);
                    received = SocketHandler.getIn().readLine();
                    args = received.split("--");
                    String flag = args[0];
                    JPanelProducto producto = new JPanelProducto(this);
                    producto.setId(Integer.parseInt(args[4]));
                    producto.getjLabelNombre().setText(args[1]);
                    producto.getjLabelNombre().setAlignmentX(CENTER_ALIGNMENT);
                    producto.getjLabelIngredientes().setText(args[2]);
                    producto.getjLabelPrecio().setText(args[3]);

                    /*leerImagen();
                    BufferedImage image = ImageIO.read(new File("E:\\manuel\\Documents\\DAM\\2 DAM 2020\\Proyecto\\Comidapp\\imagenesproductos\\imagenproducto.jpg"));
                    JLabel picLabel = new JLabel(new ImageIcon(image));
                    producto.getjPanelImagen().add(picLabel);
                    producto.getjPanelImagen().validate();
                    producto.getjPanelImagen().repaint();*/
                    jPanelContenedor.add(producto, constraints);
                    //jScrollPane1.add(producto, constraints);
                    jPanelContenedor.validate();
                    producto.setVisible(true);
                    producto.setSize(675, 100);
                    jPanelContenedor.repaint();
                    productos.add(producto);
                    //x++;
                    y++;
                }

                for (int i = 0; i < productos.size(); i++) {
                    SocketHandler.getOut().println(Mensajes.PETICION_FOTO_PRODUCTO + "--" + productos.get(i).getId());
                    leerImagen();
                    BufferedImage image = ImageIO.read(new File("E:\\manuel\\Documents\\DAM\\2 DAM 2020\\Proyecto\\Comidapp\\imagenesproductos\\imagenproducto.jpg"));
                    Image newImage = image.getScaledInstance(110, 110, Image.SCALE_DEFAULT);
                    JLabel picLabel = new JLabel(new ImageIcon(newImage));
                    picLabel.setBounds((int) productos.get(i).getjPanelImagen().getAlignmentX(), (int) productos.get(i).getjPanelImagen().getAlignmentY(), 100,100);
                    productos.get(i).getjPanelImagen().add(picLabel);
                    //productos.get(i).getjPanelImagen().validate();
                    //productos.get(i).getjPanelImagen().repaint();
                    productos.get(i).validate();
                    productos.get(i).repaint();

                }

            } catch (IOException ex) {
                Logger.getLogger(Carta.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(Carta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void leerImagen() {
        InputStream in = null;
        OutputStream out = null;
        ArrayList<Byte> bytesImagen = new ArrayList<>();
        File imagen = new File("E:\\manuel\\Documents\\DAM\\2 DAM 2020\\Proyecto\\Comidapp\\imagenesproductos\\imagenproducto.jpg");
        try {
            in = SocketHandler.getSocket().getInputStream();
            out = new FileOutputStream(imagen);
            byte[] bytes = new byte[8096];

            int count;

            do {
                count = in.read(bytes);
                out.write(bytes, 0, count);
            } while (count == 8096);

            out.close();
            /*in.close();*/
        } catch (IOException ex) {
            Logger.getLogger(Carta.class.getName()).log(Level.SEVERE, null, ex);
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

        jButtonAnadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelContenedor = new javax.swing.JPanel();

        jButtonAnadir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAnadir.setText("Añadir producto");
        jButtonAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirActionPerformed(evt);
            }
        });

        jPanelContenedor.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(jPanelContenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jButtonAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirActionPerformed
        AnadirProducto ap = new AnadirProducto(this);
        ap.setVisible(true);
    }//GEN-LAST:event_jButtonAnadirActionPerformed

    /* public JPanel getjPanelContenedor() {
        return jPanelContenedor;
    }

    public void setjPanelContenedor(JPanel jPanelContenedor) {
        this.jPanelContenedor = jPanelContenedor;
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnadir;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
