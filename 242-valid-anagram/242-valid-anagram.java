class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        
        for (int i =0; i<s.length(); i++) {
            map1[s.charAt(i)-97]++;
        }
        
        for (int i =0; i<s.length(); i++) {
            map2[t.charAt(i)-97]++;
        }
        
        // System.out.println(Arrays.toString(map1));
        // System.out.println(Arrays.toString(map2));

        
        for (int i = 0; i<26; i++) {
            if (map1[i]!=map2[i]) return false;
        }
        return true;
        
    }
}