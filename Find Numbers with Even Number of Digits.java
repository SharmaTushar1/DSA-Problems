class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i =0; i<nums.length; i++) {
            if (length(nums[i])%2 == 0) {
                count++;
            }
        }
        return count;
    }
    
    public int length(int num) {
        int length = 0;
        while (num!=0) {
            num /= 10;
            length++;
        }
        return length;
    }
    
}
