<%-- 
    Document   : Pedidos
    Created on : 29-ene-2019, 8:54:52
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión de Pedidos</title>
    </head>
    <body onload="document.formulario.codigo.focus()">
        <h1>Gestión de Pedidos</h1>
        <form action="Pedidos_codInsertado.jsp" name="formulario" onsubmit="return Comprobar()">
            Código de Cliente <input type="text" name="codigocli" id="codigo"><br><br>
            <input type="submit" value="Aceptar">
            <input type="reset" value="Cancelar" onclick="codigo.focus()">
        </form>
        <br>
        <a href="index.jsp" >Página principal</a>
    </body>
    <script>
        function Comprobar(){
            var x = document.getElementById("codigo").value;
            if(x === ""){
                alert("No has introducido texto");
                document.formulario.codigo.focus();
                return false;
            }else{
                return true;
            }
        }
    </script>
</html>
