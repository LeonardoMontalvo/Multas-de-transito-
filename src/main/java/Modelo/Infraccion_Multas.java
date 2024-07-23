 package Modelo;

import java.util.Date;

/**
 *
 * @author Leo
 */
public class Infraccion_Multas {
    
    private int id_infraccion;
    private Vehiculo vehiculo;
    private Propietario propietario;
    private String entidad, citacion, articulo_literal, tipo;
    private Date fecha_notificacion, fecha_limite, fecha_emision;
    private double total_pagar;

    public int getId_infraccion() {
        return id_infraccion;
    }

    public void setId_infraccion(int id_infraccion) {
        this.id_infraccion = id_infraccion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getCitacion() {
        return citacion;
    }

    public void setCitacion(String citacion) {
        this.citacion = citacion;
    }

    public String getArticulo_literal() {
        return articulo_literal;
    }

    public void setArticulo_literal(String articulo_literal) {
        this.articulo_literal = articulo_literal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha_notificacion() {
        return fecha_notificacion;
    }

    public void setFecha_notificacion(Date fecha_notificacion) {
        this.fecha_notificacion = fecha_notificacion;
    }

    public Date getFecha_limite() {
        return fecha_limite;
    }

    public void setFecha_limite(Date fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public double getTotal_pagar() {
        return total_pagar;
    }

    public void setTotal_pagar(double total_pagar) {
        this.total_pagar = total_pagar;
    }
}
