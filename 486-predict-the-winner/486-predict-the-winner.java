class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length+1];
        for (int[] val: dp) {
            Arrays.fill(val, -1);
        }
        int p1Score = helper(nums, 0, nums.length-1, dp);
        int totalScore = 0;
        for (int num: nums) {
            totalScore += num;
        }
        return p1Score>=totalScore-p1Score;
    }
    
    public int helper(int[] nums, int i, int j, int[][] dp) {
        if (i>j) return 0;
        else if (i == j) return nums[i];
        else if (dp[i][j]!=-1) {
            return dp[i][j];
        }
        else {
            dp[i][j] = Math.max(nums[i]+Math.min(helper(nums, i+2, j, dp), helper(nums, i+1, j-1, dp)), nums[j]+Math.min(helper(nums, i+1, j-1, dp), helper(nums, i, j-2, dp)));
        return dp[i][j];
        }
    }
    
}