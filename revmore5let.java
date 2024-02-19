public class revmore5let {
    public String spinWords(String sentence) {
        String[] arr_pal = sentence.split(" ");
        for (int i=0; i<=arr_pal.length-1; i++) {
            if (arr_pal[i].length()>=5) {
                arr_pal[i] = PalReves(arr_pal[i]); // rev
            }
        }

        // construyo resultado
        String res = "";
        for (int i=0; i<=arr_pal.length-1; i++) {
            res+=arr_pal[i];
            if (i!=arr_pal.length-1) { // Si no es el ultimo
                res+=" "; // espacio
            }
        }

        return res;
    }

    public String PalReves(String pal) {
        String res = "";
        for (int i=pal.length()-1; i>=0; i--) {
            res+=pal.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }
}
