class Solution {
    public int kthGrammar(int n, int k) {
        if (n==1 || k==1) return 0;
        //prevK is the max symbols possible in the prev row
        int prevK = (int)Math.pow(2, n-2);//n-1 for current n-1-1 for prev
        if (k<=prevK) 
            return kthGrammar(n-1, k);
        else {
            //to handle the edge cases where we are given the last value
            //i.e. when k = the last value here k%prevK will give 0 which is invalid
            //So, we'll check for this condition and make the invalid to valid (k/2)
            int presK = k%prevK;
            int val = kthGrammar(n-1, presK==0?k/2:k%prevK);
            return val==1?0:1;
        }
    }
}