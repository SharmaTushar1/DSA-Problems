class Solution {
    public int rob(int[] nums) {
        if (nums.length==1) 
            return nums[0];
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        return helper(nums, nums.length, dp);
    }
    
    public int helper(int [] nums, int n, int[] dp) {
        if (n<=0) return 0;
        if (dp[n]!=-1) 
            return dp[n];
        dp[n] = Math.max(helper(nums, n-2, dp)+nums[n-1], helper(nums, n-1, dp));
        return dp[n];
    }
    
}