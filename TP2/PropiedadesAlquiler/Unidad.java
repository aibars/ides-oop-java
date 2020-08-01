package Propiedades;

public class Unidad {

    public double Superficie;

    public final String obtenerSuperficie() {
        return new DecimalFormat("#.0#").format(this.Superficie) + " m²";
    }

    public String generarContrato() {
        return "";
    }
}