<%-- 
    Document   : InicioAlumno
    Created on : Jun 4, 2017, 7:59:21 AM
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
    <title>Alumnos</title>
 </head>
 <body>
 
    <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
 
    <h3>Lista de Alumnos</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <table border="1" cellpadding="5" cellspacing="1" align="center" >
       <tr>
          <th>Codigo</th>
          <th>Nombre</th>
          <th>Apellido</th>
          <th>Correo</th>
          <th>Telefono</th>
          <th>Actualizar</th>
          <th>Eliminar</th>
       </tr>
       <c:forEach items="${listaAlumno}" var="alumno" >
          <tr>
             <td>${alumno.pass}</td>
             <td>${alumno.nombre}</td>  
             <td>${alumno.apellido}</td>
             <td>${alumno.email}</td>
             <td>${alumno.telefono}</td>
             <td>
                <a href="${pageContext.request.contextPath}/actualizarAlumno?codigo=${alumno.pass}">Actualizar</a>
             </td>
             <td>
                <a href="${pageContext.request.contextPath}/eliminarAlumno?codigo=${alumno.pass}">Eliminar</a>
             </td>
          </tr>
       </c:forEach>
    </table>
    </br>
    <a href= "registrarAlumno">Registrar Alumno</a>
 
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>