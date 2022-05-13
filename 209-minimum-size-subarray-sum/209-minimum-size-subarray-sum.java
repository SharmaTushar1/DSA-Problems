class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, sum = 0, ans = Integer.MAX_VALUE;
        boolean flag = true;
        for (int end = 0; end<nums.length; end++) {
            sum += nums[end];
            while (sum>=target && start<nums.length) {
                ans = Math.min(ans, end-start+1);
                sum -= nums[start];
                start++;
                flag = false;
            }
        }
        if (flag) return 0;
        if (!flag && ans ==0) return 1;
        return ans;
    }
}