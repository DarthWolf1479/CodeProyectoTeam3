<%-- 
    Document   : InicioMateria
    Created on : Jun 4, 2017, 11:24:43 AM
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
    <title>Materias</title>
 </head>
 <body>
 
    <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
 
    <h3>Lista de Materias</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <table border="1" cellpadding="5" cellspacing="1" align="center" >
       <tr>
          <th>Codigo</th>
          <th>Nombre</th>
          <th>Horario</th>
          <th>Aula</th>
          <th>Creditos</th>
          <th>Actualizar</th>
          <th>Eliminar</th>
       </tr>
       <c:forEach items="${listaMateria}" var="materia" >
          <tr>
             <td>${materia.id}</td>
             <td>${materia.nombre}</td>  
             <td>${materia.horario}</td>
             <td>${materia.aula}</td>
             <td>${materia.creditos}</td>
             <td>
                <a href="${pageContext.request.contextPath}/actualizarMateria?codigo=${materia.id}">Actualizar</a>
             </td>
             <td>
                <a href="${pageContext.request.contextPath}/eliminarMateria?codigo=${materia.id}">Eliminar</a>
             </td>
          </tr>
       </c:forEach>
    </table>
    </br>
    <a href= "registrarMateria">Registrar Materia</a>
 
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>