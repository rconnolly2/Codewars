import java.util.HashMap;

/**
 * countdup
 */
public class countdup {
    public static int duplicateCount(String text) {
        HashMap<Character, Integer> diccionario_valor = new HashMap<Character, Integer>();
        char[] arr_letras = text.toCharArray();
        int contador = 0;

        for (int i=0; i<=arr_letras.length-1; i++) {
            if (!(diccionario_valor.containsKey(Character.toLowerCase(arr_letras[i])))) {
                // meto nueva key con contador => 1
                diccionario_valor.put(Character.toLowerCase(arr_letras[i]), 1);
            } else {
                // añado uno al contador
                diccionario_valor.put(Character.toLowerCase(arr_letras[i]), diccionario_valor.get(Character.toLowerCase(arr_letras[i]))+1);
            }
        }

        for (Character key : diccionario_valor.keySet()) {
            if (diccionario_valor.get(key)>=2) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzaaAb"));
    }
    
}