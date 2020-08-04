package utilidades;

public class CuitUtils {
    /*
     * Fuente: https://carlosprivitera.blogspot.com/2017/08/prueba.html
     * */
    public String obtenerCuit(char genero, int dni) throws Exception {
        int tipo;
        if (genero == 'M') {
            tipo = 20;
        } else {
            if (genero == 'F') {
                tipo = 27;
            } else {
                tipo = 30;
            }
        }
        String aux = String.valueOf(tipo) + String.valueOf(dni);
        String[] cuitArray = aux.split("");
        int codigo = 0;
        if (aux.length() != 10) {
            throw new Exception("Sexo o DNI no válido. La longitud no corresponde");
        }
        Integer[] serie = {5, 4, 3, 2, 7, 6, 5, 4, 3, 2};
        for (int i = 0; i < 10; i++) {
            codigo += Integer.valueOf(cuitArray[i]) * serie[i];
        }
        codigo = 11 - (codigo % 11);
        //Si el resultado anterior es 11 el código es 0
        if (codigo == 11) {
            codigo = 0;
            //o si el resultado anterior es 10 el código es 9
        } else if (codigo == 10) {
            codigo = 9;
        }
        return tipo + "-" + dni + "-" + codigo;
    }
}
