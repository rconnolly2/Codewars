public class catkata {
    public static int[] append(int[] lista, int n) {
        int[] nueva_array = new int[lista.length+1];

        // copio array vieja a la nueva
        System.arraycopy(lista, 0, nueva_array, 0, lista.length);
        nueva_array[nueva_array.length-1] = n; // añado elemento del append
        return nueva_array;
    }

    public static void peacefulYard(String[] yard, int minDistance) {
        int[][] lista_posgatos = new int[3][2];
        int n_gato = 0;

        // Creo lista de pos gatos
        for (int i=0; i<=yard.length-1; i++) {
            for (int j=0; j<=yard[0].length()-1; j++) {
                if (yard[i].charAt(j)=='L') {
                    lista_posgatos[n_gato][0] = i;
                    lista_posgatos[n_gato][1] = j;
                    n_gato++;
                }
            }
        }

        // Miro si la distancia entre gatos es la menor a la minima
        for (int i=0; i<=lista_posgatos.length-1; i++) {
            
        }



    }
    public static void main(String[] args) {
        peacefulYard(new String[] {"------------", "------------", "-L----------", "------------", "------------", "------------"}, 10);
    }
}
