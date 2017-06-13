/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upb.servets.functions;

import com.upb.servets.*;
import com.upb.basededatos.Consultas;
import com.upb.entidades.Alumno;
import com.upb.entidades.Materia;
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
@WebServlet(urlPatterns = {"/doRegistrarMateria"})
public class DoRegistrarMateria extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
       String codigo = request.getParameter("codigo");
       String nombre = request.getParameter("nombre");
       String horario = request.getParameter("horario");
       String aula = request.getParameter("aula");
       String creditos = request.getParameter("creditos");
       
       
       Materia materia = new Materia(codigo, nombre, horario, aula, creditos);
 
       String errorString = null;
 
       String regex = "\\w+";
       
       if (codigo==null || nombre==null || horario==null||aula==null||creditos==null ||
               codigo.length()==0 || nombre.length()==0 || horario.length()==0||aula.length()==0||creditos.length()==0) {
            errorString = "Debe llenar todos los campos";
       }
       if (codigo == null || !codigo.matches(regex)) {
           errorString = "Codigo invalido, ingrese otro";
       }
       
       if(Consultas.encontrarAlumno(codigo)!=null){
           errorString = "Ya existe un alumno con ese codigo";
       }
 
       if (errorString == null) {
           Consultas.registrarMateria(materia);
        }
        
       request.setAttribute("errorString", errorString);
       request.setAttribute("materia", materia);
 
       if (errorString != null) {
           RequestDispatcher dispatcher = request.getServletContext()
                   .getRequestDispatcher("/Views/registroMateria.jsp");
           dispatcher.forward(request, response);
       }
            
       else {
           response.sendRedirect(request.getContextPath() + "/inicioMateria");
       }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
