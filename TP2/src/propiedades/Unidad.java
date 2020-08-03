package propiedades;

import utilidades.CuitUtils;
import utilidades.PdfUtils;

import java.text.DecimalFormat;

public abstract class Unidad {

    public double superficie;
    public String descripcion;
    public Inquilino inquilino;

    // Una posible mejora a la solución aquí podría ser utilizar
    // el patrón Dependency Injection para evitar el acoplamiento entre clases
    public CuitUtils cuitUtils = new CuitUtils();
    public PdfUtils pdfUtils = new PdfUtils();

    public final String obtenerSuperficie() {
        return new DecimalFormat("#.0#").format(this.superficie) + " m²";
    }

    public String generarContrato() {
        return "";
    }

    public String toString() {
        return "";
    }

    public String obtenerCuit(char genero, int dni) {
        try {
            return this.cuitUtils.obtenerCuit(genero, dni);
        } catch (Exception e) {
            System.out.print("Ha ocurrido un error al generar el CUIT\n" + e);
            return Integer.toString(dni);
        }
    }
}