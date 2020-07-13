import java.util.ArrayList;

public class Utils {
    // Obtiene el arreglo de números enteros dada una línea
    public int[] parseLine(String lineArray) {
        try {
            // Separamos los enteros por whitespace utilizando una expresión regular
            // para identificar multiples ocurrencias del mismo.
            String[] split = lineArray.split("\\s+");
            int[] arr = new int[split.length];

            for (int i = 0; i < split.length; i++) {
                arr[i] = Integer.parseInt(split[i]);
            }
            return arr;
        } catch (Exception e) {
            throw e;
        }
    }

    //Ordena un arreglo de enteros utilizando el algoritmos de burbuja
    public int[] sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        return arr;
    }
}