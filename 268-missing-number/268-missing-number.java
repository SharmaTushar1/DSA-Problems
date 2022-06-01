class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i<n; i++) {
            int correct = nums[i];
            if (nums[i]>= n || nums[i]==i)
                continue;
            else {
                int temp = nums[correct];
                nums[correct] =  nums[i];
                nums[i] = temp;
                i--;
            }
        }
        for (int i = 0; i<n; i++) {
            if (nums[i]!=i) return i;
        }
        return n;
    }
}