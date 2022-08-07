/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.models;

/**
 *
 * @author Usuario
 */
public class Cliente {
    
    private String id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }

    public void setApellido(String valor) {
        apellido = valor;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void setTEmail(String telefono) {
        this.email = telefono;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}
