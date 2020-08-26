package propiedades;

public class Cochera extends Unidad {
    public String generarContrato() {
        return "contrato de alquiler para cochera";
    }

    public Cochera(String descripcion, Inquilino i, double superficie) {
        this.descripcion = descripcion;
        this.inquilino = i;
        this.superficie = superficie;
    }

    public String toString() {
        try {
            String tipoInquilino = "persona";

            if (this.inquilino.genero == 'S') tipoInquilino = "empresa";

            return "La superficie asignada a la cochera " + this.descripcion + " es de " + this.obtenerSuperficie() +
                    " y ha sido alquilada por la " + tipoInquilino + " cuyo CUIT es " +
                    this.obtenerCuit(this.inquilino.genero, this.inquilino.DNI);
        } catch (Exception err) {
            System.out.print(err);
            return "Ha ocurrido un error";
        }
    }
}