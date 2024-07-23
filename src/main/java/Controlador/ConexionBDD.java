package Controlador;


import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Leo
 */

public class ConexionBDD {
    java.sql.Connection conexion;
     public java.sql.Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/multas","root","Leonardox_x2004");
            System.out.println("CONECTADO A LA BASE DE DATOS"); 
        } catch (ClassNotFoundException | SQLException e)
        {
             System.out.println("ERROR DE CONEXION A LA BASE DE DATOS");
        }
        return conexion;
    }
    
}
