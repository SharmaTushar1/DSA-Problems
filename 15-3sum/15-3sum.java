class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length<3) return list;
        Arrays.sort(nums);
        for (int i = 0; i<nums.length-2; i++) {
            if (i==0 || nums[i]!=nums[i-1]) {
                int j = i+1;
                int k = nums.length-1;
                while (j<k) {
                    int sum = nums[i]+nums[j]+nums[k];
                    if (sum<0) j++;
                    else if (sum>0) k--;
                    else if (sum == 0) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j<k && nums[j+1]==nums[j]) j++;
                        while (k>j && nums[k-1]==nums[k]) k--;
                        j++;
                        k--;
                    }
                }
            }
        }
        return list;
    }
}