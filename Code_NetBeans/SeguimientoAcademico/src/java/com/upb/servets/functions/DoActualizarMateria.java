/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.servets.functions;

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
@WebServlet(urlPatterns = {"/doActualizarMateria"})
public class DoActualizarMateria extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       String code = (String) request.getParameter("codigo");
       String nombre = (String) request.getParameter("nombre");
       String horario = (String) request.getParameter("horario");
       String aula = (String) request.getParameter("aula");
       String creditos = (String) request.getParameter("creditos");
       
       
       Materia materia = new Materia(code, nombre, horario, aula, creditos);
 
       String errorString = null;

       Consultas.actualizarMateria(code, nombre, horario, aula, creditos);
 
       request.setAttribute("errorString", errorString);
       request.setAttribute("materia", materia);
 
 
       if (errorString != null) {
           RequestDispatcher dispatcher = request.getServletContext()
                   .getRequestDispatcher("/Views/actualizarMateria.jsp");
           dispatcher.forward(request, response);
       }
        
       else {
           response.sendRedirect(request.getContextPath()+"/inicioMateria");
       }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}