/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author lucho
 */
public class Conexion {
    private String USERNAME = "root";
    private String PASSWORD = "Kevins1";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "seguimiento";
    private String CLASSNAME = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con;
    private static Conexion conexion;
    
    public Conexion(){
        
        try{
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e){
            System.err.println("ERROR"+e);
        }
    }
    
    public static Conexion getConexion(){
        if(conexion == null){
            conexion = new Conexion();
        }
        return conexion;
    }
    
   public ResultSet getConsulta(String _query){	
	Statement state;
	ResultSet resultado = null;
	try{
            state = (Statement) con.createStatement();
            resultado = state.executeQuery(_query);
	}
	catch(SQLException e){
            System.err.println("ERROR" + e);
	}
        return resultado;
    }
	
    public void setConsulta(String _query){
        Statement state;
	try{			
            state=(Statement) con.createStatement();
            state.execute(_query);

        } 
        catch(SQLException e){
            System.err.println("ERROR" + e);
        }
    }
    
    public void setUpdate(String _query){
        Statement state;
        try{			
            state =(Statement) con.createStatement();
            state.executeUpdate(_query);
        } 
        catch(SQLException e){
            System.err.println("ERROR" + e);
        }
    }
    
    public void cerrarConexion(){
       try {
            if (getConexion()!= null) con.close();
       } catch(SQLException e) {
                System.err.println("ERROR" + e);
            }
    }
   
}
