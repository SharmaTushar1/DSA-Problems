class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] alphabets = new int[256];
        int start=0, end=0, maxLen=0;
        for (; end<s.length(); end++) {
            alphabets[s.charAt(end)]++;
            while (!isValid(alphabets)) {
                alphabets[s.charAt(start)]--;
                start++;
            }
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
    
    public boolean isValid(int[] arr) {
        for (int num: arr) {
            if (num>1)
                return false;
        }
        return true;
    }
}