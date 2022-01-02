class Solution {
    public int removeDuplicates(int[] arr) {
        int n= arr.length;
        int count = 0;
        for (int i = 1; i<n; i++) {
            if (arr[i-1] == arr[i]) count++;
            else arr[i-count] = arr[i];
        }
        return n-count;
    }
}