class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i<nums.length; i++) {
            cur += nums[i];
            ans = Math.max(cur, ans);
            if (cur<=0) 
                cur = 0;
        }
        return ans;
    }
}