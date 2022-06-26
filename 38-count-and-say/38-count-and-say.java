class Solution {
    public String countAndSay(int n) {
        if (n==1) return "1";
        String s = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (i<s.length()-1 && s.charAt(i+1)==s.charAt(i))
                count++;
            else {
                sb.append((char)(count+'0'));
                sb.append(c);
                count=1;
            }
        }
        return sb.toString();
    }
}