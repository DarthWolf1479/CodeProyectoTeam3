/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author lucho
 */
public class Consultas extends Conexion {
    public boolean autenticacion(String nombre, String contrasena){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select * from usuarios where nombre = ? and pass = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2,contrasena);
            rs = pst.executeQuery();
            if (rs.absolute(1)){
                return true;
            }
        } catch(Exception e) {
            System.err.println("ERROR"+e);
        } finally {
            try {
            if (getConexion()!= null) getConexion().close();
            if (pst != null) pst.close();
            if (rs != null) rs.close();
            } catch(Exception e) {
                System.err.println("ERROR" + e);
            }
        }
        return false;
    }
   public boolean registrar (String nombre, String contrasena, String apellido, String correo) {
       PreparedStatement pst = null;
       try {
           String Consulta = "insert into usuarios (nombre,pass,Apellido,Correo) values(?,?,?,?)";
           pst = getConexion().prepareStatement(Consulta);
           pst.setString(1, nombre);
           pst.setString(2, contrasena);
           pst.setString(3, apellido);
           pst.setString(4, correo);
           if (pst.executeUpdate()== 1) {
               return true;
               
           }
       } catch(Exception ex) {
             System.err.println("ERROR" + ex);
       } finally {
            try {
            if (getConexion()!= null) getConexion().close();
            if (pst != null) pst.close();
            } catch(Exception e) {
                System.err.println("ERROR" + e);
            }
        }
       return false;
  
}
   public boolean eliminar(String nombre) {
       
       PreparedStatement pst = null;
       try {
           String consulta = "DELETE FROM usuarios WHERE nombre = ?";
           pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            if (pst.executeUpdate()== 1){
                return true;
            }
       } catch(Exception e) {
           System.err.println("ERROR" + e);
       } finally {
            try {
            if (getConexion()!= null) getConexion().close();
            if (pst != null) pst.close();
            } catch(Exception e) {
                System.err.println("ERROR" + e);
            }
       }
       return false;
   }
    public boolean Actualizar(String nombre, String pass, String codigo2) {
       
       PreparedStatement pst = null;
       try {
           String consulta = "update usuarios set nombre = ?, pass = ? where pass = ?";
           pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, pass);
            pst.setString(3, codigo2);
            if (pst.executeUpdate()== 1){
                return true;
            }
       } catch(Exception e) {
           System.err.println("ERROR" + e);
       } finally {
            try {
            if (getConexion()!= null) getConexion().close();
            if (pst != null) pst.close();
            } catch(Exception e) {
                System.err.println("ERROR" + e);
            }
       }
       return false;
   }
 public boolean autenticacionAlumno(String nombre, String codigo){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select * from alumnos where nombre = ? and codigo = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2,codigo);
            rs = pst.executeQuery();
            if (rs.absolute(1)){
                return true;
            }
        } catch(Exception e) {
            System.err.println("ERROR"+e);
        } finally {
            try {
            if (getConexion()!= null) getConexion().close();
            if (pst != null) pst.close();
            if (rs != null) rs.close();
            } catch(Exception e) {
                System.err.println("ERROR" + e);
            }
            
        }
        return false;
    }
   
   public boolean registrarAlumno(String nombre, String codigo) {
       PreparedStatement pst = null;
       try{
           String Consulta = "insert into alumnos (nombre,codigo) values(?,?)";
            pst = getConexion().prepareStatement(Consulta);
            pst.setString(1, nombre);
            pst.setString(2, codigo);
            if (pst.executeUpdate() == 1){
                return true;
                
            }
       } catch (Exception ex) {
           System.err.println("ERROR" + ex);
       } finally {
           try {
               if (getConexion() != null) getConexion().close();
               if (pst != null) pst.close();
           } catch (Exception e) {
               System.err.println("ERROR" + e);
           }
       }
       return false;
   }
    public boolean eliminarAlumno(String codigo) {
       
       PreparedStatement pst = null;
       try {
           String consulta = "DELETE FROM alumnos WHERE codigo = ?";
           pst = getConexion().prepareStatement(consulta);
            pst.setString(1, codigo);
            if (pst.executeUpdate()== 1){
                return true;
            }
       } catch(Exception e) {
           System.err.println("ERROR" + e);
       } finally {
            try {
            if (getConexion()!= null) getConexion().close();
            if (pst != null) pst.close();
            } catch(Exception e) {
                System.err.println("ERROR" + e);
            }
       }
       return false;
   }
    public boolean ActualizarAlumno(String nombre, String codigo, String codigo2) {
       
       PreparedStatement pst = null;
       try {
           String consulta = "update alumnos set nombre = ?, codigo = ? where codigo = ?";
           pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, codigo);
            pst.setString(3, codigo2);
            if (pst.executeUpdate()== 1){
                return true;
            }
       } catch(Exception e) {
           System.err.println("ERROR" + e);
       } finally {
            try {
            if (getConexion()!= null) getConexion().close();
            if (pst != null) pst.close();
            } catch(Exception e) {
                System.err.println("ERROR" + e);
            }
       }
       return false;
   }
   public boolean autenticacionProfesor(String nombre, String codigo){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select * from profesor where nombre = ? and codigo = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2,codigo);
            rs = pst.executeQuery();
            if (rs.absolute(1)){
                return true;
            }
        } catch(Exception e) {
            System.err.println("ERROR"+e);
        } finally {
            try {
            if (getConexion()!= null) getConexion().close();
            if (pst != null) pst.close();
            if (rs != null) rs.close();
            } catch(Exception e) {
                System.err.println("ERROR" + e);
            }
        }
        return false;
    }
   
   public boolean registrarProfesor(String nombre, String codigo) {
       PreparedStatement pst = null;
       try{
           String Consulta = "insert into profesor (nombre,codigo) values(?,?)";
            pst = getConexion().prepareStatement(Consulta);
            pst.setString(1, nombre);
            pst.setString(2, codigo);
            if (pst.executeUpdate() == 1){
                return true;
                
            }
       } catch (Exception ex) {
           System.err.println("ERROR" + ex);
       } finally {
           try {
               if (getConexion() != null) getConexion().close();
               if (pst != null) pst.close();
           } catch (Exception e) {
               System.err.println("ERROR" + e);
           }
       }
       return false;
   }
    public boolean eliminarProfesor(String codigo) {
       
       PreparedStatement pst = null;
       try {
           String consulta = "DELETE FROM profesor WHERE codigo = ?";
           pst = getConexion().prepareStatement(consulta);
            pst.setString(1, codigo);
            if (pst.executeUpdate()== 1){
                return true;
            }
       } catch(Exception e) {
           System.err.println("ERROR" + e);
       } finally {
            try {
            if (getConexion()!= null) getConexion().close();
            if (pst != null) pst.close();
            } catch(Exception e) {
                System.err.println("ERROR" + e);
            }
       }
       return false;
   }
    public boolean ActualizarProfesor(String nombre, String codigo, String codigo2) {
       
       PreparedStatement pst = null;
       try {
           String consulta = "update profesor set nombre = ?, codigo = ? where codigo = ?";
           pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, codigo);
            pst.setString(3, codigo2);
            if (pst.executeUpdate()== 1){
                return true;
            }
       } catch(Exception e) {
           System.err.println("ERROR" + e);
       } finally {
            try {
            if (getConexion()!= null) getConexion().close();
            if (pst != null) pst.close();
            } catch(Exception e) {
                System.err.println("ERROR" + e);
            }
       }
       return false;
   }
   public boolean autenticacionMateria(String nombre, String codigo){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select * from materia where nombre = ? and codigo = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2,codigo);
            rs = pst.executeQuery();
            if (rs.absolute(1)){
                return true;
            }
        } catch(Exception e) {
            System.err.println("ERROR"+e);
        } finally {
            try {
            if (getConexion()!= null) getConexion().close();
            if (pst != null) pst.close();
            if (rs != null) rs.close();
            } catch(Exception e) {
                System.err.println("ERROR" + e);
            }
        }
        return false;
    }
    
   public boolean registrarMateria(String nombre, String codigo, String aula) {
       PreparedStatement pst = null;
       try{
           String Consulta = "insert into materia (nombre,codigo,aula) values(?,?,?)";
            pst = getConexion().prepareStatement(Consulta);
            pst.setString(1, nombre);
            pst.setString(2, codigo);
            pst.setString(3, aula);
            if (pst.executeUpdate() == 1){
                return true;
                
            }
       } catch (Exception ex) {
           System.err.println("ERROR" + ex);
       } finally {
           try {
               if (getConexion() != null) getConexion().close();
               if (pst != null) pst.close();
           } catch (Exception e) {
               System.err.println("ERROR" + e);
           }
       }
       return false;
   }
    public boolean eliminarMateria(String codigo) {
       
       PreparedStatement pst = null;
       try {
           String consulta = "DELETE FROM materia WHERE codigo = ?";
           pst = getConexion().prepareStatement(consulta);
            pst.setString(1, codigo);
            if (pst.executeUpdate()== 1){
                return true;
            }
       } catch(Exception e) {
           System.err.println("ERROR" + e);
       } finally {
            try {
            if (getConexion()!= null) getConexion().close();
            if (pst != null) pst.close();
            } catch(Exception e) {
                System.err.println("ERROR" + e);
            }
       }
       return false;
   }
    public boolean ActualizarMateria(String nombre, String codigo, String aula, String codigo2) {
       
       PreparedStatement pst = null;
       try {
           String consulta = "update materia set nombre = ?, codigo = ?, aula = ? where codigo = ?";
           pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, codigo);
            pst.setString(3, aula);
            pst.setString(4, codigo2);
            if (pst.executeUpdate()== 1){
                return true;
            }
       } catch(Exception e) {
           System.err.println("ERROR" + e);
       } finally {
            try {
            if (getConexion()!= null) getConexion().close();
            if (pst != null) pst.close();
            } catch(Exception e) {
                System.err.println("ERROR" + e);
            }
       }
       return false;
   }
   
    public static void main(String[] args) {
        Consultas co = new Consultas();
       System.out.println(co.ActualizarMateria("Computacion", "4545", "u8", "1"));
       
    }
   
    
}

