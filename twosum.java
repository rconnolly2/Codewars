import java.util.Arrays;

public class twosum {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i=0; i<=numbers.length-1;i++) {
            if (i<numbers.length-1) { // me aseguro que el indice no sea out of bounds
                if (numbers[0]+numbers[numbers.length-1]==target) { // primero compruebo el primero y ultimo
                    return new int[]{0, numbers.length-1};
                }
              
                if (numbers[i]+numbers[i+1]==target) { // Si el indice actual y el siguiente da el total
                    int[] resultado = new int[2];
                    resultado[0] = i;
                    resultado[1] = i+1;
                    return resultado; // devuelvo
                }
            }
        }

        // en caso de que comprobar primero, ultimo y indice con el siguiente tampoco haya funcionado:
        for (int i=0; i<=numbers.length-1;i++) { // comprobar cada numero con cada indice
            for (int j=0; j<=numbers.length-1;j++) {
                if (numbers[i]+numbers[j]==target) {
                    return new int[]{i, j};
                }
            
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1234,5678,9012}, 14690)));
    }
}
