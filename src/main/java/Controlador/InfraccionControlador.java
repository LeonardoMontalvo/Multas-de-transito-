package Controlador;

import Modelo.Infraccion_Multas;
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
public class InfraccionControlador {
    
    private Infraccion_Multas infraccion;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public Infraccion_Multas getInfraccion() {
        return infraccion;
    }

    public void setInfraccion(Infraccion_Multas infraccion) {
        this.infraccion = infraccion;
    }

    ////////////////////////////////////////////////////////////////////////////////  insertarDetalle DE INFRACCION //////////////////////////////////////////////////////////////////////////////////////////////


    
public int obtenerIdPropietarioPorMulta(int idMulta) throws SQLException {
        String sql = "SELECT p.CEDULA FROM propietario p " +
                     "JOIN vehiculo v ON p.CEDULA = v.CEDULA " +
                     "JOIN infraccion_multas im ON v.id_vehiculo = im.id_vehiculo " +
                     "WHERE im.infraccion = ?";
        try (PreparedStatement pstmt = conectar.prepareStatement(sql)) {
            pstmt.setInt(1, idMulta);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("CEDULA");
                } else {
                    throw new SQLException("No se encontró el propietario para la multa.");
                }
            }
        }
    }



    public void insertarDatosAdicionales(int idMulta, String entidad, String citacion, java.util.Date fechaNotificacion, java.util.Date fechaLimite, int puntosARestar) throws SQLException {
        String sql = "{CALL actualizarDatosAdicionales(?, ?, ?, ?, ?, ?)}";
        try (CallableStatement cstmt = conectar.prepareCall(sql)) {
            cstmt.setInt(1, idMulta);
            cstmt.setString(2, entidad);
            cstmt.setString(3, citacion);
            cstmt.setDate(4, new java.sql.Date(fechaNotificacion.getTime()));
            cstmt.setDate(5, new java.sql.Date(fechaLimite.getTime()));
            cstmt.setInt(6, puntosARestar);
            cstmt.executeUpdate();
        }
    }



    //////////////////////////////////////////////////////////////////////////////// datosInfraccion ///////////////////////////////////////////////////////////////////////////////////////
    
public ArrayList<Object[]> datosInfraccion() {
    ArrayList<Object[]> listaObject = new ArrayList<>();
    try {
        String sql = "{CALL InfraccionMultas(   3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)}";
        CallableStatement ejecutar = conectar.prepareCall(sql);
        ResultSet res = ejecutar.executeQuery();
        while (res.next()) {
            Object[] obInfraccion = new Object[7];
            obInfraccion[0] = res.getObject("INFRACCION");
            obInfraccion[1] = res.getObject("ENTIDAD");
            obInfraccion[2] = res.getObject("CITACION");
            obInfraccion[3] = res.getObject("FECHA_NOTIFICACION");
            obInfraccion[4] = res.getObject("FECHA_LIMITE");
            obInfraccion[5] = res.getObject("PUNTOS_DE_LICENCIA");
            obInfraccion[6] = res.getObject("Total_Pagar");
            listaObject.add(obInfraccion);
        }
        ejecutar.close();
    } catch (SQLException e) {
        System.out.println("ERROR SQL CARGA LISTADO: " + e.getMessage());
        e.printStackTrace();
    }
    return listaObject;
}


    /////////////////////////////////////////////////////////////////////////////////////// BUSCAR PLACA O CEDULA ///////////////////////////////////////////////////////////////////////////////////////

public ArrayList<Object[]> buscarInfracciones(String cedulaPlaca) {
    ArrayList<Object[]> listaObject = new ArrayList<>();
    try {
        String sql = "{CALL InfraccionMultas(6, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ?)}";
        CallableStatement stmt = conectar.prepareCall(sql);
        stmt.setString(1, cedulaPlaca);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Object[] obInfracciones = new Object[7];
            obInfracciones[0] = rs.getInt("INFRACCION");
            obInfracciones[1] = rs.getString("ENTIDAD");
            obInfracciones[2] = rs.getString("CITACION");
            obInfracciones[3] = rs.getDate("FECHA_NOTIFICACION");
            obInfracciones[4] = rs.getDate("FECHA_LIMITE");
            obInfracciones[5] = rs.getBigDecimal("PUNTOS_DE_LICENCIA");
            obInfracciones[6] = rs.getBigDecimal("Total_Pagar");
            listaObject.add(obInfracciones);
        }
        stmt.close();
    } catch (SQLException e) {
        System.out.println("ERROR SQL al buscar infracciones: " + e.getMessage());
        e.printStackTrace();
    }
    return listaObject;
}

    /////////////////////////////////////////////////////////////////////////////////////// EDITAR  ///////////////////////////////////////////////////////////////////////////////////////


public boolean editarDatosAdicionales(int idMulta, String entidad, String citacion, java.sql.Date fechaNotificacion, java.sql.Date fechaLimite, int puntosARestar) throws SQLException {
    String sql = "{CALL actualizarDatosAdicionales(?, ?, ?, ?, ?, ?)}";
    try (CallableStatement cstmt = conectar.prepareCall(sql)) {
        cstmt.setInt(1, idMulta);
        cstmt.setString(2, entidad);
        cstmt.setString(3, citacion);
        cstmt.setDate(4, fechaNotificacion);
        cstmt.setDate(5, fechaLimite);
        cstmt.setInt(6, puntosARestar);
        cstmt.executeUpdate();
        return true;
    } catch (SQLException e) {
        System.out.println("Error al editar los datos adicionales: " + e.getMessage());
        e.printStackTrace();
        return false;
    }
}

}
