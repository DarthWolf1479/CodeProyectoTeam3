/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.servets;

import com.upb.basededatos.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lucho
 */
public class EliminarProfesor extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String code = (String) request.getParameter("codigo");
 
       String errorString = null;
 
       Consultas.eliminarProfesor(code);
        
         
         if (errorString != null) {
             request.setAttribute("errorString", errorString);
          
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/Views/EliminarAlumno.jsp");
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
