class Solution {
    public int rob(int[] nums) {
        if (nums.length<=2) {
            int ans = Integer.MIN_VALUE;
            for (int i = 0; i<nums.length; i++) {
                ans = Math.max(nums[i], ans);
            }
            return ans;
        }
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i<=nums.length; i++) {
            dp[i] = Math.max(dp[i-2]+nums[i-1], dp[i-1]);
        }
        return dp[nums.length];
    }
}