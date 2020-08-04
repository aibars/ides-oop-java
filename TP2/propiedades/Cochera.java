package propiedades;

public class Cochera extends Unidad {
    public String generarContrato() {
        return "contrato de alquiler para cochera";
    }

    public Cochera(String descripcion, int dni, char g) {
        this.descripcion = descripcion;
        this.inquilino = new Inquilino(dni, g);
    }

    public String toString() {
        return "La superficie asignada a la cochera " + this.descripcion + " es de " + this.obtenerSuperficie() +
                " y ha sido alquilada por la persona " + this.obtenerCuit(this.inquilino.genero, this.inquilino.DNI);
    }
}