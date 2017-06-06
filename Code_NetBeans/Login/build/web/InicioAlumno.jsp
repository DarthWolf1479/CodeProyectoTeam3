<%-- 
    Document   : InicioAlumno
    Created on : Jun 4, 2017, 7:59:21 AM
    Author     : lucho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Alumno</title>
    </head>
    <body>
        <h1>Inicio Alumno</h1>
        <form action="IniciarA" method="post" >
            <label>Nombre</label>
            <input type="text" name="nombre" /><br>
            <label>Codigo</label>
            <input type="text" name="codigo" /><br>
            <input type="submit" value="Iniciar" />
        </form>
        <a href="RegistroAlumno.jsp">Registrarme</a><br>
        <a href="EliminarAlumno.jsp">Eliminar Alumno</a><br>
        <a href="ActualizarAlumno.jsp">Actualizar Alumno</a>
        <br>
    </body>
</html>
