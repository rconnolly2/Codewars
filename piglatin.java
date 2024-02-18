public class piglatin {
    public static String pigIt(String str) {
        String[] arr_pal = str.split(" ");
        for (int i=0; i<=arr_pal.length-1; i++) {
            if (!(arr_pal[i].length()<2 && EsSigPunt(arr_pal[i].charAt(0))==true)) {
                // SI NO ES SIGNO DE PUNTUACIÓN DE 1 CHAR

                // Muevo primer char al final
                arr_pal[i] = arr_pal[i].substring(1, arr_pal[i].length())+arr_pal[i].charAt(0);
                // Ahora añado ay
                arr_pal[i]+="ay";
            }
        }

        // Ahora construyo el resultado:
        String res = "";
        for (String pal : arr_pal) {
            res+=pal;
            if (pal!=arr_pal[arr_pal.length-1]) { // si no es la ultima palabra
                res+=" "; // meto espacio
            }
        }

        return res;
    }

    public static boolean EsSigPunt(Character c) {
        if (c=='!' || c==',' || c=='.' || c=='?' || c==':' || c=='/' || c==';' || c=='"' || c=='(' || c=='-') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Hello world !"));
    }
}
