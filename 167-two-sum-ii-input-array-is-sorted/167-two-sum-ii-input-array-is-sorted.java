class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int start = 0;
        int end = nums.length-1;
        
        while (start<end) {
            if (nums[start]+nums[end]>target) end--;
            else if (nums[start]+nums[end]<target) start++;
            else {
                arr[0] = start+1;
                arr[1] = end+1;
                return arr;
            }
        }
        
        return arr;
    }
}