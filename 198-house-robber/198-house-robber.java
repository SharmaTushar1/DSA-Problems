class Solution {
    public int rob(int[] nums) {
        if (nums.length==1) 
            return nums[0];
        int before = 0;
        int prev = nums[0];
        for (int i = 1; i<nums.length; i++) {
            int cur = Math.max(before+nums[i], prev);
            before = prev;
            prev = cur;
        }
        return prev;
    }
}