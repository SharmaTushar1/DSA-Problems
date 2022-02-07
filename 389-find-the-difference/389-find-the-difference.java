class Solution {
    public char findTheDifference(String s, String t) {
        
        int[] h1 = new int[26];
        int[] h2 = new int[26];
        for (int i = 0; i<s.length(); i++) {
            h1[s.charAt(i)-97]++;
        }
        for (int i = 0; i<t.length(); i++) {
            h2[t.charAt(i)-97]++;
        }
        int ans = 0;
        
        System.out.println(Arrays.toString(h1));
        System.out.println(Arrays.toString(h2));

        for (int i =0; i<26; i++) {
            if (h1[i]!=h2[i]) {
                ans = i;
                break;
            }
        }
        char a = (char) (ans+97);
        
        return a;
        
        
    }
}