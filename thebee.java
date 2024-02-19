public class thebee {
    public static long the_bee(int N) {
        // Initialize dp array
        long[][] dp = new long[N + 1][N + 1];
        dp[0][0] = 1; // Only one way to start at cell A
        
        // Populate dp array
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                if (i > 0) // Move down
                    dp[i][j] += dp[i - 1][j];
                if (i > 0 && j < N) // Move down-right
                    dp[i][j] += dp[i - 1][j + 1];
                if (i > 0 && j > 0) // Move up-right
                    dp[i][j] += dp[i - 1][j - 1];
            }
        }
        
        // Return the number of ways to reach cell B
        return dp[N][N];
    }

        public static void main(String[] args) {
        System.out.println(the_bee(2)); // Should output 11
        System.out.println(the_bee(3)); // Should output 291
        System.out.println(the_bee(5)); // Should output 259123
    }
}
