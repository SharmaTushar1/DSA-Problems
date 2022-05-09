class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for (int num: nums) end = Math.max(num, end);
        while (start<end) {
            int mid = start+(end-start)/2;
            if (operationCost(nums, mid)>maxOperations) start = mid+1;
            else end = mid;
        }
        return end;
    }
    
    public int operationCost(int[] nums, int ops) {
        int count = 0;
        for (int num: nums) {
            count += (num-1)/ops;
            // if (count>ops) return count;
        }
        return count;
    }
    
}