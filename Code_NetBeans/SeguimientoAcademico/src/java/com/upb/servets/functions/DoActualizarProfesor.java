/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.servets.functions;

import com.upb.servets.*;
import com.upb.basededatos.Consultas;
import com.upb.entidades.Alumno;
import com.upb.entidades.Profesor;
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
@WebServlet(urlPatterns = {"/doActualizarProfesor"})
public class DoActualizarProfesor extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       String code = (String) request.getParameter("codigo");
       String nombre = (String) request.getParameter("nombre");
       String apellido = (String) request.getParameter("apellido");
       String correo = (String) request.getParameter("correo");
       String telefono = (String) request.getParameter("telefono");
       String fecha = (String) request.getParameter("fecha");
       
       
       Profesor profesor = new Profesor(code, nombre, apellido, correo, telefono, fecha);
 
       String errorString = null;

       Consultas.actualizarProfesor(code, nombre, apellido, correo, telefono, fecha);
 
       request.setAttribute("errorString", errorString);
       request.setAttribute("profesor", profesor);
 
 
       if (errorString != null) {
           RequestDispatcher dispatcher = request.getServletContext()
                   .getRequestDispatcher("/Views/actualizarProfesor.jsp");
           dispatcher.forward(request, response);
       }
        
       else {
           response.sendRedirect(request.getContextPath()+"/inicioProfesor");
       }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
