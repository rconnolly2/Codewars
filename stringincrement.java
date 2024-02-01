import java.math.BigInteger;
import java.util.Arrays;

/**
 * stringincrement
 */
public class stringincrement {

    public static String incrementString(String str) {
        StringBuilder letras = new StringBuilder();
        StringBuilder numeros = new StringBuilder();
        int index = str.length() - 1;

        while (index >= 0 && Character.isDigit(str.charAt(index))) { // saco indice donde empiezan números
            numeros.insert(0, str.charAt(index));
            index--;
        }

        letras.append(str, 0, index + 1); // hago un append del las letras

        if (numeros.length() == 0) { // si no hay números devuelvo las letras1
            return letras.toString()+"1";
        }

        // utilizo big integer para que me pase los test random
        // sumo 1 al str de números que ahora es int
        BigInteger numero = new BigInteger(numeros.toString()).add(BigInteger.ONE);
        String numero_incrementado = numero.toString();

        // al convertir a int me he cargado los ceros 
        int num_ceros_falt = numeros.length()-numero_incrementado.length(); // Se cuantos ceros tengo que añadir por la dieferncia entre le int y el str num
        StringBuilder ceros_izq = new StringBuilder();

        for (int i=0; i<num_ceros_falt; i++) {
            ceros_izq.append("0"); // los añad
        }

        return letras.toString()+ceros_izq.toString()+numero_incrementado;
    }

    public static void main(String[] args) {
        System.out.println((incrementString("")));
    }
}