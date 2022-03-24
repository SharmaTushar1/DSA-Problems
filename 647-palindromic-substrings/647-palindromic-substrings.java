class Solution {
    public int countSubstrings(String s) {
        
        int res = 0;
        int n = s.length();
        
        for (int i = 0; i<n; i++) {
            int left = i, right = i;
            while (left>=0 && right<=n-1 && s.charAt(left)==s.charAt(right)) {
                res++;
                left--;
                right++;
            }
            left = i; 
            right = i+1;
            while (left>=0 && right<=n-1 && s.charAt(left)==s.charAt(right)) {
                res++;
                left--;
                right++;
            }            
        }
        return res;
    }
    
    
}