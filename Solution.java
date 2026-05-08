public class Solution{ //LatticePath Problem

    // DP array
    static long[][] dp;

    // Recursive function with memoization
    public static long countPaths(int i, int j, int m, int n) {

        // Destination reached
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // Out of bounds
        if (i >= m || j >= n) {
            return 0;
        }

        // Already calculated
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Move Right
        long right = countPaths(i, j + 1, m, n);

        // Move Down
        long down = countPaths(i + 1, j, m, n);

        // Store answer
        dp[i][j] = right + down;

        return dp[i][j];
    }

    public static void main(String[] args) {

        int m = 20;
        int n = 20;

        // Initialize DP array
        dp = new long[m][n];

        // Fill with -1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        long result = countPaths(0, 0, m, n);

        System.out.println("Total Lattice Paths: " + result);
    }
}