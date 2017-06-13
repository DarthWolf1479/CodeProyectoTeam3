<%-- 
    Document   : ActualizarAlumno
    Created on : Jun 4, 2017, 1:31:21 PM
    Author     : lucho
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Actualizar Alumno</title>
 </head>
 <body>
 
    <jsp:include page="_header_1.jsp"></jsp:include>
    <h3>Actualizar Alumno</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <c:if test="${not empty alumno}">
       <form method="POST" action="doActualizarAlumno">
          <input type="hidden" name="codigo" value="${alumno.pass}" />
          <table class="form" border="0">
             <tr>
                <td>Code:</td>
                <td style="color:red;">${alumno.pass}</td>
             </tr>
             <tr>
                <td>Nombre:</td>
                <td><input type="text" name="nombre" value="${alumno.nombre}" /></td>
             </tr>
             <tr>
                <td>Apellido:</td>
                <td><input type="text" name="apellido" value="${alumno.apellido}" /></td>
             </tr>
             <tr>
                <td>Correo:</td>
                <td><input type="text" name="correo" value="${alumno.email}" /></td>
             </tr>
             <tr>
                <td>Telefono:</td>
                <td><input type="text" name="telefono" value="${alumno.telefono}" /></td>
             </tr>
          </table>
          <br>
          <input class="botonActualizar" type="submit" value="Actualizar Alumno" /><br>
          <br>
          <a class="cancel" href="${pageContext.request.contextPath}/inicioAlumno">Cancelar</a>    
       </form>
    </c:if>
 
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>