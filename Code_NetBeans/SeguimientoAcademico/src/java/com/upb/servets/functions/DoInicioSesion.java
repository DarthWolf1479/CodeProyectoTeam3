/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.servets.functions;

import com.upb.basededatos.Consultas;
import com.upb.entidades.Usuario;
import java.io.IOException;
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
@WebServlet(urlPatterns = {"/iniciarSesion"})
public class DoInicioSesion extends HttpServlet {

    
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String pass = request.getParameter("pass");
         
        boolean hasError = false;
        String errorString = null;
        
        if (nombre == null || pass == null
                 || nombre.length() == 0 || pass.length() == 0) {
            hasError = true;
            errorString = "Se requiere que llene los campos";
        } 
        
        if(Consultas.autenticacion(nombre, pass) == false) {
            hasError = true;
            errorString = "Nombre o contraseña incorrectos";
        }
            
        if (hasError) {
            request.setAttribute("errorString", errorString);
 
            RequestDispatcher dispatcher 
                    = this.getServletContext().getRequestDispatcher("/Views/inicioSesion.jsp");
            dispatcher.forward(request, response);
        }
     
        else {
            
            Usuario user = new Usuario();
            user.setNombre(nombre);
            user.setPass(pass);
            HttpSession session = request.getSession();
            Consultas.setDatos(user);
            session.setAttribute("loginedUser", user);
            response.sendRedirect(request.getContextPath() + "/Inicio");
        } 
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    
}
