class Solution {
    public void moveZeroes(int[] nums) {
        
        int[] arr = new int[nums.length];
        
        for (int i = 0, j =0; i<nums.length; i++) {
            if (nums[i] != 0) {
                arr[j] = nums[i];
                j++;
            }
        }
        for (int i =0; i<nums.length; i++) {
            nums[i] = arr[i];
        }
    }
}