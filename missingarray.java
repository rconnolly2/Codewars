import java.util.Arrays;

public class missingarray {
    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {

        if (arrayOfArrays == null || arrayOfArrays.length == 0) {
            return 0;
        }

        for (int i=0; i<=arrayOfArrays.length-1; i++) {
            if (arrayOfArrays[i] == null || arrayOfArrays[i].length == 0) {
                return 0;
            }
        }
      
        int[] largo = new int[arrayOfArrays.length];
        for (int i=0; i<arrayOfArrays.length; i++) {
            largo[i] = arrayOfArrays[i].length;
        }

        SortMenMay(largo);
      
        int resultado = largo[0];

        for (int i : largo) {
            if (i != resultado) {
                return resultado;
            }
            resultado++;
        }

        return 0;
    }


    public static void SortMenMay(int[] lista) {
        for (int i=0; i<lista.length; i++) {
            for (int j=i+1; j<lista.length; j++) {
                if (lista[i] > lista[j]) {
                    // intercambio elemento i por j
                    Swap(lista, i, j);
                }
            }
        }
    }

    public static void Swap(int[] lista, int i, int j) {
        int temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }


    public static void main(String[] args) {
        Object[][] arrayOfArrays = {
            {4, 4},
            {1, 1, 0, 4, 3, 0, 0, 0, 0, 4, 1},
            {2, 2, 1, 0, 3, 4, 2, 4, 0, 3, 0, 0},
            {4, 1, 4, 2, 1, 2, 4},
            {3, 3, 3, 2, 0},
            {4, 2, 1, 1, 3, 2, 2, 1},
            {1, 0, 4},
            {3, 4, 0, 2, 0, 0, 0, 3, 0, 1},
            {1, 4, 1, 3, 0, 4, 2, 4, 0},
            {1, 0, 4, 2, 3, 0}
    };
        System.out.println(getLengthOfMissingArray(arrayOfArrays));
    }

}
