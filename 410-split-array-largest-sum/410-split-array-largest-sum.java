class Solution {
    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i<nums.length; i++) {
            start = Math.max(start, nums[i]);//ans for m=n
            end += nums[i];//ans for n=1
        }
        
        while (start<end) {
            
            int mid = start+(end-start)/2;
  int sum = 0;
        int pieces = 1;
        
        for (int n: nums) {
            if (sum + n>mid) {
                pieces++;
                sum = n;
            } else {
                sum+=n;
            }
        }
            if (pieces>m) start = mid+1;
            else end = mid;
            
        }
        
        
        

        return end;
    }
}