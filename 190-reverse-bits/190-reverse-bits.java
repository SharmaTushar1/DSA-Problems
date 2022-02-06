public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        // int one = 1;
        int i = 0;
        int res = 0;
        while (i<32) {
            int curValue = n&1;
            n>>=1;
            res = res | curValue<<(31-i);
            i++;
        }
        return res;
    }
}