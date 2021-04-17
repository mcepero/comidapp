/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Manuel
 */
public class Restaurante {
    private String nombre;
    private String usuario;
    private String contrasena;
    private String email;
    private String telefono;
    private String direccion;

    public Restaurante(String usuario, String nombre, String email, String direccion, String telefono) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public Restaurante() {
    }

    public Restaurante(String usuario) {
        this.usuario = usuario;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
