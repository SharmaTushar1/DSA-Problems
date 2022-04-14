class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        
        //create 2 maps for storing the number of characters in each string
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        
        List<Integer> ans = new ArrayList<Integer>();
        if (p.length()>s.length()) return ans;
        
        //store the value in pCount
        
        for (int i = 0; i<p.length(); i++) {
            pCount[p.charAt(i)-'a']++;
        }
        
        int i = 0;
        int j = 0;
        
        //first add the values till p's length
        
        while (j<p.length()) {
            sCount[s.charAt(j)-'a']++;
            j++;
        }
        
        j--;
        
        
        while (i<s.length() && j<s.length()) {
            boolean isAnagram = true;
            for (int k = 0; k<26; k++) {
                if (pCount[k]!=sCount[k]) {isAnagram = false; break;}
            }
            
            if (isAnagram) ans.add(i);
            
            //remove the ith character and move i pointer
            
            sCount[s.charAt(i) - 'a']--;
            i++;
            //move the jth character and add it to the maps array
            j++;
            if (j<s.length()) sCount[s.charAt(j) - 'a']++;
        }
        return ans;
    }
}