class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1];
        
        return helper(n, dp);
        
    }
    
    public int helper(int n, int[] dp) {
        if (n == 1 || n == 2) return n;
        if (dp[n]!=0) return dp[n];
        dp[n] = helper(n-1, dp) + helper(n-2, dp);
        return dp[n];
    }
    
}