import java.util.HashMap;
import java.util.Map;

public class findoddint {
    public static int findIt(int[] a) {
        Map<Integer, Integer> diccionario_num = new HashMap<>();

        for (int i : a) {
            if (diccionario_num.containsKey(i)) {
                int valor_actual = diccionario_num.get(i);
                diccionario_num.put(i, valor_actual + 1);
            } else {
                diccionario_num.put(i, 1);
            }
        }

        for (Integer clave : diccionario_num.keySet()) {
            if (NoEsPar(diccionario_num.get(clave))) {
                return clave;
            }
        }

        return 1;
    }

    public static boolean NoEsPar(int n) {
        if (n%2!=0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));    
    }
}
