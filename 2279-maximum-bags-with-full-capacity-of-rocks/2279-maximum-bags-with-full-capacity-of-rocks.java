class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for (int i = 0; i<rocks.length; i++) {
            rocks[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(rocks);
        int count = 0;
        for (int val: rocks) {
            if (val == 0) {
                count++;
                continue;
            };
            if (val>additionalRocks) break;
            if (val<=additionalRocks){
                additionalRocks -= val;
                count++;
            }
        }
        return count;
    }
}