import java.util.HashMap;

/**
 * countdup
 */
public class countdup {
    public static int duplicateCount(String text) {
        HashMap<Character, Integer> diccionario_valor = new HashMap<Character, Integer>();
        char[] arr_letras = text.toCharArray();

        for (int i=0; i<=arr_letras.length-1; i++) {
            if (!(diccionario_valor.containsKey(arr_letras[i]))) {
                // meto nueva key con contador => 1
                diccionario_valor.put(arr_letras[i], 1);
            } else {
                // añado uno al contador
                diccionario_valor.put(arr_letras[i], diccionario_valor.get(arr_letras[i])+1);
            }
        }

        for (Character)
    }
    
}