class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp, -1);
        return helper(nums, target, dp);
    }
    
    public int helper(int[] nums, int target, int[] dp) {
        if (0>target) return 0;
        if (0==target) return 1;
        if (dp[target]!=-1)
            return dp[target];
        int ans = 0;
        for (int i=0; i<nums.length; i++) {
            ans += helper(nums, target-nums[i], dp);
            dp[target] = ans;
        }
        return dp[target];
    }
    
}