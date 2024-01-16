import java.lang.reflect.Array;
import java.util.Arrays;

public class digitize {
    public static int[] insert(int[] lista, int n) {
        int[] nueva_array = new int[lista.length+1];

        // copio array vieja a la nueva
        System.arraycopy(lista, 0, nueva_array, 1, lista.length);
        nueva_array[0] = n; // añado elemento del append
        return nueva_array;
    }

    public static int[] digitize(int n){
        int[] resultado = new int[0];
        int extraido = 0;
        if (n==0) { // si n es 0 devuelvo lista con un 0
            return new int[]{0};
        }
        while(n!=0) { // voy sacando el modulo de n entre 10 para sacar los números de atrás y
            extraido = n%10;
            n = n/10;
            resultado = insert(resultado, extraido); // ponerlos al principio
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(0)));
    }
}
