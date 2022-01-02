class Solution {
    public int missingNumber(int[] arr) {
        // int i =0;
        int n = arr.length;
        Arrays.sort(arr);
        for (int i =0; i<n; i++) {
            if (arr[i] != i) return arr[i]-1;
        }
        return arr[arr.length-1]+1;
    }
}