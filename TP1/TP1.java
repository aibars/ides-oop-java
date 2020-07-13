import java.io.*;

public class TP1 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
            Utils utils = new Utils();
            String inputLine = null;
            while ((inputLine = f.readLine()) != null) {
                int[] numbers = utils.parseLine(inputLine);
                int[] sortedNumbers = utils.sort(numbers);

                for (int i = 0; i < sortedNumbers.length; i++) {
                    System.out.print(sortedNumbers[i] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("¡Error en el ingreso de datos!");
        }
    }
}