class Solution {
    public int strStr(String s, String needle) {
        if (needle.length()==0) return 0;
        if (needle.length()>s.length()) return -1;
        int m = s.length(), n = needle.length();
        for (int i = 0; i<m; i++) {
            if (s.charAt(i)==needle.charAt(0)) {
                int temp = i;
                int j = 0;
                while (j<n && i<m && s.charAt(i)==needle.charAt(j)) {
                    i++;
                    j++;
                }
                if (j==n) return temp;
                i = temp;
            }
        }
        return -1;
    }
}