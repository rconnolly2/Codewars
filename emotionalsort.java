import java.util.Arrays;

public class emotionalsort {
    public static String[] sortEmotions(boolean order,String[] emotions) {
        emotions = bubblesort(emotions, order);
        return emotions;
    }

    public static String[] bubblesort(String[] arr, boolean ord_desc) {
        for (int i=0; i<=arr.length-1; i++) {
            for (int j=i+1; j<=arr.length-1; j++) {
                if (ord_desc==true) {
                    if (ValorEmoji(arr[i])<ValorEmoji(arr[j])) {
                        arr = Swap(arr, i, j);
                    }
                } else {
                    if (ValorEmoji(arr[i])>ValorEmoji(arr[j])) {
                        arr = Swap(arr, i, j);
                    }
                }

            }
        }

        return arr;
    }

    public static String[] Swap(String[] arr, int ind1, int ind2) {
        String tmp = arr[ind2];
        arr[ind2] = arr[ind1];
        arr[ind1] = tmp;

        return arr;
    }

    public static Integer ValorEmoji(String emoji) {
        switch (emoji) {
            case "T_T":
                return 1;
            case ":(":
                return 2;
            case ":|":
                return 3;
            case ":)":
                return 4;
            default:
                return 5;
        }
    }
}
