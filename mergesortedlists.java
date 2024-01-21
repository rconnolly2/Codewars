import java.util.*; 
public class mergesortedlists {
    public static int[] mergeArrays(int[] first, int[] second) {
		// creo set
        Set<Integer> lista_sin_duplicados = new HashSet<Integer>();
        
        // itero sobre las dos listas y añado números al set
        for (int i : first) {
            lista_sin_duplicados.add(i);
        }
        for (int i : second) {
            lista_sin_duplicados.add(i);
        }

        int[] lista_resultado = new int[lista_sin_duplicados.size()];

        int indice = 0;
        for (int i : lista_sin_duplicados) { // añado cada numero del set a mi resultado lista
            lista_resultado[indice] = i;
            indice++;
        }

        Arrays.sort(lista_resultado); // ordeno lista

        return lista_resultado;
	}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 })));
    }
}
