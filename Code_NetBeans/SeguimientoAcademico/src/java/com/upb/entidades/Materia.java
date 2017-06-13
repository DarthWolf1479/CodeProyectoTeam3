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
public class Materia {
    private String id;
    private String nombre;
    private String aula;
    
    public Materia(){
        
    } 

    public String getId() {
        return id;
    }

    public void setCode(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
}
