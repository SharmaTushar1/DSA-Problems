class Solution {
  //Brute force approach O(n) space
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] copy = new int[n];
        for (int i =0; i<n; i++) {
            copy[i] = nums[i];
        }
        for (int i =0; i<n; i++) {
            nums[i] = copy[copy[i]];
        }   
        
        return nums;
    }
  
  //O(1) space
  
  public int[] buildArray(int[] nums) {
      for (int i =0; i<n; i++) {
          nums[i] = nums[i]+n*(nums[nums[i]]%n);
      }
        
      for (int i=0; i<n; i++) {
          nums[i] = nums[i]/n;
      }  
    return nums;
  }
  
  
}
