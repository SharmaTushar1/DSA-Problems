class Solution {
    
    public boolean PredictTheWinner(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;
        int[][] dp = new int[nums.length+1][nums.length+1];
        for (int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        int p1Score = helper(start, nums, end, dp);
        int totalScore = 0;
        for (int num: nums) {
            totalScore += num;
        }
        return p1Score>=totalScore-p1Score;
        
    }
    
    public int helper(int start, int[] nums, int end, int[][] dp) {
        if (start>end) return 0;
        else if (start==end) return nums[start];
        else if (dp[start][end]!=-1) return dp[start][end];
        else {
            dp[start][end] = Math.max(
                nums[start]+Math.min(helper(start+2, nums, end, dp), helper(start+1, nums, end-1, dp)), 
                nums[end]+Math.min(helper(start+1, nums, end-1, dp), helper(start, nums, end-2, dp))
            );
            return dp[start][end];
        }
    }
    
}