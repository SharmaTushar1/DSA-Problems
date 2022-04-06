class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i<nums.length-2; i++) {
            if (nums[i]>0) break;
            if (i>0 && nums[i]==nums[i-1]) continue; //I've to do this atleast once that's why i==i-1 instead of i+1==i
            int start = i+1;
            int end = nums.length-1;
            while (start<end) {
                if (nums[start]+nums[end]+nums[i]>0) end--;
                else if (nums[start]+nums[end]+nums[i]<0) start++;
                else {
                    ans.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    while (start<end && nums[start]==nums[start-1]) start++;
                    while (start<end && nums[end] == nums[end+1]) end--;
                }
            }
        }
        return ans;
    }
}