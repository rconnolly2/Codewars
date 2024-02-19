import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class splitjoin {
    public static int[] splitAndAdd(int[] numbers, int n) {
        ArrayList<Integer> arr_lst = new ArrayList<Integer>();
        for (int num : numbers) {
            arr_lst.add(num);
        }

        while (n!=0) {
            int p_med = (int) (arr_lst.size()/2);
            System.out.print(p_med);
            List<Integer> arr1 = new ArrayList<>(arr_lst.subList(0, p_med));
            List<Integer> arr2 = new ArrayList<>(arr_lst.subList(p_med, arr_lst.size()));
            // System.out.println(arr2);
            // System.out.println(arr2.size());
            // Sumo lista 1 a lista 2:
            if (arr1.size()<arr2.size()) { // añadir uno al indice
                arr1.add(0, 0); // meto zero para no hacer outbounds
            }
            System.out.println(arr1);

            // sumo valores de arr a arr2
            int[] tmp = new int[arr2.size()];
            for (int i=0; i<=arr1.size()-1; i++) {
                tmp[i] = arr1.get(i)+arr2.get(i);
            }

            // modifico arr_lst con nuevos valores
            arr_lst.clear();
            for (int i=0; i<=arr2.size()-1; i++) {
                arr_lst.add(tmp[i]);
            }

            System.out.println(arr_lst);
            n--;

        }

        int[] res = new int[arr_lst.size()];

        for (int i=0; i<=arr_lst.size()-1; i++) {
            res[i] = arr_lst.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        splitAndAdd(new int[]{32,45,43,23,54,23,54,34},2);
    }
}
