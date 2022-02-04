import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] arr = new int[nums.length];
    
        arr[0] = 1;
        
        //first calculate product of all the values left to the current index
        
        for (int i = 1; i<nums.length; i++) {
            arr[i] = arr[i-1]*nums[i-1];
        }
        
        int right =1;
        
        for (int i = nums.length-1; i>=0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        
        return arr;
    }
}