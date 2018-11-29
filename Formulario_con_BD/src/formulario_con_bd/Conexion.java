/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario_con_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Conexion {
   Connection con;
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
    public boolean Consultar (String codigo) throws SQLException{
        ResultSet rs = null;
        String sql = "SELECT * FROM Clientes WHERE CodigoCli = '"+codigo+"'";
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
    public ResultSet obtener (String codigo) throws SQLException{
        ResultSet rs = stmt.executeQuery("SELECT * FROM Clientes WHERE CodigoCli = '"+codigo+"'");
        return rs;
    }
}
