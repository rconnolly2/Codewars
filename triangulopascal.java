import java.util.ArrayList;

public class triangulopascal {
    public static long[] generate(int level) {
        ArrayList<Long> resultado = new ArrayList<Long>();
        resultado.add(1L);


        ArrayList<Long> lista_anterior = new ArrayList<Long>();
        lista_anterior.add(1L); // empiezo siempre 1
        for (int i=1; i<=level-1; i++) {
            ArrayList<Long> tmp = new ArrayList<Long>();
            lista_anterior.add(0, 0L);// meto cero al principio
            lista_anterior.add(0L);// meto cero al final

            for (int j=0; j<=lista_anterior.size()-1; j++) {
                if (j+1>lista_anterior.size()-1) { // segundo indice se sale
                    break;
                }
                tmp.add(lista_anterior.get(j)+lista_anterior.get(j+1));
            }

            // Añado al resultado la nueva fila:
            for (Long num : tmp) {
                resultado.add(num);
            }
            lista_anterior.clear(); // limpio lista
            lista_anterior.addAll(tmp); // copia tmp a lista anterior

        }

        long[] r = new long[resultado.size()];
        for (int i=0; i<=resultado.size()-1; i++) {
            r[i] = resultado.get(i);
        }

        return r;


    }

    public static void main(String[] args) {
        generate(4);
    }
}
