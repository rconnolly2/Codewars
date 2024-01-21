import java.util.Arrays;
import java.util.Collections;

public class weightsort {
    public static void orderWeight(String strng) {
                                                                // \\s+ es una expresión regular que detecta uno o mas espacios
        String[] lista_pesos = strng.trim().split("\\s+"); // con trim quito espacios al principio y final y luego con split separo string en una lista de strings
        Arrays.sort(lista_pesos); // lo ordeno por alfabeto primero
        int[] lista_pesos_sum = new int[lista_pesos.length];
        String[] resultado_final = new String[lista_pesos.length];

        if (strng == null || strng.isEmpty()) {
            ;
            //return strng; // Si el string es nulo o esta vació devuelvo el string
        }

        // itero sobre array de strings para ver si hay empates
        for (int i=0; i<=lista_pesos.length-1; i++) {
            lista_pesos_sum[i] = CalcularPeso(lista_pesos[i]);
        }

        System.out.println(Arrays.toString(lista_pesos));
        System.out.println(Arrays.toString(lista_pesos_sum));


	}

    /**
     * Esta función coge un str numero y devuelve el total de cada dígito
     * @param numero
     * @return (int) total
     */
    public static int CalcularPeso(String numero) {
        int total = 0;
        for (char digito : numero.toCharArray()) {
            total += Character.getNumericValue(digito);
        }

        return total;
    }

    public static int[] append(int[] lista, int n) {
        int[] nueva_array = new int[lista.length+1];

        // copio array vieja a la nueva
        System.arraycopy(lista, 0, nueva_array, 0, lista.length);
        nueva_array[nueva_array.length-1] = n; // añado elemento del append
        return nueva_array;
    }

    public static void main(String[] args) {
        orderWeight("56 65 74 100 99 68 86 180 90");
    }
}
