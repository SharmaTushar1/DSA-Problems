class Solution {
    public int minFlipsMonoIncr(String s) {
        int ones = 0;
        int flips = 0;
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i)=='1') 
                ones++;
            else 
                flips++;
            flips = Math.min(flips, ones);
        }
        return flips;
    }
}
