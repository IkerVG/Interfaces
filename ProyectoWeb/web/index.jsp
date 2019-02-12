<%-- 
    Document   : index
    Created on : 29-ene-2019, 8:52:28
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            HttpSession sesion = request.getSession();
            sesion.invalidate();
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proyecto Web con Base de Datos</title>
    </head>
    <body>
        <h1>Proyecto Web con Base de Datos</h1>
        <a href="Pedidos.jsp">Gestión de pedidos</a>
    </body>
</html>
