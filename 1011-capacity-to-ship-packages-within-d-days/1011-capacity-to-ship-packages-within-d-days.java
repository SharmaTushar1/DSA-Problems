class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = Integer.MIN_VALUE;
        for (int wt: weights) start = Math.max(wt, start);
        int end = 0;
        for (int wt: weights) end+= wt;
        // System.out.println(start+" "+end);
        while (start<end) {
            int mid = start+(end-start)/2;
            if (daysTaken(mid, weights)>days) start = mid+1;
            else end = mid;
        }
        return end;
    }
    
    public int daysTaken(int capacity, int[] weights) {
        int days = 1;
        int sum = 0;
        for (int i = 0; i<weights.length; i++) {
            sum += weights[i];
            if (sum>capacity) {
                days++;
                sum = 0;
                i--;
            }
        }
        // System.out.println(capacity+" -> "+days);
        return days;
    }
    
}