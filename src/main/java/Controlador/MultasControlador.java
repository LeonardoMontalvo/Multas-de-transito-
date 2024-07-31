package Controlador;

import Modelo.Infraccion_Multas;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Leo
 */
public class MultasControlador {
    
    private Infraccion_Multas multas;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;
    
    private int idMulta;


    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }

    public int getIdMulta() {
        return idMulta;
    }

    ////////////////////////////////////////////////////////////////////////////////  INSERTAR MULTAS //////////////////////////////////////////////////////////////////////////////////////////////

public int insertarDatosBasicos(String placa, String articuloLiteral, java.util.Date fechaEmisionDate, String tipo, double totalPagar) throws SQLException {
    int idVehiculo = obtenerIdVehiculoPorPlaca(placa); 

    String sqlInsert = "INSERT INTO infraccion_multas (ID_VEHICULO, ArticuloLiteral, Fecha_Emision, Tipo, Total_Pagar) VALUES (?, ?, ?, ?, ?)";
    try (PreparedStatement pstmt = conectar.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS)) {
        pstmt.setInt(1, idVehiculo); 
        pstmt.setString(2, articuloLiteral);
        pstmt.setDate(3, new java.sql.Date(fechaEmisionDate.getTime()));
        pstmt.setString(4, tipo);
        pstmt.setDouble(5, totalPagar);
        pstmt.executeUpdate();

        try (ResultSet rs = pstmt.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getInt(1); 
            } else {
                throw new SQLException("No se pudo obtener el ID de la multa.");
            }
        }
    }
}


    ////////////////////////////////////////////////////////////////////////////////  OBTENER DATOS MULTAS //////////////////////////////////////////////////////////////////////////////////////////////


