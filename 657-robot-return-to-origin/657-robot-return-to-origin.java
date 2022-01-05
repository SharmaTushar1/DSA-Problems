class Solution {
    public boolean judgeCircle(String moves) {
        int l = 0, r = 0, d = 0, u = 0;
        for (char c: moves.toCharArray()) {
            if (c=='U') u++;
            else if (c == 'D') d++;
            else if (c == 'R') r++;
            else if (c=='L') l++;
        }
        // System.out.println("l is = "+l+" r is = " + r);
        if (l==r && u==d) return true;
        return false;
    }
}