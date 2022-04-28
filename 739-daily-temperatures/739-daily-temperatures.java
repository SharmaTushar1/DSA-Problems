class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for (int i = 0; i<temperatures.length-1; i++) {
            int count = 1;
            for (int j = i+1; j<temperatures.length; j++) {
                if (temperatures[j]>temperatures[i]) {
                    ans[i] = count;
                    break;
                }
                count++;
            }
        }
        return ans;
    }
}