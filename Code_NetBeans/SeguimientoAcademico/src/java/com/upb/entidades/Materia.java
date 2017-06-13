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
    private String horario;
    private String aula;
    private String creditos;
    
    public Materia(String codigo, String nombre, String horario, String aula, String creditos){
        this.id = codigo;
        this.nombre = nombre;
        this.horario = horario;
        this.aula = aula;
        this.creditos = creditos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }
    
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
