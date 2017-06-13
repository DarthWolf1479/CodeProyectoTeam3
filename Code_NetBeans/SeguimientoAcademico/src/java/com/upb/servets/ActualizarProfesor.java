/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.servets;

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
@WebServlet(urlPatterns = {"/actualizarProfesor"})
public class ActualizarProfesor extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String codigo = request.getParameter("codigo");
        Profesor profesor = null;
        String errorString = null;
        
        profesor = Consultas.encontrarProfesor(codigo);
        
       if(errorString!=null && profesor == null){
            response.sendRedirect(request.getServletPath() + "/inicioProfesor");
            return;
        }
        
        request.setAttribute("errorString", errorString);
        request.setAttribute("profesor", profesor);
        
        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/Views/actualizarProfesor.jsp");
        dispatcher.forward(request, response); 
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
