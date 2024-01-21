public class scramblies {
    public static boolean scramble(String str1, String str2) {    
        int[] contador1 = new int[26]; // creo array de 26 letras de alfabeto para contar letras
        int[] contador2 = new int[26];
        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    
        // cuanto cuantas veces hay x letra en str1
        for (char ch : str1.toCharArray()) {
            int index = indexOf(alfabeto, ch);
            contador1[index]++;
        }
    
        // cuanto cuantas veces hay x letra en str2
        for (char ch : str2.toCharArray()) {
            int index = indexOf(alfabeto, ch);
            contador2[index]++;
        }
    
        // COMPARO CONTADORES
        for (int i = 0; i < 26; i++) {
            if (contador1[i] < contador2[i]) { // Si contador 1 es menor que contador 2 NO se puede ordenar
                return false;
            }
        }
    
        return true;
    }

    /**
     * Me da el indice según mi array alfabeto
     * @param array
     * @param ch
     * @return indice
     */
    public static int indexOf(char[] array, char ch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch) { // si encuentro el carácter en mi alfabeto devuelvo indice
                return i;
            }
        }
        return -1; // Si no encuentro carácter devuelvo -1 ERROR
    }

    public static void main(String[] args) {
        System.out.println(scramble("scriptingjava","javascript"));
    }
}
