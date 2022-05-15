class Solution {
    public String minWindow(String s, String t) {
        int start = 0;
        int[] sMap = new int[123];
        int[] tMap = new int[123];
        int i = 0;
        int j = 0;
        boolean never = true;
        int len = Integer.MAX_VALUE;
        for (int k=0; k<t.length(); k++) 
            tMap[t.charAt(k)]++;
        for (int end = 0; end<s.length(); end++) {
            sMap[s.charAt(end)]++;
            if (isEqual(sMap, tMap)) {
                while (isEqual(sMap, tMap)) {
                    never = false;
                    sMap[s.charAt(start)]--;
                    start++;
                }
                if (end-start+1<len) {
                    len = end-start+1;
                    i = start-1;
                    j = end;
                }
            }
        }
        if (t.length()>s.length() || never) return "";
        return s.substring(i, j+1);
    }
    
    public boolean isEqual(int[] sMap, int[] tMap) {
        for (int i = 0; i<123; i++) {
            if (sMap[i]<tMap[i]) return false;
        }
        return true;
    }
    
}