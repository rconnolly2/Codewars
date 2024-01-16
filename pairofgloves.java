import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class pairofgloves {
    public static int numberOfPairs(String[] gloves) {
        int resultado = 0;
        Set<String> sinrepetir  = new HashSet<String>(); // set
        Collections.addAll(sinrepetir,gloves);
        String[] sinrepetir_str = new String[sinrepetir.size()];
        int[] n_parejas = new int[sinrepetir.size()];
        sinrepetir.toArray(sinrepetir_str); // lista de string sin repeticiones

        for (int id_str=0; id_str<=sinrepetir_str.length-1; id_str++) { // Primero itero sobre cada tipo guante ÚNICO
            for (int j=0; j<=gloves.length-1; j++) { // Itero sobre los guantes
                if (gloves[j]==sinrepetir_str[id_str]) { // Si el guante es uno de los tipos los sumo al contador de su tipo
                    n_parejas[id_str] += 1;
                }
            }
        }

        // Sumar resultado
        for (int i : n_parejas ) { // Itero sobre cantidad de guantes según su tipo
            if (i>1) {
                if (i%2==0) { // Si es mayor de uno es un par de guantes si es un numero par lo podemos añadir al resultado
                    resultado += i/2; // Dividiendo entre grupos de 2
                } else {
                    resultado += (i-1)/2; // Si no es par le resto 1 y lo divido en grupos de 2
                }
            }
        }
        return resultado; 
    }


    public static void main(String[] args) {
        System.out.println(numberOfPairs(new String[]{"1", "2", "3" ,"4", "4", "3"}));
    }
}
