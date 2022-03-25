class Solution {
    public String longestPalindrome(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        String result = "";
        int n = s.length();
        for (int i = 0; i<n; i++) {
            //odd cases
            left = i;
            right = i;
            while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
                if (right-left+1 > maxLen) {
                    result = s.substring(left, right+1);
                    maxLen = right-left+1;
                }
                left--;
                right++;
            }
            //even cases
            left = i;
            right = i+1;
            while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
                if (right-left+1 > maxLen) {
                    result = s.substring(left, right+1);
                    maxLen = right-left+1;
                }
                left--;
                right++;
            }
        }
        return result;
    }    
}