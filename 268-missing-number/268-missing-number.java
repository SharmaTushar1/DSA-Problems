class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i<nums.length; i++) {
            if (i!=nums[i]) 
                return nums[i]-1;
        }
        return nums[nums.length-1]+1;
    }
}