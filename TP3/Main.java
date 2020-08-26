import propiedades.*;

public class Main {
    public static void main(String[] args) {

        try {
            Inquilino inq = new Inquilino(35044955, 'M');
            Cochera cochera = new Cochera("Paraguay 2400", inq, 10);

            System.out.println(cochera.toString());
            Inquilino inq2 = new Inquilino(33333333, 'S');
            Departamento depto = new Departamento("Juan Manuel de Rosas 1857 4º C",inq2, 121.5);
            System.out.println(depto.toString());
            Inquilino inq3 = new Inquilino(38386907, 'F');
            Local local = new Local("San Martin 1523 Local 41",inq3 , 20.5);
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