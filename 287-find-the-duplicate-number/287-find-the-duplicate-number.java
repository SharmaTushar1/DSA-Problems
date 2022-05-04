class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        int n = nums.length; 
        while (i<n) {
            int correct = nums[i]-1;
            if (nums[correct] != nums[i]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else i++;
        }
        return nums[n-1];
    }
}