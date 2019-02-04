<%-- 
    Document   : Importe
    Created on : 31-ene-2019, 12:19:47
    Author     : alumno
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Clases_java.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión de Pedidos</title>
        
        <style>
            td{
                text-align: center;
            }
        </style>
    </head>
    <body onload="document.Articulo.codigo.focus()">
        <h1>Gestión de Pedidos</h1>
        <%
        Conexion cox = new Conexion();
        String t1 = request.getParameter("codigocli");
        String t2 = request.getParameter("codigo");
        if(!cox.ConsultarArt(t2)){
            %><h2> El Artículo con el código <%=t2%> no existe</h2> <%   
        }else{
            ResultSet rs = cox.obtener(t1, "Clientes", "Cli");
            rs.next();
            %>
            <h2>Datos del cliente</h2>
            <table>
                <tr>
                    <td><b>Código</b></td>  
                    <td><b>N.I.F.</b></td>  
                    <td><b>Nombre</b></td>  
                    <td><b>Apellidos</b></td>
                </tr>
                <tr>
                    <td><%=t1%></td>
                    <td><%=rs.getString("NIF")%></td>
                    <td><%=rs.getString("Nombre")%></td>
                    <td><%=rs.getString("Apellidos")%></td>
                </tr>
                <tr>
                    <td><b>Domicilio</b></td>
                    <td><b>C.P.</b></td>
                    <td><b>Localidad</b></td>
                    <td><b>Total</b></td>
                </tr>
               <tr>
                    <td><%=rs.getString("Domicilio")%></td>
                    <td><%=rs.getString("CP")%></td>
                    <td><%=rs.getString("Localidad")%></td>
                    <td><%=rs.getFloat("Total")%></td>
                </tr>
            </table>
            <br>
            <!------------------------------------------------------------------------->
            <hr><!------------------------------------------------------------------------->
            <!------------------------------------------------------------------------->
            <h2>Realizar Pedido</h2>
            <%
            rs = cox.obtenerArt(t2); 
            rs.next();
            %>
                <table>
                    <tr>
                        <td><b>Articulo</b></td>
                        <td><b>Descripción</b></td>
                        <td><b>Unidades</b></td>
                        <td><b>Precio</b></td>
                        <td><b>Importe</b></td>
                    </tr>
                    <tr>
                        <td><%=t2%></td>
                        <td><%=rs.getString("Descripcion")%></td>
                        <td><%=request.getParameter("uds")%></td>
                        <td><%=rs.getFloat("Precio_venta")%></td>
                        <td><%=request.getParameter("importe")%></td>
                        
                    </tr>
                </table>
            <form action="Factura.jsp">           
                <input type="hidden" value="<%=t1%>" name="codigocli">
                <input type="hidden" value="<%=t2%>" name="codigo">
                <input type="hidden" value="" name="Descripcion">
                <input type="hidden" value="" name="Unidades">
                <input type="hidden" value="" name="">
                
             <!------------------------------------------------------------------------->
            <hr><!------------------------------------------------------------------------->
            <!------------------------------------------------------------------------>
            <input type="submit" value="Aceptar Pedido">
            </form>
                  <%
        }
        %>
        <br>
        <a href="Pedidos_codInsertado.jsp">Nuevo Artículo</a> | <a href="index.jsp">Página principal</a>
    </body>
</html>
