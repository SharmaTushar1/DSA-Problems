class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for (int val: nums) end = Math.max(end, val);
        while (start<end) {
            int mid = start+(end-start)/2;
            if (calculate(mid, nums)>threshold) start = mid+1;
            else end = mid;
        }
        return start;
    }
    
    public int calculate(int mid, int[] arr) {
        int total = 0;
        for (int val: arr) total += Math.ceil(val/(float)mid);
        System.out.println(mid+": "+total);
        return total;
    }
    
}