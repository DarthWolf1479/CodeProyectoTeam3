<%-- 
    Document   : EliminarProfesor
    Created on : Jun 4, 2017, 11:10:45 AM
    Author     : lucho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar</title>
    </head>
    <body>
        <h1>Profesor</h1>
        <form action="EliminarP" method="post" >
            <label>Codigo</label>
            <input type="text" name="codigo" /><br>
            <input type="submit" value="Eliminar" />
        </form>
    </body>
</html>
