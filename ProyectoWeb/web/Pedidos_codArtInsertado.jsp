<%-- 
    Document   : Pedidos_codArtInsertado
    Created on : 30 janv. 2019, 20:05:28
    Author     : Iker
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
    <body onload="document.Articulo.uds.focus()">
        <h1>Gestión de Pedidos</h1>
        <%
        ResultSet rs;
        Conexion cox = new Conexion();
        String t1 = request.getParameter("codigocli");
        String t2 = request.getParameter("codigo");
        if(!cox.ConsultarArt(t2)){
            %><h2> El Artículo con el código <%=t2%> no existe</h2> <%   
        }else{
            rs = cox.obtener(t1, "Clientes", "Cli");
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
            <form name="Articulo" action="Importe.jsp" onsubmit="return Comprobar()">
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
                        <td><input type="text" id="uds" name="uds" onkeyup="Importe()"></td>
                        <td><%=rs.getFloat("Precio_venta")%></td>
                        <td><input type="text" name="importe" readonly></td>
                        
                    </tr>
                </table>
                        
                <input type="submit" value="Aceptar">
                <input type="reset" value="Cancelar" onclick="document.Articulo.uds.focus()">
                
                <input type="hidden" value="<%=t1%>" name="codigocli">
                <input type="hidden" value="<%=t2%>" name="codigo">
                <input name="precio" type ="hidden" value="<%=rs.getFloat("Precio_venta")%>">
                
                
            </form>
             <!------------------------------------------------------------------------->
            <hr><!------------------------------------------------------------------------->
            <!------------------------------------------------------------------------->
                  <%
        }
        %>
        <a href="Pedidos_codInsertado.jsp">Nuevo Artículo</a> | <a href="index.jsp">Página principal</a>
    </body>
    <script>
        function Comprobar(){
               var x = document.getElementById("uds").value;
               if(x === ""||x <= 0 || isNaN(x) || !(x%1===0)){
                   alert("Este campo es exclusívamente numérico, sin decimales y mayor que 0");
                   document.Articulo.uds.value = "";
                   document.Articulo.uds.focus();
                   return false;
               }else{
                   return true;
               }
           }
        function Importe(){
            var y = document.getElementById("uds").value;
            if(isNaN(y)||!(y%1 === 0)){
                alert("Este campo es exclusívamente numérico y sin decimales");
                document.Articulo.uds.value = "";
                   document.Articulo.uds.focus();
            }else{
                document.Articulo.importe.value = y * document.Articulo.precio.value;
            }

            
        }
    </script>
</html>
