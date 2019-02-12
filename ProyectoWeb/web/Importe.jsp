<%-- 
    Document   : Importe
    Created on : 31-ene-2019, 12:19:47
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
            
                <table>
                    <tr>
                        <td><b>Articulo</b></td>
                        <td><b>Descripción</b></td>
                        <td><b>Unidades</b></td>
                        <td><b>Precio</b></td>
                        <td><b>Importe</b></td>
                    </tr>
                    <%
                      HttpSession sesion = request.getSession();
                       ArrayList<String>listacod = new ArrayList();
                       ArrayList<Integer>uds = new ArrayList();
                       ArrayList<Float>importe = new ArrayList();
                       int num = 0;
                       try{
                           num = Integer.parseInt(sesion.getAttribute("num").toString());
                       }catch(Exception e){}
                       
                      if(num>0){
                        
                        listacod = ((ArrayList<String>)session.getAttribute("Codigos"));
                        uds =(ArrayList<Integer>)session.getAttribute("uds");
                        importe =((ArrayList<Float>)sesion.getAttribute("importe"));
                        for(int i=0;i<num;i++){
                          rs = cox.obtenerArt(listacod.get(i)); 
                          rs.next();   

                      %>
                    <tr>
                        <td><%=listacod.get(i)%></td>
                        <td><%=rs.getString("Descripcion")%></td>
                        <td><%=uds.get(i)%></td>
                        <td><%=rs.getFloat("Precio_venta")%></td>
                        <td><%=importe.get(i)%></td>  
                    </tr>
                    <%
                        }
                      }
                        rs = cox.obtenerArt(request.getParameter("codigo"));
                        rs.next();
                        %>
                    <tr>
                        <td><%=request.getParameter("codigo")%></td>
                        <td><%=rs.getString("Descripcion")%></td>
                        <td><%=request.getParameter("uds")%></td>
                        <td><%=rs.getFloat("Precio_venta")%></td>
                        <td><%=request.getParameter("importe")%></td>
                    </tr>
                        <%
                        num++;
                        sesion.setAttribute("num",num );
                        listacod.add(request.getParameter("codigo"));
                        sesion.setAttribute("Codigos",listacod);
                        uds.add(Integer.parseInt(request.getParameter("uds")));
                        sesion.setAttribute("uds",uds);
                        importe.add(Float.parseFloat(request.getParameter("importe")));
                        sesion.setAttribute("importe",importe);
                    %>
                </table>
                <%
                    float importetotal=0;
                    for(int i = 0; i<importe.size(); i++){
                        importetotal+=importe.get(i);
                    }
                    %>
            <h2>Importe del pedido: <%=importetotal%></h2>
            <form action="Factura.jsp">           
                <input type="hidden" value="<%=t1%>" name="codigocli">
                <%
                    sesion.setAttribute("listacod", listacod);
                    sesion.setAttribute("uds", uds);
                    sesion.setAttribute("importe", importe);
                %>               
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
