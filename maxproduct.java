
public class maxproduct {
    public static long maxProduct(int[] numbers, int sub_size) {
        long producto = 1;

        if (sub_size <= 0) { // la cantidad de números para encontrar producto es menor que 0
            return 1;
        }

        SortMenMay(numbers); // ordeno numeros de menor a mayor utilizando bubble sort

        for (int i=numbers.length-1; i>=numbers.length-sub_size; i--) { // recorro lista desde final hasta hacia atrás la cantidad de números que me pidan el producto
            producto *= numbers[i]; // voy multiplicando los números sucesivamente
        }

        return producto;
    }

    // función ordenar utilizando algoritmo bubble sort de menor a mayor
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

    // funcion para intercambiar dos elementos en un array "swap"
    public static void Swap(int[] lista, int i, int j) {
        int temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(maxProduct(new int[]{4, 3, 5}, 2));      // Output: 20
        System.out.println(maxProduct(new int[]{8, 10, 9, 7}, 3));   // Output: 720
        System.out.println(maxProduct(new int[]{10, 8, 3, 2, 1, 4, 10}, 5)); // Output: 9600
        System.out.println(maxProduct(new int[]{-4, -27, -15, -6, -1}, 2)); // Output: 4
        System.out.println(maxProduct(new int[]{10, 3, -1, -27}, 3)); // Output: -30
    }
}
