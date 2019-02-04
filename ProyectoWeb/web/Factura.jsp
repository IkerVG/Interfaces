<%-- 
    Document   : Factura
    Created on : 31-ene-2019, 12:20:02
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factura</title>
    </head>
    <body>
        <h2>Pedido finalizado</h2>
        <p>
            Si desea imprimir el pedido se abrirá una nueva ventana con la factura a imprimir.<br>
            En esta ventana, abra el menú Archivo y ejecute la opción Imprimir.<br>
            En la nueva ventana, seleccione su impresora y pulse Imprimir.<br>
            Después cierre la ventana que contiene la factura a imprimir.<br>
            Para imprimir el pedido pulse aquí. Si no va a imprimir, puede regresar a <a href="index.jsp">página principal</a>
        </p>
        <hr>
        Fecha :<br>
        FACTURA N.:<br>
        <hr>
        <div style="text-align: center;">
            <h2>Empresa Proyecto Web de clase, S.A.</h2>
            <h3>N.I.F.: 28938475-J</h3>
            <h4>C/Isla de Sálvora, 451 - 28400 Collado Villalba - Madrid</h4>
        </div>
        <hr>
        <b>Cliente:</b> adsf <b>N.I.F.:</b>df<br>
        <b>D./Dña.</b> Nombre y Apellidos<br>
        Domicilio<br>
        CP Localidad<br>
        <hr>
        <table align="center">
            <tr style="font-weight: bold;">
                <td>Código</td>
                <td>Descripción</td>
                <td>Precio</td>
                <td>Unidades</td>
                <td>Importe</td>
            </tr>
        </table>
        <hr>
        <h2 style="text-align:right;">Total Factura(I.V.A. inc.): </h2>
    </body>
</html>
