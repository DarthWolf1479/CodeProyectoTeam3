<%-- 
    Document   : ActualizarMateria
    Created on : Jun 4, 2017, 1:32:05 PM
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
    <title>Actualizar Materia</title>
 </head>
 <body>
 
    <jsp:include page="_header_1.jsp"></jsp:include>
    <h3>Actualizar Materia</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <c:if test="${not empty alumno}">
       <form method="POST" action="doActualizarAlumno">
          <input type="hidden" name="codigo" value="${materia.id}" />
          <table class="form" border="0">
             <tr>
                <td>Codigo:</td>
                <td style="color:red;">${materia.id}</td>
             </tr>
             <tr>
                <td>Nombre:</td>
                <td><input type="text" name="nombre" value="${materia.nombre}" /></td>
             </tr>
             <tr>
                <td>Horario:</td>
                <td><input type="text" name="apellido" value="${materia.horario}" /></td>
             </tr>
             <tr>
                <td>Aula:</td>
                <td><input type="text" name="correo" value="${materia.aula}" /></td>
             </tr>
             <tr>
                <td>Creditos:</td>
                <td><input type="text" name="telefono" value="${materia.creditos}" /></td>
             </tr>
          </table>
          <br>
          <input class="botonActualizar" type="submit" value="Actualizar Materia" /><br>
          <br>
          <a class="cancel" href="${pageContext.request.contextPath}/inicioMateria">Cancelar</a>    
       </form>
    </c:if>
 
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>
