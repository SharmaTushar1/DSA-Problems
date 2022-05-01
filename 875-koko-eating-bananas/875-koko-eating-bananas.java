class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for (int pile: piles) end = Math.max(end, pile);
        while (start<end) {
            int mid = start+(end-start)/2;
            if (time(mid, piles, h)>h) start = mid+1;
            else end = mid;
        }
        return end;
    }
    
    public int time(int mid, int[] piles, int h) {
        int count = 0;
        for (int pile: piles) {
            if (count>h) return Integer.MAX_VALUE;
            count+=Math.ceil((double)pile/mid);
        }
        return count;
    }
    
}