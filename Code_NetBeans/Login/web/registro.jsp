<%-- 
    Document   : registro
    Created on : May 29, 2017, 2:35:34 PM
    Author     : lucho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarme</title>
    </head>
    <body>
        <h1>Formulario de Registro</h1>
        <form action="nuevoUsuario" method="post">
            <label>Usuario</label>
            <input type="text" name="Usuario" /><br>
            <label>Constrasena</label>
            <input type="text" name="Contrasena"/><br>
            <label>Apellido</label>
            <input type="text" name="Apellido"/><br>
            <label>Correo</label>
            <input type="text" name="Correo"/><br>
            <input type="submit" value="Registrarme" />
        </form>
    </body>
</html>
