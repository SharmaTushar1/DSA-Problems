class Solution {
    public int maxProfit(int[] arr) {
        int ans = 0;
        int minIndex = 0;
        int profit = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++) {
            if (i!=0 && arr[i]<arr[i-1]) {
                ans += profit;
                minIndex = i;
            }
            profit = arr[i]-arr[minIndex];
        }
        ans+=profit;
        return ans;
    }
}