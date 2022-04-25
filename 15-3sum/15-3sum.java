class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i<nums.length-2; i++) {
            //remove duplicate values for i
            if (i==0||(i>0 && nums[i-1]!=nums[i])) {
                int j = i+1;
                int k = nums.length-1;
                while (j<k) {
                    List<Integer> list = new ArrayList<>();
                    if (nums[j]+nums[k]+nums[i]>0) k--;
                    else if (nums[j]+nums[k]+nums[i]<0) j++;
                    //given condition
                    else if (i!=j && i!=k && j!=k && nums[i]+nums[j]+nums[k]==0) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        //remove duplicate values for j and k
                        while (j<k && nums[j]==nums[j+1]) j++;
                        while (k>j && nums[k]==nums[k-1]) k--;
                        j++;
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}