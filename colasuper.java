
public class colasuper {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] cajeros = new int[n];
        for (int cliente : customers) { // itero sobre cada cliente en la lista
            int cajero_menos_cola = IndiceMasPequeño(cajeros); // al cajero que tenga el num mas pequeño
            cajeros[cajero_menos_cola] += cliente; // le sumamos el primer num de cliente
        }
        
        return NumMayorArr(cajeros);
    }

    public static int NumMayorArr(int[] arr) {
        int n_may = 0;
        for (int i=0; i<=arr.length-1; i++) { // itero sobre array y guardo el n may
            if (arr[i]>n_may) {
                n_may=arr[i];
            }
        }

        return n_may;
    }

    /**
     * Devuelve el indice mas pequeño de lista
     * @param array
     * @return
     */
    public static int IndiceMasPequeño(int[] array) { // devuelve el indice mas pequeño
        int ind_mas_peq=0;
        for (int i=0; i<=array.length-1; i++) {
            if (array[i]<array[ind_mas_peq]) {
                ind_mas_peq=i;
            }
        }

        return ind_mas_peq;
    }

    public static void main(String[] args) {
        int[] c1 = { 2, 2, 3, 3, 4, 4 };

        System.out.println(solveSuperMarketQueue(c1, 2));
    }
}
