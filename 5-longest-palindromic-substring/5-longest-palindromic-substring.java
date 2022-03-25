class Solution {
    public String longestPalindrome(String s) {
        //The idea is similar just expan around like we did in palindromic substring
        int resLen = 0;
        int r = 0;
        int l = 0;
        String str = "";
        for (int i =0; i<s.length(); i++) {
            //odd cases
            r = i;
            l = i;
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
                if (r-l+1>resLen) {
                    str = s.substring(l,r+1);
                    resLen = r-l+1;
                }
                l--;
                r++;
            }
            l = i;
            r = i+1;
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
                if (r-l+1>resLen) {
                    str = s.substring(l,r+1);
                    resLen = r-l+1;
                }
                l--;
                r++;
            }
        }
        return str;
    }
}