class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] alt = new int[n+1];
        alt[0] = 0;
        alt[1] = gain[0];
        for (int i =2; i<n+1; i++) {
            alt[i] = gain[i-1]+alt[i-1];
        }
        int max = alt[0];
        for (int i =0; i<n+1; i++) {
            max = Math.max(max, alt[i]);
        }
        return max;
    }
}
