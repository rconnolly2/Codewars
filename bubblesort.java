import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] array_para_ordenar = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Antes de ordenar: " + Arrays.toString(array_para_ordenar));

        SortMayMen(array_para_ordenar);

        System.out.println("Después de ordenar: " + Arrays.toString(array_para_ordenar));
    }

    // función ordenar utilizando algoritmo bubble sort de mayor a menor
    public static void SortMayMen(int[] lista) {
        for (int i=0; i<lista.length; i++) {
            for (int j=i+1; j<lista.length; j++) {
                if (lista[i] < lista[j]) {
                    // intercambio elemento i por j
                    Swap(lista, i, j);
                }
            }
        }
    }

    // funcion para intercambiar dos elementos en un array "swap"
    public static void Swap(int[] lista, int i, int j) {
        int temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }
}
