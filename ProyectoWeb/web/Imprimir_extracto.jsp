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
        String t1 = sesion.getAttribute("CodSesion").toString();
        ResultSet rs = con.obtener(t1,"Clientes", "Cli");
        rs.next();
    %>
    <body>
        <hr>
        <%  String fecha[] = String.valueOf(new java.sql.Date((new java.util.Date()).getTime())).split("-");
            String fechabien = fecha[2]+"/"+fecha[1]+"/"+fecha[0];
            %>
        Fecha: <%=fechabien%> <br>
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
        <%  
               String minimo = sesion.getAttribute("minimo").toString();
               String minimotrozos[] = minimo.split("-");
               String minimo_bien = minimotrozos[2]+"/"+minimotrozos[1]+"/"+minimotrozos[0]; 
               
               String maximo = sesion.getAttribute("maximo").toString();
               String maximotrozos[] = maximo.split("-");
               String maximo_bien = maximotrozos[2]+"/"+maximotrozos[1]+"/"+maximotrozos[0]; 
               ResultSet rs2 = con.retirar(minimo, maximo,t1);
             %>
    <center><h2>Extractos de pedidos desde <%=minimo_bien%> hasta <%=maximo_bien%></h2></center>
                   <table align="center">
                       <tr>
                           <th>Fecha</th>
                           <th>Artículo</th>
                           <th>Unidades</th>
                       </tr>
                       <%  
                   while(rs2.next()){ 
                         String fechaatrozos[] = rs2.getString("Fecha").split("-");
                        String fechaamostrar = fechaatrozos[2]+"/"+fechaatrozos[1]+"/"+fechaatrozos[0];
                       %>
                       <tr>
                           <td><%=fechaamostrar%></td>
                           <td><%=rs2.getString("Articulo")%></td>
                           <td><%=rs2.getString("Unidades")%></td>
                       </tr>
                       <%
                   }
                   %>
                   </table>
        <hr>
    </body>
</html>
