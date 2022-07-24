class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int ans = 0;
        int start = 0, end=0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (end<s.length()) {
            map.put(s.charAt(end), end);
            if (map.size()>k) {
                int index = Collections.min(map.values());
                map.remove(s.charAt(index));
                start = index+1;
            }
            ans = Math.max(end-start+1, ans);
            end++;
        }
        return ans;
    }
}