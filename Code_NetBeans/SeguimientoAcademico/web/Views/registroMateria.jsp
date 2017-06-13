<%-- 
    Document   : RegistroMateria
    Created on : Jun 4, 2017, 11:25:17 AM
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
    <title>Registrar Materia</title>
 </head>
 <body>
 
    <jsp:include page="_header_1.jsp"></jsp:include> 
    <h3>Registrar Materia</h3>
    
    <p style="color: red;">${errorString}</p>
    
    <form method="POST" action="doRegistrarMateria">
       <table class="form" border="0">
          <tr>
             <td>Codigo:</td>
             <td><input type="text" name="codigo" value="${materia.id}" /></td>
          </tr>
          <tr>
             <td>Nombre:</td>
             <td><input type="text" name="nombre" value="${materia.nombre}" /></td>
          </tr>
          <tr>
             <td>Horario:</td>
             <td><input type="text" name="horario" value="${materia.horario}" /></td>
          </tr>
          <tr>
             <td>Aula:</td>
             <td><input type="text" name="aula" value="${materia.aula}" /></td>
          </tr>
          <tr>
             <td>Creditos:</td>
             <td><input type="text" name="creditos" value="${materia.creditos}" /></td>
          </tr>
          </table>   
          <input class="botonRegistrar" type="submit" value="Registrar" /><br><br>
          <a class="cancel" href="inicioMateria">Cancelar</a>
             
    </form>
    
    <jsp:include page="_footer.jsp"></jsp:include>
    
 </body>
</html>
