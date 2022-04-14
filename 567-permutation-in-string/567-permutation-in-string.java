class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        
        for (int i = 0; i<s1.length(); i++) {
            s1Count[s1.charAt(i)-'a']++;
        }
        
        int i=0, j=0;
        
        while (j<s1.length()) {
            s2Count[s2.charAt(j)-'a']++;
            j++;
        }
        
        j--;
        
        while (j<s2.length()) {
            boolean flag = true;
            for (int k = 0; k<26; k++) {
                if (s1Count[k]!=s2Count[k]) {flag = false; break;}
            }
            if (flag) return true;
            s2Count[s2.charAt(i)-'a']--;
            i++;
            j++;
            if (j<s2.length()) s2Count[s2.charAt(j)-'a']++;
        }
        return false;
        
        
    }
}