class Solution {
    public int mirrorReflection(int p, int q) {
        //we need to find m*p = n*q
        //where m is the number of extensions+1 and n is number of reflections+1
        //to find the factor we will make m=q and n=p. In that way they are already equal
        //now we just need to divide it by 2 to get the actual values
        int m=q, n=p;
        while (m%2==0 && n%2==0) {
            n/=2;
            m/=2;
        }
        if (m%2==0 && n%2!=0) return 0;
        else if (m%2!=0 && n%2!=0) return 1;
        else return 2;
    }
}