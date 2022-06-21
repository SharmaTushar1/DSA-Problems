class Solution {
    public int numTrees(int n) {
        if (n==0) return 1;
        if (n==1 || n==2) return n;
        int sum = 0;
        for (int i = 1; i<=n; i++) {
            sum += numTrees(n-i)*numTrees(i-1);
        }
        return sum;
    }
}