/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Manuel
 */
public class UsuarioActual {
    private static int id;
    private static String nombre;
    private static String usuario;
    private static String email;
    private static String telefono;
    private static String direccion;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        UsuarioActual.id = id;
    }
    
    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        UsuarioActual.nombre = nombre;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        UsuarioActual.usuario = usuario;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        UsuarioActual.email = email;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        UsuarioActual.telefono = telefono;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {
        UsuarioActual.direccion = direccion;
    }
    
}
