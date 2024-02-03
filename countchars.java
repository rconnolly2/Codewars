import java.util.HashMap;
import java.util.Map;

/**
 * countchars
 */
public class countchars {

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> diccionario_letras_contad = new HashMap<Character, Integer>();

        for (char letra : str.toCharArray()) {
            if (!(diccionario_letras_contad.containsKey(letra))) {
                diccionario_letras_contad.put(letra, 1);
            } else {
                // añado 1 al contador de la letra
                diccionario_letras_contad.put(letra, diccionario_letras_contad.get(letra)+1);
            }
        }

        return diccionario_letras_contad;
    }

    public static void main(String[] args) {
        System.out.println(count("aabbbac"));
    }
    
}