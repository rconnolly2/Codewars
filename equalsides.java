public class equalsides {
    public static int findEvenIndex(int[] arr) {
        for (int i=0; i<=arr.length-1; i++) {
            if (SumIzq(arr, i) == SumDer(arr, i)) { // si suman los mismo
                return i;
            }
        }
        return -1;
    }

    public static int SumIzq(int[] lista, int indice) { // me da sum
        int suma = 0;
        for (int i=0; i<=indice; i++) {
            suma += lista[i];
        }
        return suma;
    }

    public static int SumDer(int[] lista, int indice) { // me da sum
        int suma = 0;
        for (int i=indice; i<lista.length; i++) {
            suma += lista[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[] {1,2,3,4,3,2,1}));
    }
}
