class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0, end = 0, zeroes = 0;
        int ans = 0;
        while (end<nums.length) {
            if (nums[end] == 1) {
                ans = Math.max(end-start+1, ans);
                end++;
                continue;
            }
            else {
                if (zeroes<k) {
                    zeroes++;
                    ans = Math.max(end-start+1, ans);
                } else {
                    while (start<nums.length && nums[start]!=0) start++;
                    start++;
                    ans = Math.max(ans, end-start+1);
                }
            }
            end++;
        }
        return ans;
    }
}