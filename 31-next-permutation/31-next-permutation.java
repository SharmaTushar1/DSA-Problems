class Solution {
    public void nextPermutation(int[] nums) {
        int index = nums.length-1;
        for (int j = nums.length-1; j>=0; j--) {
            if (j==0) {
                reverse(nums, 0, nums.length-1);
                return;
            } else if (nums[j-1]<nums[j]) {index = j-1; break;}            
        }
        for (int j = nums.length-1; j>=index; j--) {
            if (nums[j]>nums[index]) {
                int temp = nums[j];
                nums[j] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        reverse(nums, index+1, nums.length-1);
    }
    
    public void reverse(int[] arr, int start, int end) {
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}

