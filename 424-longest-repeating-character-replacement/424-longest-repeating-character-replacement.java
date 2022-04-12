class Solution {
    public int characterReplacement(String s, int k) {
        int N = s.length();
        int[] arr = new int[26];
        int maxLen = 0; //substring's length
        int windowStart = 0;
        int maxOcc = 0;
        for (int window_end = 0; window_end<N; window_end++) {
            arr[s.charAt(window_end)-'A']++;
            int current = arr[s.charAt(window_end)-'A'];
            maxOcc = Math.max(maxOcc, arr[s.charAt(window_end)-'A']);
            while (window_end-windowStart+1-maxOcc>k) {
                arr[s.charAt(windowStart)-'A']--;
                windowStart++;
            }
            maxLen = Math.max(maxLen, window_end-windowStart+1);
        }
        return maxLen;
    }
}