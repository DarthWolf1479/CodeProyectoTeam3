<%-- 
    Document   : index
    Created on : May 29, 2017, 2:24:17 PM
    Author     : lucho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesion</title>
        <script src="js/main.js"></script>
    </head>
    <body>
        <h1>Iniciar Sesion</h1>
        <form action="iniciar" method="post" id="forminicio">
            <label>Nombre</label>
            <input type="text" name="usuario" id="txtusuario"/><br>
            <lable>Contraseña</lable>
            <input type="password" name="pass" id="txtpass"/><br>
            <input type="submit" value="Iniciar Sesion" id="btniniciar"/>
        </form>
         <br>
        No tienes una cuenta... <a href="registro.jsp">Registrarse</a>
    </body>
</html>
