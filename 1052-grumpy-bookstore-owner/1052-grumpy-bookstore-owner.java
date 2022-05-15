class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        for (int i = 0; i<customers.length; i++) {
            if (grumpy[i]==0) 
                satisfied += customers[i];
        }
        int start = 0;
        int end = 0;
        //unsatisfied custoemers window
        int maxUnsatisfied = Integer.MIN_VALUE;
        int cur = 0;
        while (end<minutes) {
            if (grumpy[end] == 1) {
                cur += customers[end];
            }
            end++;
        }
        maxUnsatisfied = Math.max(maxUnsatisfied, cur);
        for (; end<customers.length; end++) {
            if (grumpy[end] == 1) 
                cur += customers[end];
            if (grumpy[start] == 1) 
                cur -= customers[start];
            maxUnsatisfied = Math.max(maxUnsatisfied, cur);
            start++;
        }
        return maxUnsatisfied+satisfied;
    }
}