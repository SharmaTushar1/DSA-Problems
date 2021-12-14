//link-https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/

class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alphabets = new int[123];
        char[] ch = sentence.toCharArray();
        int n = ch.length;
        for (int i =0; i<n; i++) {
            alphabets[ch[i]]++;
        }
        
        for (int i =97; i<=122; i++) {
            if (alphabets[i]==0) return false;
        }
        
        return true;
        
    }
}
