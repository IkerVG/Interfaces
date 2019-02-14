<%-- 
    Document   : Factura
    Created on : 31-ene-2019, 12:20:02
    Author     : alumno
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Clases_java.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factura</title>
    </head>
    <% 
        Conexion con = new Conexion();
        HttpSession sesion = request.getSession();
        String codigocli = sesion.getAttribute("codigocli").toString();
        ResultSet rs = con.obtener(codigocli,"Clientes", "Cli");
        rs.next();
    %>
    <body>
        <hr>
        <%  String fecha[] = String.valueOf(new java.sql.Date((new java.util.Date()).getTime())).split("-");
            String fechabien = fecha[2]+"/"+fecha[1]+"/"+fecha[0];
            %>
        Fecha: <%=fechabien%> <br>
        FACTURA N.: 1<br>
        <hr>
        <div style="text-align: center;">
            <h2>Empresa Proyecto Web de clase, S.A.</h2>
            <h3>N.I.F.: 28938475-J</h3>
            <h4>C/Isla de Sálvora, 451 - 28400 Collado Villalba - Madrid</h4>
        </div>
        <hr>
        <b>Cliente:</b> <%=rs.getString("CodigoCli")%>  <b>N.I.F.:</b> <%=rs.getString("NIF")%><br>
        <b>D./Dña.</b> <%=rs.getString("Nombre")%> <%=rs.getString("Apellidos")%><br>
        <%=rs.getString("Domicilio")%><br>
        <%=rs.getString("CP")%> <%=rs.getString("Localidad")%><br>
        <hr>
        <table align="center">
            <tr style="font-weight: bold;">
                <td>Código</td>
                <td>Descripción</td>
                <td>Precio</td>
                <td>Unidades</td>
                <td>Importe</td>
            </tr>
            <%
              
              ArrayList<String> listacod = (ArrayList<String>)sesion.getAttribute("listacod");
              ArrayList<Integer> uds = (ArrayList<Integer>)sesion.getAttribute("uds");
              ArrayList<Float> importe = (ArrayList<Float>)sesion.getAttribute("importe");
              ResultSet rsa;
              for(int i=0;i<listacod.size();i++){
                  rsa = con.obtenerArt(listacod.get(i));
                  rsa.next();
             %>       
             <tr>
                 <td><%=listacod.get(i)%></td>
                 <td><%=rsa.getString("Descripcion")%></td>
                 <td align="right"><%=rsa.getFloat("Precio_venta")%></td>
                 <td align="right"><%=uds.get(i)%></td>
                 <td align="right"><%=importe.get(i)%></td>
             </tr>
             <% 
             }
              float total = 0;
             for(int i = 0;i<listacod.size();i++){
                total+=importe.get(i);
             }
             
             
                %>
        </table>
        <hr>
        <h2 style="text-align:right;">Total Factura(I.V.A. inc.): <%=total%></h2>
    </body>
</html>
