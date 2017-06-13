/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.entidades;

/**
 *
 * @author Kevin Viscafe
 */
public class Alumno {
    
    private String pass;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String fecha_nac;
    
    public Alumno(String codigo, String nombre, String apellido, String correo, String telefono){
        this.pass=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=correo;
        this.telefono=telefono;
        
    }


    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    
}
