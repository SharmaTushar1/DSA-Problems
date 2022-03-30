class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for (int s = nums.length; s >= 0; s--) {
            for (int e = s; e < nums.length; e++) {
                if (s == e) {
                    dp[s][e] = nums[s];
                } else {
                    int a = nums[s] - dp[s + 1][e];
                    int b = nums[e] - dp[s][e - 1];
                    dp[s][e] = Math.max(a, b);
                }
            }
        }
        return dp[0][nums.length - 1] >= 0;
    }
}