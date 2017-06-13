/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.servets.functions;

import com.upb.basededatos.Consultas;
import com.upb.entidades.Alumno;
import java.io.IOException;
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
@WebServlet(urlPatterns = {"/doActualizarAlumno"})
public class DoActualizarAlumno extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       String code = (String) request.getParameter("codigo");
       String nombre = (String) request.getParameter("nombre");
       String apellido = (String) request.getParameter("apellido");
       String correo = (String) request.getParameter("correo");
       String telefono = (String) request.getParameter("telefono");
       
       
       Alumno alumno = new Alumno(code, nombre, apellido, correo, telefono);
 
       String errorString = null;

       Consultas.actualizarAlumno(code, nombre, apellido, correo, telefono);
 
       request.setAttribute("errorString", errorString);
       request.setAttribute("alumno", alumno);
 
 
       if (errorString != null) {
           RequestDispatcher dispatcher = request.getServletContext()
                   .getRequestDispatcher("/Views/actualizarAlumno.jsp");
           dispatcher.forward(request, response);
       }
        
       else {
           response.sendRedirect(request.getContextPath()+"/inicioAlumno");
       }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
