import java.util.Arrays;

public class reverse_array {
    public static int[] append(int[] lista, int n) {
        int[] nueva_array = new int[lista.length+1];

        // copio array vieja a la nueva
        System.arraycopy(lista, 0, nueva_array, 0, lista.length);
        nueva_array[nueva_array.length-1] = n; // añado elemento del append
        return nueva_array;
    }

    public static int[] digitize(long n) {
        String numero_str = Long.toString(n); // numero es string
        int[] listan_invertido = new int[numero_str.length()];

        for (int i=numero_str.length()-1, j=0; i>=0; i--, j++) { // en cada iteracion resto uno a i y sumo uno a j
            listan_invertido[j] = Character.getNumericValue(numero_str.charAt(i));
        }

        return listan_invertido;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(0)));
    }
    
}
