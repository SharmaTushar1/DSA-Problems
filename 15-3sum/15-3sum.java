class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    //sort the array
    Arrays.sort(nums);
    List<List<Integer>> ans = new ArrayList<>();
    for (int i = 0; i<nums.length-2; i++) {
      //check for duplicate values
      if (i!=0 && nums[i]==nums[i-1])
        continue;
      int j = i+1, k=nums.length-1;
      while (j<k) {
        int sum = nums[i]+nums[j]+nums[k];
        if (sum<0) 
          j++;
        else if (sum>0)
          k--;
        else {
          ans.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
          while (j<k && nums[j]==nums[j-1])
                  j++;
        }
      }
    }
    return ans;
  }
}