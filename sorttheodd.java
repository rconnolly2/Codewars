import java.util.Arrays;

public class sorttheodd {
    public static int[] sortArray(int[] array) {
        array = bubblesort(array);
        return array;
    }

    public static int[] bubblesort(int[] lista) {
        for (int i=0; i<lista.length; i++) {
            for (int j=i+1; j<lista.length; j++) {
                if (lista[i]>lista[j]) {
                    if (lista[i]%2 != 0 && lista[j]%2 != 0) {
                        Swap(lista, i, j);
                    }
                }
            }
        }

        return lista;
    }

    public static void Swap(int[] lista, int i, int j) {
        int temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{ 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 })));
    }
}
