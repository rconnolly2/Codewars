import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class goodvsevil {
    public static String battle(String goodAmounts, String evilAmounts) {
        int[] val1 = new int[]{1, 2, 3, 3, 4, 10};
        int[] val2 = new int[]{1, 2, 2, 2, 3, 5, 10};
        String[] arr_good = goodAmounts.split(" ");
        String[] arr_bad = evilAmounts.split(" ");
        int val_good = 0;
        int val_bad = 0;

        for (int i=0; i<=arr_good.length-1; i++) {
            val_good += val1[i]*Integer.parseInt(arr_good[i]);
        }

        for (int i=0; i<=arr_bad.length-1; i++) {
            val_bad += val2[i]*Integer.parseInt(arr_bad[i]);
        }

        // resultado
        if (val_good>val_bad) {
            return "Battle Result: Good triumphs over Evil";
        } else if (val_bad>val_good) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }

    }

    public static void main(String[] args) {
        battle("1 0 0 0 0 0", "1 0 0 0 0 0 0");
    }
}
