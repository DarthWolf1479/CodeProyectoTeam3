<%-- 
    Document   : EliminarAlumno
    Created on : Jun 4, 2017, 10:47:21 AM
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
        <h1>Alumno</h1>
        <form action="EliminarA" method="post" >
            <label>Codigo</label>
            <input type="text" name="codigo" /><br>
            <input type="submit" value="Eliminar" />
        </form>
    </body>
</html>
