package propiedades;

public class Local extends Unidad {
    public String generarContrato(String habilitacion) {
        return "contrato de alquiler para departamento\n" + habilitacion;
    }

    public Local(String descripcion, int dni, char g) {
        this.descripcion = descripcion;
        this.inquilino = new Inquilino(dni, g);
    }

    public String toString() {
        return "La superficie asignada al local comercial " + this.descripcion + " es de " + this.obtenerSuperficie() +
                " y ha sido alquilada por " + this.obtenerCuit(this.inquilino.genero, this.inquilino.DNI);
    }
}