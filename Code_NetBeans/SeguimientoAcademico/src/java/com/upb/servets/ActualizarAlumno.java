/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.servets;

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
@WebServlet(urlPatterns = {"/actualizarAlumno"})
public class ActualizarAlumno extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String codigo = request.getParameter("codigo");
        Alumno alumno = null;
        String errorString = null;
        
        alumno = Consultas.encontrarAlumno(codigo);
        
       if(errorString!=null && alumno == null){
            response.sendRedirect(request.getServletPath() + "/inicioAlumno");
            return;
        }
        
        request.setAttribute("errorString", errorString);
        request.setAttribute("alumno", alumno);
        
        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/Views/actualizarAlumno.jsp");
        dispatcher.forward(request, response);         
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
