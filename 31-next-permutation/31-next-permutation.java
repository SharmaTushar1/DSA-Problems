class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for (int i = nums.length-2; i>=0; i--) {
            if (nums[i+1]>nums[i]) {
                index = i;
                break;
            }
        }
        int index2 =0;
        if (index<0) {
            reverse(nums, index+1);
            return;
        }
        for (int i=nums.length-1; i>=0; i--) {
            if (nums[i]>nums[index]) {
                index2 = i;
                break;
            }
        }
        swap(nums, index, index2);
        reverse(nums, index+1);
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void reverse(int[] nums, int start) {
        int end = nums.length-1;
        while (start<end) 
            swap(nums, start++, end--);
    }    
    
}