public int obtenerIdVehiculoPorPlaca(String placa) throws SQLException {
    String sqlQuery = "SELECT ID_VEHICULO FROM vehiculo WHERE PLACA = ?";
    try (PreparedStatement pstmt = conectar.prepareStatement(sqlQuery)) {
        pstmt.setString(1, placa);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("ID_VEHICULO"); 
            } else {
                throw new SQLException("No se encontró un vehículo con la placa proporcionada.");
            }
        }
    }
}


 public String obtenerNombrePropietarioPorPlaca(String placa) {
        String nombre = "";
        String sql = "SELECT p.NOMBRES FROM propietario p JOIN vehiculo v ON p.CEDULA = v.CEDULA WHERE v.PLACA = ?";
        
        try (PreparedStatement pstmt = conectar.prepareStatement(sql)) {
            pstmt.setString(1, placa);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                nombre = rs.getString("NOMBRES");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return nombre;
    }

    public String obtenerCedulaPropietarioPorPlaca(String placa) {
        String cedula = "";
        String sql = "SELECT p.CEDULA FROM propietario p JOIN vehiculo v ON p.CEDULA = v.CEDULA WHERE v.PLACA = ?";
        
        try (PreparedStatement pstmt = conectar.prepareStatement(sql)) {
            pstmt.setString(1, placa);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                cedula = rs.getString("CEDULA");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return cedula;
    }

    //////////////////////////////////////////////////////////////////////////////// datosMultas ///////////////////////////////////////////////////////////////////////////////////////

 public ArrayList<Object[]> datosMultas() {
    ArrayList<Object[]> listaObject = new ArrayList<>();
    try {
        String sql = "{CALL InfraccionMultas(3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)}";
        CallableStatement ejecutar = conectar.prepareCall(sql);
        ResultSet res = ejecutar.executeQuery();
        int cont = 1;
        while (res.next()) {
            Object[] obMultas = new Object[6];
            obMultas[0] = cont;
            obMultas[1] = res.getObject("PLACA"); 
            obMultas[2] = res.getObject("ArticuloLiteral"); 
            obMultas[3] = res.getObject("Fecha_Emision"); 
            obMultas[4] = res.getObject("Tipo"); 
            obMultas[5] = res.getObject("Total_Pagar"); 
            listaObject.add(obMultas);
            cont++;
        }
        ejecutar.close();
    } catch (SQLException e) {
        System.out.println("ERROR SQL CARGA LISTADO: " + e.getMessage());
        e.printStackTrace(); 
    }
    return listaObject;
}


    /////////////////////////////////////////////////////////////////////////////////////// BUSCAR Multas POR CEDULA O PLACA ///////////////////////////////////////////////////////////////////////////////////////
public ArrayList<Object[]> buscarMultas(String cedulaPlaca) {
    ArrayList<Object[]> listaObject = new ArrayList<>();
    try {
        String sql = "{CALL InfraccionMultas(5, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ?)}";
        CallableStatement stmt = conectar.prepareCall(sql);
        stmt.setString(1, cedulaPlaca);

        ResultSet rs = stmt.executeQuery();
        int cont = 1;
        while (rs.next()) {
            Object[] obMultas = new Object[6];
            obMultas[0] = cont;
            obMultas[1] = rs.getString("PLACA");
            obMultas[2] = rs.getString("ArticuloLiteral");
            obMultas[3] = rs.getDate("Fecha_Emision");
            obMultas[4] = rs.getString("Tipo");
            obMultas[5] = rs.getBigDecimal("Total_Pagar");
            listaObject.add(obMultas);
            cont++;
        }
        stmt.close();
    } catch (SQLException e) {
        System.out.println("ERROR SQL al buscar multas: " + e.getMessage());
        e.printStackTrace();
    }
    return listaObject;
}

    
    public void cambiarTipoMulta(int idMulta, String nuevoTipo) throws SQLException {
    String sql = "UPDATE infraccion_multas SET Tipo = ? WHERE INFRACCION = ?";
        try (PreparedStatement ejecutar = conectar.prepareStatement(sql)) {
        ejecutar.setString(1, nuevoTipo);
        ejecutar.setInt(2, idMulta);
        ejecutar.executeUpdate();
    }
}

    
        /////////////////////////////////////////////////////////////////////////////////////// EDITAR Multas  ///////////////////////////////////////////////////////////////////////////////////////



public boolean eliminarMulta(int idMulta) {
    String sqlDeleteMulta = "DELETE FROM infraccion_multas WHERE INFRACCION = ?";
    try (PreparedStatement pstmtMulta = conectar.prepareStatement(sqlDeleteMulta)) {
        pstmtMulta.setInt(1, idMulta);
        int filasAfectadas = pstmtMulta.executeUpdate();
        return filasAfectadas > 0;
    } catch (SQLException e) {
        System.out.println("Error SQL al eliminar la multa: " + e.getMessage());
        return false;
    }
}



public boolean actualizarDatosMultaPorCriterios(String placa, String articuloLiteral, java.sql.Date fechaEmision, String nuevoArticuloLiteral, java.util.Date nuevaFechaEmisionDate, String nuevoTipo, double nuevoTotalPagar) throws SQLException {
    int idVehiculo = obtenerIdVehiculoPorPlaca(placa); 

    String sqlUpdate = "UPDATE infraccion_multas SET ArticuloLiteral = ?, Fecha_Emision = ?, Tipo = ?, Total_Pagar = ? WHERE ID_VEHICULO = ? AND ArticuloLiteral = ? AND Fecha_Emision = ?";
    try (PreparedStatement pstmt = conectar.prepareStatement(sqlUpdate)) {
        pstmt.setString(1, nuevoArticuloLiteral);
        pstmt.setDate(2, new java.sql.Date(nuevaFechaEmisionDate.getTime()));
        pstmt.setString(3, nuevoTipo);
        pstmt.setDouble(4, nuevoTotalPagar);
        pstmt.setInt(5, idVehiculo);
        pstmt.setString(6, articuloLiteral);
        pstmt.setDate(7, fechaEmision);

        int filasAfectadas = pstmt.executeUpdate();
        return filasAfectadas > 0;
    }
}


}
