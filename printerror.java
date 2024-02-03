public class printerror {
    public static String printerError(String s) {
        
        char[] letras_val = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
        int contador_total = 0;

        for (int i=0; i<=s.length()-1; i++) {
            for (char letra : letras_val) {
                if (s.charAt(i)==letra) {
                    contador_total++;
                    break;
                }
            }
        }

        int resultado = (s.length())-contador_total;

        return resultado+"/"+s.length();
        
      }

      public static void main(String[] args) {
        printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz");
      }
}
