import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class arrdiff {
    public static int[] arrayDiff(int[] a, int[] b) {

        Set<Integer> set_l2 = new HashSet<Integer>(); 
        ArrayList<Integer> resultado_arrlist = new ArrayList<Integer>();

        for (int n : b) {
            set_l2.add(n);
        }

        for (int i=0; i<=a.length-1; i++) {
            if (!(set_l2.contains(a[i]))) {
                resultado_arrlist.add(a[i]); // hago append
            }
        }

        int[] resultado = new int[resultado_arrlist.size()];

        for (int i=0; i<=resultado_arrlist.size()-1; i++) {
            resultado[i] = resultado_arrlist.get(i);
        }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2}, new int[] {1})));
    }
}
