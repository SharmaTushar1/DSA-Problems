class Solution {
    public int numTrees(int n) {
        if (n==1 || n==2) return n;
        int[] dp = new int[n+1];
        helper(n, dp);
        return dp[n];
    }
    public int helper(int n, int[] dp) {
        if (n==0) return 1;
        if (n==1 || n==2) return n;
        if (dp[n]!=0) return dp[n];
        for (int i = 1; i<=n; i++) {
            dp[n] += helper(n-i, dp)*helper(i-1, dp);
        }
        return dp[n];
    }
}