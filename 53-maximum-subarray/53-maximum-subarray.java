class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i<nums.length; i++) {
            cur += nums[i];
            sum = Math.max(sum, cur);
            cur = Math.max(cur, 0);
        }
        return sum;
    }
}