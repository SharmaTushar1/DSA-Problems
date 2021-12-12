//link - https://leetcode.com/problems/running-sum-of-1d-array/solution/

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        for (int i =1; i<n; i++) {
            nums[i] +=nums[i-1];
        }
        return nums;
    }
}
