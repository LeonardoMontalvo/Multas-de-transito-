package Modelo;

/**
 *
 * @author Leo
 */
public class Propietario {
    
    private String cedula, nombres,licencias;
    private double puntos;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getLicencias() {
        return licencias;
    }

    public void setLicencias(String licencias) {
        this.licencias = licencias;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }
    
}
