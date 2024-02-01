public class canicas {
    public static String predictLastMarbleColor(int b, int w) {
        // Base case: If there is only one marble left, return its color
        if (b + w == 1) {
            return (b == 1) ? "Black" : "White";
        }

        // Recursive cases:
        if (b % 2 == 0 && w % 2 == 0) {
            // If both counts are even, add a white marble
            return predictLastMarbleColor(b / 2, w / 2);
        } else {
            // If one count is odd and the other is even, add a black marble
            // If both counts are odd, add a black marble
            return predictLastMarbleColor((b + 1) / 2, w / 2);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int b = 10000;
        int w = 10000;
        String result = predictLastMarbleColor(b, w);
        System.out.println(result);  // This should print "White"
    }
}
