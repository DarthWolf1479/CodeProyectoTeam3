<%-- 
    Document   : ActualizarProfesor
    Created on : Jun 4, 2017, 1:31:36 PM
    Author     : lucho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar</title>
    </head>
    <body>
        <h1>Profesor</h1>
        <form action="ActualizarP" method="post" >
            <label>Nombre Nuevo</label>
            <input type="text" name="nombre" /><br>
            <label>Codigo Nuevo</label>
            <input type="text" name="codigo"/><br>
            <label>Codigo</label>
            <input type="text" name="codigo2"/><br>
            <input type="submit" value="Actualizar" />
        </form>
    </body>
</html>
