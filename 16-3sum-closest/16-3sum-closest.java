class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i=0; i<nums.length; i++) {
            int j=i+1, k=nums.length-1;
            while (j<k) {
                int sum = nums[i]+nums[j]+nums[k];
                if (Math.abs(target-sum)<min) {
                    ans = sum;
                    min = Math.abs(target-sum);
                }
                if (sum<target) {
                    j++;
                } else
                    k--;
            }
        }
        return ans;
    }
}