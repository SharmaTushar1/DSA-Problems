class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();
        
        for (String word: arr) {
            
            StringBuilder sb = new StringBuilder();
            for (int i =0; i<word.length(); i++) {
                sb.append(word.charAt(word.length()-i-1));
            }
            ans.append(sb);
            ans.append(" ");
        }
        return ans.toString().strip();
    }
}