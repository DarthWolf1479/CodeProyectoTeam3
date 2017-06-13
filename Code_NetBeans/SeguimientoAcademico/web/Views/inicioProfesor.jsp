<%-- 
    Document   : InicioProfesor
    Created on : Jun 4, 2017, 10:41:19 AM
    Author     : lucho
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="Views/style.css" />
    <title>Profesores</title>
 </head>
 <body>
 
    <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
 
    <h3>Lista de Profesores</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <table border="1" cellpadding="5" cellspacing="1" align="center" >
       <tr>
          <th>Codigo</th>
          <th>Nombre</th>
          <th>Apellido</th>
          <th>Correo</th>
          <th>Telefono</th>
          <th>Nacimiento</th>
          <th>Actualizar</th>
          <th>Eliminar</th>
       </tr>
       <c:forEach items="${listaProfesor}" var="profesor" >
          <tr>
             <td>${profesor.id}</td>
             <td>${profesor.nombre}</td>  
             <td>${profesor.apellido}</td>
             <td>${profesor.email}</td>
             <td>${profesor.telefono}</td>
             <td>${profesor.fecha_nac}</td>
             <td>
                <a href="${pageContext.request.contextPath}/actualizarProfesor?codigo=${profesor.id}">Actualizar</a>
             </td>
             <td>
                <a href="${pageContext.request.contextPath}/eliminarProfesor?codigo=${profesor.id}">Eliminar</a>
             </td>
          </tr>
       </c:forEach>
    </table>
    </br>
    <a href= "registrarProfesor">Registrar Profesor</a>
 
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>