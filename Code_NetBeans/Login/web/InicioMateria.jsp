<%-- 
    Document   : InicioMateria
    Created on : Jun 4, 2017, 11:24:43 AM
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
        <h1>Inicio Materia</h1>
        <form action="InicioM" method="post" >
            <label>Nombre</label>
            <input type="text" name="nombre" /><br>
            <label>Codigo</label>
            <input type="text" name="codigo" /><br>
            <input type="submit" value="Iniciar" />
        </form>
        Nueva materia...<a href="RegistroMateria.jsp">Registrar</a><br>
        <a href="EliminarMateria.jsp">Eliminar Materia</a><br>
        <a href="ActualizarMateria.jsp">Actualizar Materia</a>
        <br>

    </body>
</html>
