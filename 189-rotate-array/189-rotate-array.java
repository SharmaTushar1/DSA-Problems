class Solution {
    public void rotate(int[] nums, int k) {

        //limit the value of k so it's not greater than nums.length
        
        k = k%nums.length;//k = 3
        
        //Reverse the array completely
        //[1,2,3,4,5,6,7] -> [7,6,5,4,3,2,1]
        
        reverse(nums, 0, nums.length-1);
        
        //reverse the first part till k
        //[5,6,7,4,3,2,1]
        
        reverse(nums,0,k-1);
        
        // reverse the end part from k to end
        //[5,6,7,1,2,3,4]
        
        reverse(nums, k, nums.length-1);    
        
    }
    
    public void reverse(int[] nums, int start, int end) {
        while (start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++; end--;
        }
    }
     
}