class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for (int i = 0; i<=amount; i++) {
            for (int j = 0; j<coins.length; j++) {
                if (i>=coins[j]) dp[i] = Math.min(1+dp[i-coins[j]], dp[i]);
                else break;
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}