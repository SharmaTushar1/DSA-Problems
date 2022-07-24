class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0;
        int ans = 0;
        while (end<s.length()) {
            map.put(s.charAt(end), end);
            if (map.size()>2) {
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