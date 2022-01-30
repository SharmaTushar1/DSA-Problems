class Solution {
    public void rotate(int[] nums, int k) {

        int[] arr = new int[nums.length];
        
        while (k>nums.length) {
            k%=nums.length;
        }
        
        int index = arr.length-k;
        
        // System.out.println(index);
        
        int i = 0;
        
        while (i<k) {
            arr[i] = nums[i+index];
            i++;
        }
        
        while (i<arr.length) {
            arr[i] = nums[i-k];
            i++;
        }
        
        for (int j = 0; j<arr.length; j++) {
            nums[j] = arr[j];
        }
        
    }
     
}