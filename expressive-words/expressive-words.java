//simple approach just use two pointers and have a check for the condition
//https://leetcode.com/problems/expressive-words/discuss/121706/Java-Solution-using-Two-Pointers-with-Detailed-Explanation

class Solution {
    public int expressiveWords(String s, String[] words) {
        int count =0; //this is the output
        for(String word: words) 
            if (stretchy(s, word)) 
                count++;
        return count;
    }
    
    public boolean stretchy(String s, String word) {
        if (word.length()>s.length())
            return false;
        int i =0, j=0;
        while (i<s.length() && j<word.length()) {
            if (s.charAt(i)!=word.charAt(j))
                return false;
            else {
                int len1 = getRepeatedLength(s, i);
                int len2 = getRepeatedLength(word, j);
                if (len1<3 && len1!=len2 || len1>=3 && len1<len2) //possible false conditions
                    return false;
                i+=len1;//move the pointer to the non repeating postion
                j+=len2;
            }
        }
        return i==s.length() && j==word.length(); //["abc"], "abcd" is an example edge case for this one
    }
    
    public int getRepeatedLength(String s, int i) {
        int j =i;
        while (j<s.length() && s.charAt(j)==s.charAt(i)) 
            j++;
        return j-i;
    }
    
}