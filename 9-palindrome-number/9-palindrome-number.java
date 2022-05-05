class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int i = 0, j = s.length()-1;
        while (i<j) {
            if (s.charAt(j--)!=s.charAt(i++)) return false;
        }
        return true;
    }
}