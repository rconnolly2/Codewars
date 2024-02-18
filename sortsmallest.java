import java.util.ArrayList;
import java.util.Arrays;

public class sortsmallest {
    public static int[] findIndexOfSubArray(int[] arr){
        int ind_min = arr.length-1, ind_max = 0;

        // busco el indice de la izquierda que necesita swap
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                ind_min = i;
                break;
            }
        }

        // indice der
        for (int i=arr.length-1; i>0; i--) {
            if (arr[i]<=arr[i-1]) {
                ind_max = (i>ind_max) ? i : ind_max;
            }
        }

        // si el indice ya esta ordenado
        if (ind_min >= ind_max) {
            return new int[] {0, 0};
        }

        return new int[] {ind_min, ind_max};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findIndexOfSubArray(new int[]{9, 2, 32, 123, 3, 2, 2})));
    }
}
