class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        int i = 0, j = 0;
        while (i<ransomNote.length() || j<magazine.length()) {
            if (i<ransomNote.length()) count[ransomNote.charAt(i)-'a']--;
            if (j<magazine.length()) count[magazine.charAt(j)-'a']++;
            i++;
            j++;
        }
        for (int k = 0; k<=25; k++) {
            if (count[k]<0) return false;
        }
        return true;
    }
}