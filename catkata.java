public class catkata {
    public static int[] append(int[] lista, int n) {
        int[] nueva_array = new int[lista.length+1];

        // copio array vieja a la nueva
        System.arraycopy(lista, 0, nueva_array, 0, lista.length);
        nueva_array[nueva_array.length-1] = n; // añado elemento del append
        return nueva_array;
    }

    public static boolean peacefulYard(String[] yard, int minDistance) {
        int[][] lista_posgatos = new int[3][2];
        int n_gato = 0;

        // Creo lista de pos gatos
        for (int i=0; i<=yard.length-1; i++) {
            for (int j=0; j<=yard[0].length()-1; j++) {
                if (yard[i].charAt(j)=='L' || yard[i].charAt(j)=='R' || yard[i].charAt(j)=='M') {
                    lista_posgatos[n_gato][0] = i;
                    lista_posgatos[n_gato][1] = j;
                    n_gato++;
                }
            }
        }

        for (int i=0; i <n_gato; i++) {
            for (int j = i + 1; j < n_gato; j++) {
                int x = lista_posgatos[i][0] - lista_posgatos[j][0];
                int y = lista_posgatos[i][1] - lista_posgatos[j][1];
                double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
                if (distance<minDistance) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(peacefulYard(new String[] {"------------", "------------", "-L----------", "------------", "------------", "------------"}, 10));
    }
}
