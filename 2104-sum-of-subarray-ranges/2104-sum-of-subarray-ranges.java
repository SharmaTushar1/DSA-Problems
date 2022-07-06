class Solution {
    public long subArrayRanges(int[] nums) {
        long ans = 0;
        for (int i = 0; i<nums.length; i++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int j = i; j<nums.length; j++) {
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                ans += max-min;
            }
        }
        return ans;
    }
}