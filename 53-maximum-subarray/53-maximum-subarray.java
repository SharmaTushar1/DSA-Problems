class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i<nums.length; i++) {
            sum+=nums[i];
            maxSum = Math.max(maxSum, sum);
            sum = Math.max(0, sum);
        }
        return maxSum;
    }
}