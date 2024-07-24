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
    int idVehiculo = obtenerIdVehiculoPorPlaca(placa); // Obtén el idVehiculo usando la placa

    String sqlInsert = "INSERT INTO infraccion_multas (ID_VEHICULO, ArticuloLiteral, Fecha_Emision, Tipo, Total_Pagar) VALUES (?, ?, ?, ?, ?)";
    try (PreparedStatement pstmt = conectar.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS)) {
        pstmt.setInt(1, idVehiculo); // Usa el idVehiculo en lugar de placa
        pstmt.setString(2, articuloLiteral);
        pstmt.setDate(3, new java.sql.Date(fechaEmisionDate.getTime()));
        pstmt.setString(4, tipo);
        pstmt.setDouble(5, totalPagar);
        pstmt.executeUpdate();

        try (ResultSet rs = pstmt.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getInt(1); // Obtén el ID de la multa generada
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

    public void cambiarEstadoMulta(int idMulta, String nuevoEstado) throws SQLException {
        String sql = "UPDATE infraccion_multas SET estado = ? WHERE id_infraccion = ?";
        try (PreparedStatement ejecutar = conectar.prepareStatement(sql)) {
            ejecutar.setString(1, nuevoEstado);
            ejecutar.setInt(2, idMulta);

            int filasActualizadas = ejecutar.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("El estado de la multa ha sido actualizado correctamente.");
            } else {
                System.out.println("No se encontró la multa con el ID especificado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
