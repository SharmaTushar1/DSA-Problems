class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        int start = 0;
        int end = 0;
        while (end<s.length()) {
            while (start<s.length() && set.contains(s.charAt(end))) 
                set.remove(s.charAt(start++));
            ans = Math.max(ans, end-start+1);
            set.add(s.charAt(end++));
        }
        return ans;
    }
}