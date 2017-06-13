<%-- 
    Document   : RegistroMateria
    Created on : Jun 4, 2017, 11:25:17 AM
    Author     : lucho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Materia</title>
    </head>
    <body>
        <h1>Registro</h1>
        <form action="RegistrarM" method="post">
            <label>Nombre</label>
            <input type="text" name="nombre" /><br>
            <label>Codigo</label>
            <input type="text" name="codigo"/><br>
            <label>Aula</label>
            <input type="text" name ="aula" /><br>
            <input type="submit" value="Registrarme" />
            
        </form>
    </body>
</html>
