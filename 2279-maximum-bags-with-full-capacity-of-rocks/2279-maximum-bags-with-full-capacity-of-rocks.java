class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] arr = new int[rocks.length];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(arr);
        int count = 0;
        for (int val: arr) {
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