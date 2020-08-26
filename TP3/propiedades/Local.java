package propiedades;

public class Local extends Unidad {
    public String generarContrato(String habilitacion) {
        return "contrato de alquiler para departamento\n\t" + habilitacion;
    }

    public Local(String descripcion, Inquilino inquilino, double superficie) {
        this.descripcion = descripcion;
        this.inquilino = inquilino;
        this.superficie = superficie;
    }

    public String toString() {
        try {
            String tipoInquilino = "persona";
            if (this.inquilino.genero == 'S') tipoInquilino = "empresa";
            return "La superficie asignada al local comercial " + this.descripcion + " es de " + this.obtenerSuperficie() +
                    " y ha sido alquilada por la " + tipoInquilino + " cuyo CUIT es de " +
                    this.obtenerCuit(this.inquilino.genero, this.inquilino.DNI);
        } catch (Exception e) {
            System.out.print(e);
            return "Ha ocurrido un error";
        }
    }
}