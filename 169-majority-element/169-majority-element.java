class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int majorityCheck = n/2;
        if (arr.length == 1) return arr[0];
        for (int i = 0; i<n-1; i++) {
            int count = 1;
            for (int j = i+1; j<n; j++) {
                if (arr[i]==arr[j]) count++;
            }
                if (count>majorityCheck) return arr[i];
        }
        return -1;
    }
}