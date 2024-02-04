import java.util.ArrayList;
import java.util.Arrays;

public class splitstr {
    public static String[] solution(String s) {
        char[] lista_chars = s.toCharArray();
        ArrayList<String> arraylist = new ArrayList<String>();

        int contador = 0;
        String str = "";
        for (int i=0; i<=lista_chars.length-1; i++) {
            contador++;
            str += lista_chars[i];
            if (contador==2 || i==lista_chars.length-1) { // lo meto a la lista
                if (str.length()==1 && i==lista_chars.length-1) {
                    str+="_";
                }
                arraylist.add(str);
                str="";
                contador=0; // reset contad
            }
        }

        String[] resultado = new String[arraylist.size()];
        for (int i=0; i<=resultado.length-1; i++) {
            resultado[i] = arraylist.get(i);
        }

        return resultado;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("LovePizza")));
    }
}
