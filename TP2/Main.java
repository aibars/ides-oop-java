import propiedades.*;

public class Main {
    public static void main(String[] args) {

        try {
            Cochera cochera = new Cochera("Paraguay 2400", 35044955, 'M', 10);

            System.out.println(cochera.toString());
            Departamento depto = new Departamento("Juan Manuel de Rosas 1857 4º C", 33333333, 'S', 121.5);
            System.out.println(depto.toString());
            Local local = new Local("San Martin 1523 Local 41", 38386907, 'F', 20.5);
            System.out.println(local.toString());

            System.out.println("\nContratos alquiler:\n");
            System.out.println(depto.generarContrato());
            System.out.println(cochera.generarContrato());
            System.out.println(local.generarContrato("habilitación nroº 123"));

        } catch (Exception err) {
            System.out.print(err);
        }
    }
}