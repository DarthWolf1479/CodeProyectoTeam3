/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.basededatos;

import com.upb.entidades.Alumno;
import com.upb.entidades.Materia;
import com.upb.entidades.Profesor;
import com.upb.entidades.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucho
 */
public class Consultas extends Conexion {
    
    
    public static boolean autenticacion(String nombre, String contrasena){
        boolean verificado = false;
        try {
            String consulta = "select nombre, pass from usuarios"
                    +" where nombre = '"+nombre+"' and pass = '"+contrasena+"';";
            ResultSet rs = Conexion.getConexion().getConsulta(consulta);
            verificado = rs.next();
            
        } catch ( 
            SQLException ex) { Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return verificado;
    }

    public static void setDatos(Usuario user) {
        String sql = "select Apellido, Correo from usuarios where nombre = '"+user.getNombre()+"';";
        ResultSet st = Conexion.getConexion().getConsulta(sql);
        try {
            while(st.next()){
            user.setApellido(st.getString("Apellido"));
            user.setEmail(st.getString("Correo"));
                    }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<Alumno> listaAlumnos() {
        String sql = "select codigo, nombre, apellido, email, telefono from Alumnos";
        ResultSet rs = Conexion.getConexion().getConsulta(sql);
        List<Alumno> list = new ArrayList<Alumno>();
        Alumno alumno = null;
        try {
            while(rs.next()){
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                
                alumno = new Alumno(codigo,nombre,apellido,email,telefono);
                list.add(alumno);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static Alumno encontrarAlumno(String codigo) {
        Alumno alumno = null;
        String sql = "select * from alumnos where codigo = '"+codigo+"';"; 
        ResultSet st = Conexion.getConexion().getConsulta(sql);
        try {
            if (st.next()){
                String code = st.getString("codigo");
                String nombre = st.getString("nombre");
                String apellido = st.getString("apellido");
                String email = st.getString("email");
                String telefono = st.getString("telefono");
                alumno = new Alumno(code, nombre, apellido, email, telefono);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return alumno;
    }
    
   public static void registrarAlumno(Alumno a) {
       
       String consulta = "insert into alumnos values('"+a.getPass()+"','"+a.getNombre()+
               "','"+a.getApellido()+"','"+a.getEmail()+"','"+a.getTelefono()+"');";
       
       Conexion.getConexion().setUpdate(consulta);
     
   }
    public static void eliminarAlumno(String codigo) {
       
       String consulta ="delete from alumnos where codigo = '"+codigo+"';";
       Conexion.getConexion().setUpdate(consulta);
   }
    
    public static void actualizarAlumno(String codigo, String nombre, String apellido, String correo, String telefono) {
       
       String consulta = "update alumnos set nombre='"+nombre+"', apellido ='"+apellido+"',"
                +"email = '"+correo+"',telefono= '"+telefono+"' where codigo='"+codigo+"';";
        Conexion.getConexion().setUpdate(consulta);
   }       
    
    
    public static List<Profesor> listaProfesor() {
        String consulta = "select codigo, nombre, apellido, email, telefono, fecha_nac from Profesores;";
        ResultSet rs = Conexion.getConexion().getConsulta(consulta);
        List<Profesor> list = new ArrayList<Profesor>();
        Profesor profesor = null;
        try {
            while(rs.next()){
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                String fecha = rs.getString("fecha_nac");
                
                profesor = new Profesor(codigo,nombre,apellido,email,telefono,fecha);
                list.add(profesor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static Profesor encontrarProfesor(String codigo) {
        Profesor profesor = null;
        String sql = "select * from profesores where codigo = '"+codigo+"';"; 
        ResultSet st = Conexion.getConexion().getConsulta(sql);
        try {
            if (st.next()){
                String code = st.getString("codigo");
                String nombre = st.getString("nombre");
                String apellido = st.getString("apellido");
                String email = st.getString("email");
                String telefono = st.getString("telefono");
                String fecha = st.getString("fecha_nac");
                
                profesor = new Profesor(code, nombre, apellido, email, telefono, fecha);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return profesor;
    }
    
   public static void registrarProfesor(Profesor p) {
       
       String consulta = "insert into profesores values('"+p.getId()+"','"+p.getNombre()+
               "','"+p.getApellido()+"','"+p.getEmail()+"','"+p.getTelefono()+"','"+p.getFecha_nac()+"');";
       
       Conexion.getConexion().setUpdate(consulta);
     
   }
    public static void eliminarProfesor(String codigo) {
       
       String consulta ="delete from profesores where codigo = '"+codigo+"';";
       Conexion.getConexion().setUpdate(consulta);
   }
    
    public static void actualizarProfesor(String codigo, String nombre, String apellido, String correo, String telefono, String fecha) {
       
       String consulta = "update profesores set nombre='"+nombre+"', apellido ='"+apellido+"',"
                +"email = '"+correo+"',telefono= '"+telefono+"', fecha_nac ='"+fecha+"' where codigo='"+codigo+"';";
        Conexion.getConexion().setUpdate(consulta);
   }    
    
       public static List<Materia> listaMateria() {
        String consulta = "select codigo, nombre, horario, aula, creditos from materias;";
        ResultSet rs = Conexion.getConexion().getConsulta(consulta);
        List<Materia> list = new ArrayList<Materia>();
        Materia materia = null;
        try {
            while(rs.next()){
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                String horario = rs.getString("horario");
                String aula = rs.getString("aula");
                String creditos = rs.getString("creditos");
                
                materia = new Materia(codigo,nombre,horario,aula,creditos);
                list.add(materia);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static Materia encontrarMateria(String codigo) {
        Materia materia = null;
        String sql = "select * from materias where codigo = '"+codigo+"';"; 
        ResultSet st = Conexion.getConexion().getConsulta(sql);
        try {
            if (st.next()){
                String code = st.getString("codigo");
                String nombre = st.getString("nombre");
                String aula = st.getString("aula");
                String horario = st.getString("horario");
                String creditos = st.getString("creditos");
                
                materia = new Materia(code, nombre, horario, aula, creditos);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return materia;
    }
    
   public static void registrarMateria(Materia p) {
       
       String consulta = "insert into materias values('"+p.getId()+"','"+p.getNombre()+
               "','"+p.getHorario()+"','"+p.getAula()+"','"+p.getCreditos()+"');";
       
       Conexion.getConexion().setUpdate(consulta);
     
   }
    public static void eliminarMateria(String codigo) {
       
       String consulta ="delete from materias where codigo = '"+codigo+"';";
       Conexion.getConexion().setUpdate(consulta);
   }
    
    public static void actualizarMateria(String codigo, String nombre, String horario, String aula, String creditos) {
       
       String consulta = "update materias set nombre='"+nombre+"', horario ='"+horario+"',"
                +"aula = '"+aula+"',creditos= '"+creditos+"' where codigo='"+codigo+"';";
        Conexion.getConexion().setUpdate(consulta);
   } 
}

