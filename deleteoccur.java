import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class deleteoccur {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if (maxOccurrences==0) {
            return new int[0];
        }
        
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        HashMap<Integer, Integer> contadores = new HashMap<Integer, Integer>();

        for (int i=0; i<=elements.length-1; i++) {
            if (!(contadores.containsKey(elements[i]))) { // si no esta en el dict
                contadores.put(elements[i], 1); // primera key y valor 1 al contad
                resultado.add(elements[i]); // añado num a result
            } else {
                if (!(contadores.get(elements[i]) >= maxOccurrences)) { // si contador de cada valor no es mayor o igual al máximo
                    contadores.put(elements[i], contadores.get(elements[i])+1);
                    resultado.add(elements[i]); // añado mas
                }
            }
        }
        
        int[] resultado_int = new int[resultado.size()];
        for (int i=0; i<=resultado.size()-1; i++) {
            resultado_int[i] = resultado.get(i);
        }
        return resultado_int;
	}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3)));
    }
}
