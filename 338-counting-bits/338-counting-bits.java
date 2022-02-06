class Solution {
    public int[] countBits(int n) {
       int[] arr = new int[n+1];
       for (int i = 0; i<=n; i++) {
           int j = i;
           int ones = 0;
           while (j>0) {
               ones = ones+(1&j);
               j>>=1;
           }
           arr[i] = ones;
       }
        return arr;
    }
}