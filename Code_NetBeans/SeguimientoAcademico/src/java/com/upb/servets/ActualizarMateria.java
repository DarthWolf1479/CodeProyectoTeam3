/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.servets;

import com.upb.basededatos.Consultas;
import com.upb.entidades.Alumno;
import com.upb.entidades.Materia;
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
@WebServlet(urlPatterns = {"/actualizarMateria"})
public class ActualizarMateria extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String codigo = request.getParameter("codigo");
        Materia materia = null;
        String errorString = null;
        
        materia = Consultas.encontrarMateria(codigo);
        
       if(errorString!=null && materia == null){
            response.sendRedirect(request.getServletPath() + "/inicioMateria");
            return;
        }
        
        request.setAttribute("errorString", errorString);
        request.setAttribute("materia", materia);
        
        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/Views/actualizarMateria.jsp");
        dispatcher.forward(request, response);         
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
