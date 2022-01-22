class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i<n; i++) {
            int sum = 0;
            for (int j = i; j<n; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}