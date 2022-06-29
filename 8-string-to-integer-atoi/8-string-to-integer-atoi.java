class Solution {
    public int myAtoi(String s) {
        //discard white spaces
        s = s.trim();
        //sign checker
        boolean neg = false;
        if (s.length()==0) return 0;
        if (s.charAt(0)=='-') 
            neg = true; 
        else if (s.charAt(0)!='+' && !Character.isDigit(s.charAt(0))) //default neg = false so true
            return 0;
        int i = 0;//index 0 already taken care
        if (!Character.isDigit(s.charAt(i))) i++;
        long ans = 0;
        while (i<s.length() && Character.isDigit(s.charAt(i))) {
            ans=ans*10+s.charAt(i++)-'0';
            // System.out.println(ans);
            if (ans>Integer.MAX_VALUE && neg) return Integer.MIN_VALUE;
            if (ans>Integer.MAX_VALUE && !neg) return Integer.MAX_VALUE;
        }
        if (neg) ans =-ans;
        return (int)ans;
    }
}