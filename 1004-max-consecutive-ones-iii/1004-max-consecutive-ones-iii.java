class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0, zeroes = 0;
        int ans = 0;
        for (int end = 0; end<nums.length; end++) {
            if (nums[end] == 1) {
                ans = Math.max(end-start+1, ans);
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
        }
        return ans;
    }
}