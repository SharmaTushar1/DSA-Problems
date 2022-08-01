class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (int[] d: dp) Arrays.fill(d, -1);
        helper(m, n, dp);
        return dp[m][n];
    }
    
    public int helper(int m, int n, int[][] dp) {
        if (m==1 || n==1) return dp[m][n]=1;
        if (dp[m][n]!=-1) return dp[m][n];
        return dp[m][n] = helper(m-1, n, dp)+helper(m, n-1, dp);
    }
    
}