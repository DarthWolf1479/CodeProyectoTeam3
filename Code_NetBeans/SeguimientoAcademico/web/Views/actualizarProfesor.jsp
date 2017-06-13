<%-- 
    Document   : ActualizarProfesor
    Created on : Jun 4, 2017, 1:31:36 PM
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
    <title>Actualizar Profesor</title>
 </head>
 <body>
 
    <jsp:include page="_header_1.jsp"></jsp:include>
    <h3>Actualizar Profesor</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <c:if test="${not empty profesor}">
       <form method="POST" action="doActualizarProfesor">
          <input type="hidden" name="codigo" value="${profesor.id}" />
          <table class="form" border="0">
             <tr>
                <td>Codigo:</td>
                <td style="color:red;">${profesor.id}</td>
             </tr>
             <tr>
                <td>Nombre:</td>
                <td><input type="text" name="nombre" value="${profesor.nombre}" /></td>
             </tr>
             <tr>
                <td>Apellido:</td>
                <td><input type="text" name="apellido" value="${profesor.apellido}" /></td>
             </tr>
             <tr>
                <td>Correo:</td>
                <td><input type="text" name="correo" value="${profesor.email}" /></td>
             </tr>
             <tr>
                <td>Telefono:</td>
                <td><input type="text" name="telefono" value="${profesor.telefono}" /></td>
             </tr>
             <tr>
                <td>Nacimiento:</td>
                <td><input type="text" name="fecha" value="${profesor.fecha_nac}" /></td>
             </tr>
          </table>
          <br>
          <input class="botonActualizar" type="submit" value="Actualizar Profesor" /><br>
          <br>
          <a class="cancel" href="${pageContext.request.contextPath}/inicioProfesor">Cancelar</a>    
       </form>
    </c:if>
 
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>