class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0];
        int result = nums[0];
        for (int i=1; i<nums.length; i++) {
            int temp = min;
            min = Math.min(Math.min(nums[i]*min, nums[i]*max), nums[i]);
            max = Math.max(Math.max(nums[i]*temp, nums[i]*max), nums[i]);
            result = Math.max(max, result);
        }
        return result;
    }
}