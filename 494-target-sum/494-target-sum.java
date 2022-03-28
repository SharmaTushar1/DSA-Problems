class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int value = 0;
        int[] count = new int[]{0};
        helper(nums, target, n, value, count);
        return count[0];
    }
    
    public void helper(int[] nums, int target, int n, int value, int[] count) {
        if (n==0) {
            if (value == target) {count[0]++; return;}
        } else {
            helper(nums, target, n-1, value+nums[n-1], count);
            helper(nums, target, n-1, value-nums[n-1], count);
        }
    }
    
    
    
}