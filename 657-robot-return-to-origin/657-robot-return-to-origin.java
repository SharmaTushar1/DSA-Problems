class Solution {
    public boolean judgeCircle(String moves) {
        int l = 0, r = 0, d = 0, u = 0;
        
            for (char c: moves.toCharArray()) {
                switch (c) {
                    case 'U' -> u++;
                    case 'D' -> d++;
                    case 'R' -> r++;
                    case 'L' -> l++;
                }
            }
        // System.out.println("l is = "+l+" r is = " + r);
        if (l==r && u==d) return true;
        return false;
    }
}