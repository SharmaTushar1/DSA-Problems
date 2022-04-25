class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while (i<j) {
            if (Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j))) 
                if (Character.toLowerCase(s.charAt(i++))!=Character.toLowerCase(s.charAt(j--))) return false;
            while (i<s.length() && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (j>=0 && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (i<s.length() && j>=0 && !Character.isLetterOrDigit(s.charAt(i)) && !Character.isLetterOrDigit(s.charAt(j))) {
                i++;
                j--;
            }
        }
        return true;
    }
}