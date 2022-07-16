class Solution {
    public String longestPalindrome(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        String result = "";
        int n = s.length();
        int fLeft = 0;
        int fRight = 0;
        for (int i = 0; i<n; i++) {
            //odd cases
            left = i;
            right = i;
            while (left>=0 && right<n && s.charAt(left) == s.charAt(right)) {
                if (right-left+1 > maxLen) {
                    fLeft = left;
                    fRight = right;
                    maxLen = right-left+1;
                }
                left--;
                right++;
            }
            //even cases
            left = i;
            right = i+1;
            while (left>=0 && right<n && s.charAt(left) == s.charAt(right)) {
                if (right-left+1 > maxLen) {
                    fLeft = left;
                    fRight = right;
                    maxLen = right-left+1;
                }
                left--;
                right++;
            }
        }
        result = s.substring(fLeft, fRight+1);
        return result;
    }    
}