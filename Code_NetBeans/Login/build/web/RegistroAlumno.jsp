<%-- 
    Document   : RegistroAlumno
    Created on : Jun 4, 2017, 8:03:47 AM
    Author     : lucho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h1>Registrarse</h1>
        <form action="RegistrarA" method="post">
            <label>Nombre</label>
            <input type="text" name="nombre" /><br>
            <label>Codigo</label>
            <input type="text" name="codigo"/><br>
            <input type="submit" value="Registrarme" />
            
        </form>
    </body>
</html>
