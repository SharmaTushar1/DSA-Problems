class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int goal = n-1;
        for (int i=n-1; i>=0; i--) {
            if (nums[i]-(goal-i)>=0)
                goal = i;
        }
        return goal == 0;
    }
}