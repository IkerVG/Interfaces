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
        <title>Gestión de Extractos</title>
        
        <style>
            td{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <h1>Gestión de Extractos</h1>
        <%
        Conexion cox = new Conexion();
        HttpSession sesion = request.getSession();
        String t1 = sesion.getAttribute("CodSesion").toString();
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
            <h2>Extracto de pedidos</h2>
            <%  
               String minimo = request.getParameter("minimo");
               String minimotrozos[] = minimo.split("-");
               String minimo_bien = minimotrozos[2]+"/"+minimotrozos[1]+"/"+minimotrozos[0]; 
               
               String maximo = request.getParameter("maximo");
               String maximotrozos[] = maximo.split("-");
               String maximo_bien = maximotrozos[2]+"/"+maximotrozos[1]+"/"+maximotrozos[0]; 
               ResultSet rs2 = cox.retirar(minimo, maximo,t1);
               if(rs2.next()){
             %>
             <h3>Del <%=minimo_bien%> al <%=maximo_bien%></h3>
                   <table>
                       <tr>
                           <th>Fecha</th>
                           <th>Artículo</th>
                           <th>Unidades</th>
                       </tr>
                       <%  
                   boolean b = true;
                   while(b){ 
                        String fechaatrozos[] = rs2.getString("Fecha").split("-");
                        String fechaamostrar = fechaatrozos[2]+"/"+fechaatrozos[1]+"/"+fechaatrozos[0];
                       %>
                       
                       
                       <tr>
                           <td><%=fechaamostrar%></td>
                           <td><%=rs2.getString("Articulo")%></td>
                           <td><%=rs2.getString("Unidades")%></td>
                       </tr>
                       <%
                    b = rs2.next();
                   }
                   %>
                   </table>
                        <!------------------------------------------------------------------------->
                        <hr><!------------------------------------------------------------------------->
                        <!------------------------------------------------------------------------->
                        <h2>Extracto finalizado</h2>
                     <p>
            Si desea imprimir el pedido se abrirá una nueva ventana con la factura a imprimir.<br>
            En esta ventana, abra el menú Archivo y ejecute la opción Imprimir.<br>
            En la nueva ventana, seleccione su impresora y pulse Imprimir.<br>
            Después cierre la ventana que contiene la factura a imprimir.<br>
            Para imprimir el pedido pulse <a href="Imprimir_extracto.jsp" target="_blank">aquí</a>. Si no va a imprimir, puede regresar a <a href="index.jsp">página principal</a>
        </p>
                   <%   
                     sesion.setAttribute("minimo", minimo);
                     sesion.setAttribute("maximo", maximo);
               }else{
                   %>
            <h2>No se han hecho pedidos entre las fechas</h2>
            <h2><%=minimo_bien%> y <%=maximo_bien%> </h2>
            <br><button onclick="location.href='Extractos_Cli.jsp'">Nuevas fechas</button><br><br>
             <a href="Extractos.jsp">Nuevo cliente</a> | <a href="index.jsp">Página principal</a>
      
            
            <%
               }
            %>
             <!------------------------------------------------------------------------->
            <hr><!------------------------------------------------------------------------->
            <!------------------------------------------------------------------------->
            
             
    </body>
</html>
