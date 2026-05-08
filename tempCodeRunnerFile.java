class Solution {

    int[][] dp;

    public int countPaths(int i, int j, int m, int n) {

        // destination reached
        if(i == m-1 && j == n-1) {
            return 1;
        }

        // out of bounds
        if(i >= m || j >= n) {
            return 0;
        }

        // already computed
        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int right = countPaths(i, j+1, m, n);

        int down = countPaths(i+1, j, m, n);

        dp[i][j] = right + down;

        return dp[i][j];
    }

    public int uniquePaths(int m, int n) {

        dp = new int[m][n];

        // initialize with -1
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return countPaths(0,0,m,n);
    }
}