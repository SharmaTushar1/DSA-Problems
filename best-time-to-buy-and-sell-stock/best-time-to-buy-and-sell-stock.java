class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int max = -1;
        int min = Integer.MAX_VALUE;
        for (int price: prices) {
            max = Math.max(max, price);
            if (price<min) {
                min = price;
                max = 0;
            }
            profit = Math.max(profit, max-min);
        }
        return profit;
    }
}