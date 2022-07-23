class Solution {
    public String minWindow(String s, String t) {
        if (t.length()>s.length()) return "";
        int[] sCount = new int[123];
        int[] tCount = new int[123];
        for (int i = 0; i<t.length(); i++) {
            tCount[t.charAt(i)]++;
        }
        // [____111______]
        // [____11111____1]
        // "ADOBECODEBANC"
        int len = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int left = 0, right = 0;
        for (; end<s.length(); end++) {
            sCount[s.charAt(end)]++;
            if (isSame(sCount, tCount)) {
                while (isSame(sCount, tCount)) {
                    sCount[s.charAt(start)]--;
                    start++;
                }
                if (end-start+1<len) {
                    left = start-1;
                    right = end+1;
                    len = end-start+1;
                }
            }
        }
        return s.substring(left, right);
    }
    
    public boolean isSame(int[] a, int[] b) {
        for (int i = 0; i<=122; i++) {
            if (a[i]<b[i])
                return false;
        }
        return true;
    }
    
}