class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int sum = 0;
        int end = 0;
        int ans = 0;
        for (; end<k; end++) {
            sum+=arr[end];
        }
        if (sum/k>=threshold) ans++;
        for (; end<arr.length; end++) {
            sum-=arr[start++];
            sum+=arr[end];
            if (sum/k>=threshold) ans++;
        }
        return ans;
    }
}