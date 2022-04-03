class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = n;
        for (int i = n-1; i>0; i--) {
            if (nums[i-1]<nums[i]) {index = i-1; break;}
        }
        if (index==n) {
            nums = reverse(nums, 0, n-1);
            return;
        }
        int swapIndex = -1;
        for (int i =n-1; i>index; i--) {
            if (nums[i]>nums[index]) {swapIndex = i; break;}
        }
        int temp = nums[index];
        nums[index] = nums[swapIndex];
        nums[swapIndex] = temp;
        nums = reverse(nums, index+1, n-1);
    }
    
    public int[] reverse(int[] arr, int start, int end) {
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    
}