import java.util.ArrayList;
import java.util.Arrays;

public class mexican {
    public static String[] wave(String str) {
        ArrayList<String> lista_str = new ArrayList<String>();
        Character caractermay;

        str = str.toLowerCase();
        for (int i=0; i<=str.length()-1; i++) {
            if (Character.isLetter(str.charAt(i)) && str.charAt(i) != ' ') {
                caractermay = Character.toUpperCase(str.charAt(i));
                lista_str.add(str.substring(0, i)+caractermay+str.substring(i+1));
            }
        }


        String[] resultado_array_str = new String[lista_str.size()];
        for (int i=0; i<=lista_str.size()-1; i++) {
            resultado_array_str[i] = lista_str.get(i);
        }

        return resultado_array_str;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wave("Two words")));
    }
}
