class Solution {
    public int mod = 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        for (int[] d: dp) {
            Arrays.fill(d, -1);
        }
        return helper(n, k, target, dp);
    }
    
    public int helper(int n, int k, int target, int[][] dp) {
        if (n==0 || target<0)
            return target==0?1:0;
        if (dp[n][target]!=-1) return dp[n][target];
        int ans = 0;
        for (int i = 1; i<=k; i++) {
            ans= (ans+helper(n-1, k, target-i, dp))%mod;
        }
        return dp[n][target] = ans;
    }
    
}