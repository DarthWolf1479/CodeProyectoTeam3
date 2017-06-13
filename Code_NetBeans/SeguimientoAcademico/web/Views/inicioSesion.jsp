'<%-- 
    Document   : inicioSesion
    Created on : 11-06-2017, 01:47:27 PM
    Author     : Kevin Viscafe
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="Views/style.css" />
    <title>Login</title>
 </head>
 <body>
 
    <jsp:include page="_header_1.jsp"></jsp:include>
   
 
    <h3>Iniciar Sesion</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <form  method="POST" action="iniciarSesion">
       <table border="0">
          <tr>
             <td>Usuario:</td>
             <td><input type="text" name="nombre"/> </td>
          </tr>
          <tr><td><td></td></td></tr>
          <tr>
             <td>Contraseña:</td>
             <td><input type="text" name="pass"/> </td>
          </tr>
          </table>
        <br>
         <input id="button" type="submit" value= "Iniciar Sesion" />
             
    </form>
         <br>
         <br>
         
        
        <jsp:include page="_footer_1.jsp"></jsp:include>
    </body>
</html>
