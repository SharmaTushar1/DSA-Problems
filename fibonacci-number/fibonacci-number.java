class Solution {
    public int fib(int n) {
        if (n<=1) return n;
        int[] dp = new int[32];
        helper(n, dp);
        return dp[n];
    }
    
    public int helper(int n, int[] dp) {
        if (n<=1) return n;
        if (dp[n]!=0) return dp[n];
        dp[n] = helper(n-1, dp)+helper(n-2, dp);
        return dp[n];
    }
    
}