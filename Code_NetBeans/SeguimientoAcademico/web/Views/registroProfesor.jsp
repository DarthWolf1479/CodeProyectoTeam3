<%-- 
    Document   : RegistroProfesor
    Created on : Jun 4, 2017, 10:43:39 AM
    Author     : lucho
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="Views/style.css" />
    <title>Registrar Profesor</title>
 </head>
 <body>
 
    <jsp:include page="_header_1.jsp"></jsp:include> 
    <h3>Registrar Profesor</h3>
    
    <p style="color: red;">${errorString}</p>
    
    <form method="POST" action="doRegistrarProfesor">
       <table class="form" border="0">
          <tr>
             <td>Codigo</td>
             <td><input type="text" name="codigo" value="${profesor.id}" /></td>
          </tr>
          <tr>
             <td>Nombre</td>
             <td><input type="text" name="nombre" value="${profesor.nombre}" /></td>
          </tr>
          <tr>
             <td>Apellido</td>
             <td><input type="text" name="apellido" value="${profesor.apellido}" /></td>
          </tr>
          <tr>
             <td>Correo</td>
             <td><input type="text" name="email" value="${profesor.email}" /></td>
          </tr>
          <tr>
             <td>Telefono</td>
             <td><input type="text" name="telefono" value="${profesor.telefono}" /></td>
          </tr>
          <tr>
             <td>Fecha de Nacimiento</td>
             <td><input type="text" name="fecha" value="${profesor.fecha_nac}" /></td>
          </tr>
          </table>   
          <input class="botonRegistrar" type="submit" value="Registrar" /><br><br>
          <a class="cancel" href="inicioProfesor">Cancelar</a>
             
    </form>
    
    <jsp:include page="_footer.jsp"></jsp:include>
    
 </body>
</html>
