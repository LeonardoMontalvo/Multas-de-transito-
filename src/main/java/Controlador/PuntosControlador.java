
package Controlador;



import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Leo
 */
public class PuntosControlador {
    
    private PuntosControlador puntos;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public PuntosControlador getpuntos() {
        return puntos;
    }

    public void setMultas(PuntosControlador puntos) {
        this.puntos = puntos;
    }
    
    
    

    
    
    
/////////////////////////////////////////////////////////////////////////////////////// datosMultas ///////////////////////////////////////////////////////////////////////////////////////
    
public ArrayList<Object[]> datosPropietario() {
    ArrayList<Object[]> listaObject = new ArrayList<>();
    try {
        String sql = "CALL Propietario(4, NULL, NULL, NULL, NULL)";
        ejecutar = conectar.prepareStatement(sql);
        res = ejecutar.executeQuery();
        while (res.next()) {
            Object[] obPropietario = new Object[4]; 
            obPropietario[0] = res.getString("CEDULA");
            obPropietario[1] = res.getString("NOMBRES");
            obPropietario[2] = res.getBigDecimal("PUNTOS_DE_LICENCIA");
            obPropietario[3] = res.getString("LICENCIAS");
            listaObject.add(obPropietario);
        }
        ejecutar.close();
    } catch (SQLException e) {
        System.out.println("ERROR SQL CARGA LISTADO PROPIETARIO: " + e.getMessage());
        e.printStackTrace();
    }
    return listaObject;
}



        /////////////////////////////////////////////////////////////////////////////////////// BUSCAR Multas POR CEDULA O PLACA ///////////////////////////////////////////////////////////////////////////////////////

public ArrayList<Object[]> buscarPuntosLicencia(String cedula) {
    ArrayList<Object[]> listaObject = new ArrayList<>();
    try {
        String sql = "{CALL Propietario(4, ?, NULL, NULL, NULL)}";
        CallableStatement stmt = conectar.prepareCall(sql);
        stmt.setString(1, cedula); 

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Object[] obPropietario = new Object[4];
            
            obPropietario[0] = rs.getString("nombres");
            obPropietario[1] = rs.getBigDecimal("puntos_de_licencia");
            obPropietario[2] = rs.getString("licencias");
            obPropietario[3] = rs.getString("licencias");

            listaObject.add(obPropietario);
        }
        stmt.close();
    } catch (SQLException e) {
        System.out.println("ERROR SQL al buscar puntos de licencia: " + e.getMessage());
        e.printStackTrace();
         }
    return listaObject;
    }

}