<%-- 
    Document   : Pedidos_codInsertado
    Created on : 29-ene-2019, 10:42:15
    Author     : alumno
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Clases_java.Conexion"%>
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
        HttpSession sesion;
        String t1 = request.getParameter("codigocli");
        if(cox.Consultar(t1,"Clientes","Cli")||t1 == null){
            if(t1 == null){
                sesion = request.getSession();
                t1 = sesion.getAttribute("CodSesion").toString();
            }else{
                sesion = request.getSession(true);
                sesion.setAttribute("CodSesion", t1);
            }
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
            <b>Artículo</b>
            <form name="Articulo" action="Pedidos_codArtInsertado.jsp" onsubmit="return Comprobar()">
                <input type="text" name="codigo" id="codigo">
                <input type="hidden" name="codigocli" value="<%=t1%>" > <br><br>
                <input type="submit" value="Aceptar">
                <input type="reset" value="Cancelar" onclick="document.Articulo.codigo.focus()">
            </form>
             <!------------------------------------------------------------------------->
            <hr><!------------------------------------------------------------------------->
            <!------------------------------------------------------------------------->
        <%  
            
        }else{
            %>
            <h2> El cliente con el código <%=t1%> no existe</h2>
            
                  <%
        }
        %>
        <a href="Pedidos.jsp">Nuevo cliente</a> | <a href="index.jsp">Página principal</a>
    </body>
    <script>
        function Comprobar(){
               var x = document.getElementById("codigo").value;
               if(x === ""){
                   alert("No has introducido texto");
                   document.Articulo.codigo.focus();
                   return false;
               }else{
                   return true;
               }
           }
    </script>
</html>
