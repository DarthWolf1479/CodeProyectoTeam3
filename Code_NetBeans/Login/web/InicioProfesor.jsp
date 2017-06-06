<%-- 
    Document   : InicioProfesor
    Created on : Jun 4, 2017, 10:41:19 AM
    Author     : lucho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profesor</title>
    </head>
    <body>
        <h1>Inicio Profesor</h1>
        <form action="InicioP" method="post" >
            <label>Nombre</label>
            <input type="text" name="nombre" /><br>
            <label>Codigo</label>
            <input type="text" name="codigo" /><br>
            <input type="submit" value="Iniciar" />
        </form>
        <a href="RegistroProfesor.jsp">Registrarme</a><br>
        <a href="EliminarProfesor.jsp">Eliminar</a><br>
        <a href="ActualizarProfesor.jsp">Actualizar Profesor</a>
        <br>
    </body>
</html>
