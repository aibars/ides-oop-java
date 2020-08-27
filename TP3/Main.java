import data.InquilinoRepository;
import data.UnidadRepository;
import propiedades.*;

public class Main {
    public static void main(String[] args) {

        try {
            Inquilino inq = new Inquilino(35044955, 'M');



            Inquilino inq2 = new Inquilino(33333333, 'S');
            Inquilino inq3 = new Inquilino(38386907, 'F');

            var iRepository = new InquilinoRepository();

            Departamento depto = new Departamento("Juan Manuel de Rosas 1857 4º C",inq2, 121.5);
            Local local = new Local("San Martin 1523 Local 41",inq3 , 20.5);
            Cochera cochera = new Cochera("Paraguay 2400", inq, 10);

            var uRepository = new UnidadRepository();

            iRepository.addInquilino(inq);

        } catch (Exception err) {
            System.out.print(err);
        }
    }
}