class Solution {
    public boolean isPalindrome(String s) {
        
        int start = 0; 
        int end = s.length()-1;
        s = s.toLowerCase();
        
        while (start<end) {
            while (start<end && !isAlpha(s.charAt(start))) start++;
            while (start<end && !isAlpha(s.charAt(end))) end--;
                if (s.charAt(start)!=s.charAt(end)) return false;
                else {
                    start++;
                    end--;
            }
        }
        return true;
        
    }
    
    public boolean isAlpha(char c) {
        return (c>='0' && c<='9') || (c>='a' && c<='z');
    }
    
}