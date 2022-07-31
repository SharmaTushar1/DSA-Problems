class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int price: prices) {
            max = Math.max(price, max);
            if (price<min) {
                min = price;
                max =0;
            }
            ans = Math.max(ans, max-min);
        }
        return ans;
    }
}