import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> lista_divisibles = new ArrayList<>();

      
        for (int num : numbers) {
            if (num%divider == 0) { // si es divisible hago append
                lista_divisibles.add(num);
            }
        }

        int[] resultado = new int[lista_divisibles.size()-1];

        for (int i=0; i<=lista_divisibles.size()-1; i++) {
            resultado[i] = lista_divisibles.get(i);
        }

        return resultado;
    }
}