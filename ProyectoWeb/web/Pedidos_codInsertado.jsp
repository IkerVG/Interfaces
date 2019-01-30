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
        <style>
            td{
                text-align: center;
            }
        </style>
    </head>
    <body onload="document.Articulo.codigo.focus()">
        <h1>Gestión de Pedidos</h1>
        <%
        HttpSession s = request.getSession();
        if(1==2){
            %><h2> El cliente con el código x no existe</h2> <%   
        }else{
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
                    <td>a</td>
                    <td>a</td>
                    <td>a</td>
                    <td>a</td>
                </tr>
                <tr>
                    <td><b>Domicilio</b></td>
                    <td><b>C.P.</b></td>
                    <td><b>Localidad</b></td>
                    <td><b>Total</b></td>
                </tr>
               <tr>
                    <td>a</td>
                    <td>a</td>
                    <td>a</td>
                    <td>a</td>
                </tr>
            </table>
            <br>
            <!------------------------------------------------------------------------->
            <hr><!------------------------------------------------------------------------->
            <!------------------------------------------------------------------------->
            <h2>Realizar Pedido</h2>
            <b>Artículo</b>
            <form name="Articulo" action="Pedidos_codArtInsertado.jsp" onsubmit="return Comprobar()">
                <input type="text" name="codigo" id="codigo"><br><br>
                <input type="submit" value="Aceptar">
                <input type="reset" value="Cancelar" onclick="document.Articulo.codigo.focus()">
            </form>
             <!------------------------------------------------------------------------->
            <hr><!------------------------------------------------------------------------->
            <!------------------------------------------------------------------------->
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
