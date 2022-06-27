class Solution {
    public int reverse(int x) {
        long y = (long)x;
        long rev = 0;
        while (y!=0) {
            rev=rev*10+y%10;
            y/=10;
        }
        return (rev<=Integer.MAX_VALUE&&rev>=Integer.MIN_VALUE)?(int)rev:0;
    }
}