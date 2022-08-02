class Solution {
    public double myPow(double x, int n) {
        long N = (long)n;
        return myPoww(x, N);
    }
    public double myPoww(double x, long N) {
        if (N==0) return 1;
        if (N<0) {
            N = -N;
            x = 1/x;
        } 
        return N%2==0?myPoww(x*x, N/2):x*myPoww(x*x, N/2);
    }
}