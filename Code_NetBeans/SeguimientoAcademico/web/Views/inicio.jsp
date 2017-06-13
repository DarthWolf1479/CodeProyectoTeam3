<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="Views/style.css" />
    <title>Inicio</title>
 </head>
 <body>
 
    <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
 
    <h3>Informacion de Usuario</h3>
    <br/>
    <table border="0" align="center">
    <tr>
    <td><a1>Nombre:</a1></td>
    <td><a1>${user.nombre}</a1></td>
    </tr>
    <tr>
    <td><a1>Apellido:</a1></td>  
    <td><a1>${user.apellido}</a1></td>
    </tr>
    <tr>
    <td><a1>Correo:</a1></td>     
    <td><a1>${user.email}</a1></td>
    </tr>
    </table>
    <br/>
    <br/>
    <br/>
    <br/>
    
 
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>
