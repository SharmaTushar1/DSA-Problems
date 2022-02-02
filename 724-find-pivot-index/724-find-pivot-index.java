class Solution {
    public int pivotIndex(int[] nums) {
        
        for (int i =  0; i<nums.length; i++) {
        int sumLeft = 0;
        int sumRight = 0;
            for (int j =0; j<nums.length; j++) {
                if (j<i) sumLeft+=nums[j];
                else if(j>i) sumRight+=nums[j];
            }
            if (sumLeft == sumRight) return i;
        }
        return -1;
    }
}