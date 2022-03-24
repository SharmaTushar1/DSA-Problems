class Solution {
    public int countSubstrings(String s) {
        int res = 0;
        int n = s.length();
        for (int i =0; i<n; i++) {
      res += helper(i, i, 0, s);
      res += helper(i, i+1, 0, s); 
        }
        return res;
    }
    
    public int helper(int left, int right, int res, String s) {
        int n = s.length();
        while (left>=0 && right<=n-1 && s.charAt(left)==s.charAt(right)) {
                res++;
                left--;
                right++;
            }
        return res;
    }    
}