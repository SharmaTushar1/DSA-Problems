class Solution {
    
    public boolean PredictTheWinner(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;
        int p1Score = helper(start, nums, end);
        int totalScore = 0;
        for (int num: nums) {
            totalScore += num;
        }
        return p1Score>=totalScore-p1Score;
        
    }
    
    public int helper(int start, int[] nums, int end) {
        if (start>end) return 0;
        else if (start==end) return nums[start];
        else {
            int p1Score = Math.max(
                nums[start]+Math.min(helper(start+2, nums, end), helper(start+1, nums, end-1)), 
                nums[end]+Math.min(helper(start+1, nums, end-1), helper(start, nums, end-2))
            );
            return p1Score;
        }
    }
    
}