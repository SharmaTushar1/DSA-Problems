class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int p1Score = helper(nums, 0, nums.length-1);
        int totalScore = 0;
        for (int num: nums) {
            totalScore += num;
        }
        return p1Score>=totalScore-p1Score;
    }
    
    public int helper(int[] nums, int i, int j) {
        if (i>j) return 0;
        else if (i == j) return nums[i];
        else {
            int p1Score = Math.max(nums[i]+Math.min(helper(nums, i+2, j), helper(nums, i+1, j-1)), nums[j]+Math.min(helper(nums, i+1, j-1), helper(nums, i, j-2)));
        return p1Score;
        }
    }
    
}