package propiedades;

import utilidades.CuitUtils;

public class Departamento extends Unidad {

    public String generarContrato() {
        return "contrato de alquiler para departamento";
    }

    public Departamento(String descripcion, int dni, char genero, double superficie) {
        this.descripcion = descripcion;
        this.inquilino = new Inquilino(dni, genero);
        this.superficie = superficie;
    }

    public String toString() {
        try {
            String tipoInquilino = "persona";

            if (this.inquilino.genero == 'S') tipoInquilino = "empresa";
            return "La superficie asignada al departamento " + this.descripcion + " es de " + this.obtenerSuperficie() +
                    " y ha sido alquilado por la " + tipoInquilino + " cuyo CUIT es " +
                    this.obtenerCuit(this.inquilino.genero, this.inquilino.DNI);
        } catch (Exception e) {
            System.out.print(e);
            return "Ha ocurrido un error";
        }
    }
}