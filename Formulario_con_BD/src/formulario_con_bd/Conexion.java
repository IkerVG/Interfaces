/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario_con_bd;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
//import net.sf.jasperreports.engine.*;
//import net.sf.jasperreports.engine.util.JRLoader;
//import net.sf.jasperreports.view.*;
/**
 *
 * @author alumno
 */
public class Conexion {
   static Connection con;
   Statement stmt;
    public Conexion() {
        try {
          Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch (Exception e) {
          /*System.out.println("Error en Driver ODBC");
          System.out.println(e.getMessage());*/
        }
        try {
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Almacen","root","manager");
          con.setAutoCommit(false);
          stmt = con.createStatement();
        }catch (SQLException e) {
            /*System.out.println("Error en la conexión");
            System.out.println(e.getMessage());*/
        }
    }
    public boolean Consultar (String codigo,String tabla,String cod) throws SQLException{
        ResultSet rs = null;
        String sql = "SELECT * FROM "+tabla+" WHERE Codigo"+cod+" = '"+codigo+"'";
        rs = stmt.executeQuery(sql);
        boolean b = rs.next();
        if(b== true){
           return  true;
        }else{
            return false;
        }
    }
    public void Alta(String codigo,String nif,String nombre,String apellidos,String domicilio, String CP, String localidad, String tel, String mov, String fax, String email) throws SQLException{
            String sql = "INSERT INTO Clientes (CodigoCli,NIF,Nombre,Apellidos,Domicilio,CP,Localidad,Telefono,Movil,Fax,Email) "
                    + "VALUES ('"+codigo+"','"+nif+"','"+nombre+"','"+apellidos+"','"+domicilio+"',"
                    + "'"+CP+"','"+localidad+"','"+tel+"','"+mov+"','"+fax+"','"+email+"')";
           stmt.executeUpdate(sql);
           con.commit();
    }
    public void Baja(String codigo) throws SQLException{
       String sql = "DELETE FROM Clientes WHERE CodigoCli = '"+codigo+"'";
       stmt.executeUpdate(sql);
       con.commit();
    }
    public void Modificar(String codigo,String nif,String nombre,String apellidos,String domicilio, String CP, String localidad, String tel, String mov, String fax, String email) throws SQLException{
        String sql = "UPDATE Clientes SET "
                + "NIF = '"+nif+"'"
                + ", Nombre = '"+nombre+"'"
                + ", Apellidos = '"+apellidos+"'"
                + ", Domicilio = '"+domicilio+"'"
                + ", CP = '"+CP+"'"
                + ", Localidad = '"+localidad+"'"
                + ", Telefono = '"+tel+"'"
                + ", Movil = '"+mov+"'"
                + ", Fax = '"+fax+"'"
                + ", Email = '"+email+"' "
                + "WHERE CodigoCli = '"+codigo+"'";
        stmt.executeUpdate(sql);
        con.commit();
    }
    
    public ResultSet obtener(String codigo,String tabla,String cod) throws SQLException {
        ResultSet rs = stmt.executeQuery("SELECT * FROM "+tabla+" WHERE Codigo"+cod+" = '" + codigo + "'");
        return rs;
    }
     /*
    **************************************************************************
     ~~~~~~~~~~~~~~~LO MISMO PARA ARTICULOS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    **************************************************************************
    */
    public boolean ConsultarArt (String codigo) throws SQLException{
        ResultSet rs = null;
        String sql = "SELECT * FROM Articulos WHERE CodigoArt = '"+codigo+"'";
        rs = stmt.executeQuery(sql);
        boolean b = rs.next();
        if(b== true){
           return  true;
        }else{
            return false;
        }
    }
       public ResultSet obtenerArt(String codigo) throws SQLException {
        ResultSet rs = stmt.executeQuery("SELECT * FROM Articulos WHERE CodigoArt = '" + codigo + "'");
        return rs;
    }
       public ArrayList<String> listarart(String l) throws SQLException{
           ArrayList <String> ListArt = new ArrayList<>();
           ResultSet s = stmt.executeQuery("SELECT * FROM Articulos");
           while(s.next()){
               ListArt.add(s.getString("CodigoArt"));
               ListArt.add(s.getString("Descripcion"));
               ListArt.add(Float.toString(s.getFloat("Stock")));
               if(l.equals("Gestión de Almacén Pedidos proveedor")){
                    ListArt.add(Float.toString(s.getFloat("Precio_compra")));
               }else{
                   ListArt.add(Float.toString(s.getFloat("Precio_venta")));
               }
              
              
           }
           return ListArt;
       }
       public void modificarArt(String cod, float stock_actual) throws SQLException{
           stmt.executeUpdate("UPDATE Articulos SET Stock = "+stock_actual+" WHERE CodigoArt = '"+cod+"'" );
           
       }
       public void comit(boolean commit) throws SQLException{
           if(commit){
               con.commit();
           }else{
               con.rollback();
           }
           
       }
       
    /*
    **************************************************************************
    --------------------------------------------------------------------------
     ~~~~~~~~~~~~~~~DE AQUÍ EN ADELANTE ESTÁN LOS JASPER~~~~~~~~~~~~~~~~~~~~~~
    --------------------------------------------------------------------------
    **************************************************************************
    */
//    public static JasperViewer ejecutarInforme() {
//        /* Se crea el objeto JasperViewer que devolverá el método.
//         * Este objeto contendrá la ventana de la vista previa del informe. */
//        JasperViewer vistaInforme = null;
//        try {
//            /* Creamos una cadena que contendrá la ruta completa donde está
//             * almacenado el archivo report1.jasper. */
//            File archivoJasper=null;
//       
//                archivoJasper = new File(System.getProperty("user.dir") + ("/dist/Lista_de_clientes.jasper"));
//            
//            if (archivoJasper == null) {
//                System.out.println("El archivo no está en /dist.");
//            }
//            // Se crea un objeto para cargar el informe.
//            JasperReport informeCargado = null;
//            try {
//                informeCargado = (JasperReport) JRLoader.loadObject(archivoJasper);
//            } catch (Exception e) {
//                System.out.println("Error al cargar el informe: " + e.getMessage());
//            }
//            /* El parámetro del informe toma valor del parámetro que recibe este
//             * método, que es el contenido de la caja de texto en la que se introduce
//             * el total. */
//            //Map parametro = new HashMap();
//            /* Se crea un objeto de tipo JasperPrint que contendrá el informe
//             * cargado previamente con el filtrado del parámetro definido y con
//             * la conexión a la base de datos. */
//            JasperPrint informe = JasperFillManager.fillReport(informeCargado, null, con);
//            /* Se asigna valor al objeto JasperViewer que devuelve este método con
//             * el informe almacenado previamente en el objeto JasperPrint. El valor
//             * false del constructor indica que, al cerrar la vista previa, la
//             * aplicación desde la que se ha llamado a esta vista previa continuará
//             * ejecutándose. */
//            vistaInforme = new JasperViewer(informe, false);
//            vistaInforme.setTitle("Ejemplo de iReport");
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        return vistaInforme;
//    }
//    public  static JasperViewer ejecutarInformeGrafico() {
//        JasperViewer vistaInforme = null;
//        try {
//            String archivoJasper=null;
//       
//                archivoJasper = System.getProperty("user.dir") + ("/dist/grafico.jasper");
//                //System.out.println(archivoJasper);
//            
//            if (archivoJasper == null) {
//                System.out.println("El archivo no está en /dist.");
//            }
//            JasperReport informeCargado = null;
//            try {
//                informeCargado = (JasperReport) JRLoader.loadObjectFromFile(archivoJasper);
//            } catch (Exception e) {
//                System.out.println("Error al cargar el informe: " + e.getMessage());
//            }
//            JasperPrint informe = JasperFillManager.fillReport(informeCargado, null, con);
//            vistaInforme = new JasperViewer(informe, false);
//            vistaInforme.setTitle("Ejemplo de iReport");
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        return vistaInforme;
//    }
//     public  static JasperViewer ejecutarInformeEC(String uno,String dos) {
//            JasperViewer vistaInforme = null;
//        try {
//            File archivoJasper = new File(System.getProperty("user.dir") + ("/dist/report4.jasper"));
//            if (archivoJasper == null) {
//                System.out.println("El archivo report1.jasper no está en /dist.");
//            }
//            // Se crea un objeto para cargar el informe.
//            JasperReport informeCargado = null;
//            try {
//                informeCargado = (JasperReport) JRLoader.loadObject(archivoJasper);
//            } catch (Exception e) {
//                System.out.println("Error al cargar el informe: " + e.getMessage());
//            }
//            Map parametro = new HashMap();
//            parametro.put("codigoMenor", uno);
//            parametro.put("codigoMayor", dos);
//            JasperPrint informe = JasperFillManager.fillReport(informeCargado, parametro, con);
//            vistaInforme = new JasperViewer(informe, false);
//            vistaInforme.setTitle("Listado de los codigos entre parametros");
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        return vistaInforme;
//    }

    public void modificarTot(String text, float num,String s,String s1) throws SQLException {
        stmt.executeUpdate("UPDATE "+s+" SET Total = "+num+" WHERE "+s1+" = '"+text+"'");
        
    }
    public void pedidos(String codCli, String codProv,String codArt, float Unidades) throws SQLException{
        stmt.executeUpdate
        ("insert into Historica(CodigoCli,CodigoProv,CodigoArt,Unidades) "
                + "values ('"+codCli+"','"+codProv+"','"+codArt+"',"+Unidades+")");
    }
    public void InsertarPedidoWeb(String Cliente,String Articulo, String Unidades, String fecha) throws SQLException{
        stmt.executeUpdate("INSERT INTO Pedidos (Cliente, Articulo, Unidades, Fecha) "
                + "VALUES ('"+Cliente+"','"+Articulo+"',"+Float.parseFloat(Unidades)+",'"+fecha+"')");
    }
}


