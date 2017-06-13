/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.servets;

import com.upb.basededatos.Consultas;
import com.upb.entidades.Alumno;
import com.upb.entidades.Usuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lucho
 */
@WebServlet(urlPatterns = {"/inicioAlumno"})
public class InicioAlumno extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        Usuario loginedUser = (Usuario) session.getAttribute("loginedUser");;
  
        if (loginedUser == null) {
            response.sendRedirect(request.getContextPath() + "/login");
            return;
        }
        
        request.setAttribute("user", loginedUser);
        
        String errorString = null;
        List<Alumno> list = null;
        list = Consultas.listaAlumnos();
   
        request.setAttribute("errorString", errorString);
        request.setAttribute("listaAlumno", list);
        
        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/Views/inicioAlumno.jsp");
        dispatcher.forward(request, response);
    
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

  
}
