import java.util.Arrays;

public class encrypt_this {
    public static String encryptThis(String text) {
        if (text=="") { // caso base
            return "";
        }

        String[] arr_pal = text.split(" ");
        String res = "";

        for (int i=0; i<=arr_pal.length-1; i++) {
            arr_pal[i] = EncPalab(arr_pal[i]);
        }

        if (arr_pal.length>1) { // hay mas de una palabra
            for (int i=0; i<=arr_pal.length-1; i++) {
                res+=arr_pal[i];
                if (!(i==arr_pal.length-1)) { // si no es el ultimo string pongo espacio desp
                    res+=" ";
                }
            }
        } else { // solo hay uno str
            res = arr_pal[0];
        }

        return res;
    }

    public static String EncPalab(String palabra) {
        StringBuilder str_b = new StringBuilder();
        str_b.append(palabra);
        Character tmp;

        // swap segundo con ultimo
        if (str_b.length()>1) {
            tmp = str_b.charAt(palabra.length()-1);
            str_b.replace(str_b.length()-1, str_b.length(), Character.toString(str_b.charAt(1)));
            str_b.replace(1, 2, Character.toString(tmp));
        }


        // convierto primer carácter a ascii con casting a int
        str_b.replace(0, 1, Integer.toString((int)palabra.charAt(0)));

        return str_b.toString();
    }

    public static void main(String[] args) {
        System.out.println(encryptThis("A wise old owl lived in an oak"));
    }
}
