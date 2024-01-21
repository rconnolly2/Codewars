import java.util.*; 
public class highestscoringword {

    public static String high(String s) {
        String[] lista_palabras = s.split(" "); // Si tienen un espacio, las separo
        int maxima_puntuacion = 0;
        String palabra_max_punt = "";

        for (String palabra : lista_palabras) { // itero sobre cada palabra de la lista de palabras
            int puntuacion = CalcularPuntuacion(palabra); // calculo la puntuación de la palabra según mi lista de chars
            if (puntuacion > maxima_puntuacion || (puntuacion == maxima_puntuacion && s.indexOf(palabra) < s.indexOf(palabra_max_punt))) {
                // Si la puntuacion es mayor a la puntuacion antigua o si hay un empate solo guardare la maxima puntuacion si salio antes en el str original
                maxima_puntuacion = puntuacion;
                palabra_max_punt = palabra;
            }
        }

        return palabra_max_punt;
    }

    public static int CalcularPuntuacion(String palabra) {
        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int puntuacion = 0;
        for (char c : palabra.toCharArray()) {
            puntuacion += indexOf(alfabeto, c) + 1; // la puntuacion seria literalmente el indice + 1
        }
        return puntuacion;
    }

    public static int indexOf(char[] array, char objetivo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == objetivo) {
                return i;
            }
        }
        return -1; // si el char no se encuentra - no va a pasar
    }

    public static void main(String[] args) {
        String inputString = "aaa b";
        String result = high(inputString);
        System.out.println("Highest Scoring Word: " + result);
    }
}
