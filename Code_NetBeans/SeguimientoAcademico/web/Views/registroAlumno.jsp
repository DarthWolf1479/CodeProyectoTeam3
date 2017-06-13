<%-- 
    Document   : RegistroAlumno
    Created on : Jun 4, 2017, 8:03:47 AM
    Author     : Kevin, Lucho
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="Views/style.css" />
    <title>Registrar Alumno</title>
 </head>
 <body>
 
    <jsp:include page="_header_1.jsp"></jsp:include> 
    <h3>Registrar Alumno</h3>
    
    <p style="color: red;">${errorString}</p>
    
    <form method="POST" action="doRegistrarAlumno">
       <table class="form" border="0">
          <tr>
             <td>Codigo</td>
             <td><input type="text" name="codigo" value="${alumno.pass}" /></td>
          </tr>
          <tr>
             <td>Nombre</td>
             <td><input type="text" name="nombre" value="${alumno.nombre}" /></td>
          </tr>
          <tr>
             <td>Apellido</td>
             <td><input type="text" name="apellido" value="${alumno.apellido}" /></td>
          </tr>
          <tr>
             <td>Correo</td>
             <td><input type="text" name="email" value="${alumno.email}" /></td>
          </tr>
          <tr>
             <td>Telefono</td>
             <td><input type="text" name="telefono" value="${alumno.telefono}" /></td>
          </tr>
          </table>   
          <input class="botonRegistrar" type="submit" value="Registrar" /><br><br>
          <a class="cancel" href="inicioAlumno">Cancelar</a>
             
    </form>
    
    <jsp:include page="_footer.jsp"></jsp:include>
    
 </body>
</html>
