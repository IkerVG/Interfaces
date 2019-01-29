<%-- 
    Document   : Pedidos_codInsertado
    Created on : 29-ene-2019, 10:42:15
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión de Pedidos</title>
    </head>
    <body>
        <h1>Gestión de Pedidos</h1>
        <%
        HttpSession s = request.getSession();
        if(1==2){
            %><h2> El cliente con el código x no existe</h2> <%   
        }else{
            %>
            <h2>Datos del cliente</h2>
            <table>
                <tr><th><b>Código</b></th>  <th><b>N.I.F.</b></th>  <b>Nombre</b>  <b>Apellidos</b><br>
            <br>
            <b>Domicilio</b><b>C.P.</b><b>Localidad</b><b>Total</b><br>
            <br>
            <!------------------------------------------------------------------------->
            <hr><!------------------------------------------------------------------------->
            <!------------------------------------------------------------------------->
            <h2>Realizar Pedido</h2>
            <h3>Artículo</h3><h3>Descripción</h3><h3>Unidades</h3><h3>Precio</h3><h3>Importe</h3><br>
            </table>
            <%
        }
        %>
        <a href="Pedidos.jsp">Nuevo cliente</a> | <a href="index.jsp">Página principal</a>
    </body>
</html>
