class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int rev = 0;
        int temp = x;
        while (temp>0) {
            int cur = temp%10;
            rev=rev*10+cur;
            temp/=10;
        }
        if (x==rev || x==0) return true;
        return false;
    }
}