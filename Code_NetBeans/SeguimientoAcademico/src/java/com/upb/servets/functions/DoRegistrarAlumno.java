/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.servets.functions;

import com.upb.servets.*;
import com.upb.basededatos.Consultas;
import com.upb.entidades.Alumno;
import com.upb.entidades.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lucho
 */
@WebServlet(urlPatterns = {"/doRegistrarAlumno"})
public class DoRegistrarAlumno extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
       String codigo = request.getParameter("codigo");
       String nombre = request.getParameter("nombre");
       String apellido = request.getParameter("apellido");
       String correo = request.getParameter("email");
       String telefono = request.getParameter("telefono");
       
       
       Alumno alumno = new Alumno(codigo, nombre, apellido, correo, telefono);
 
       String errorString = null;
 
       String regex = "\\w+";
       
       if (codigo==null || nombre==null || apellido==null||correo==null||telefono==null ||
               codigo.length()==0 || nombre.length()==0 || apellido.length()==0||correo.length()==0||telefono.length()==0) {
            errorString = "Debe llenar todos los campos";
       }
       if (codigo == null || !codigo.matches(regex)) {
           errorString = "Codigo invalido, ingrese otro";
       }
       
       if(Consultas.encontrarAlumno(codigo)!=null){
           errorString = "Ya existe un alumno con ese codigo";
       }
 
       if (errorString == null) {
           Consultas.registrarAlumno(alumno);
        }
        
       request.setAttribute("errorString", errorString);
       request.setAttribute("alumno", alumno);
 
       if (errorString != null) {
           RequestDispatcher dispatcher = request.getServletContext()
                   .getRequestDispatcher("/Views/registroAlumno.jsp");
           dispatcher.forward(request, response);
       }
            
       else {
           response.sendRedirect(request.getContextPath() + "/inicioAlumno");
       }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
