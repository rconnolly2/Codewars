import java.util.*; 
public class snail {
    public static int[] snail(int[][] array) {
        int[] resultado_lista = new int[0]; // lista sin elem
        int indice_x = array[0].length - 1;
        int indice_y = array.length - 1;
        int x_actual = 0;
        int y_actual = 0;

        while (x_actual <= indice_x && y_actual <= indice_y) { // mientras la pos actual sea menor al ancho y alto
            // voy de izq a derecha acabando len de el ancho
            for (int i=x_actual; i<=indice_x; i++) {
                resultado_lista = append(resultado_lista, array[y_actual][i]);
            }
            y_actual++; // sumo una posición donde empezare el proximo movimiento para evitar imp mismo num

            // arriba a abajo
            for (int j=y_actual; j<=indice_y; j++) { // desde la nueva pos actual hasta la longitud de alto
                resultado_lista = append(resultado_lista, array[j][indice_x]);
            }
            indice_x--; // proximo movimiento empezara pos actual-1 para evitar imprimir el mismo numero

            // der a izq
            for (int k=indice_x; k>=x_actual; k--) {
                resultado_lista = append(resultado_lista, array[indice_y][k]);
            }
            indice_y--; // proximo movimiento empezare pos actual y-1 para no imp mismo num

            // abajo arriba
            // Como he empezado para no imprimir el mismo numero y el rango se acaba ya he recorido una vuelta entera !
            for (int k=indice_y; k>=y_actual; k--) {
                resultado_lista = append(resultado_lista, array[k][x_actual]);
            }
            x_actual++; // añado x+1 para no imp el mismo numero

            // HE DADO LA VUELTA
        }


        return resultado_lista;
    }

        public static int[] append(int[] lista, int n) {
        int[] nueva_array = new int[lista.length+1];

        // copio array vieja a la nueva
        System.arraycopy(lista, 0, nueva_array, 0, lista.length);
        nueva_array[nueva_array.length-1] = n; // añado elemento del append
        return nueva_array;
    }

   public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 6},
                        {4, 5, 6, 6},
                        {11, 12, 13, 7},
                        {4, 5, 6, 6}};

        System.out.println(Arrays.toString(snail(array)));
   }
}
