//Link - https://leetcode.com/problems/shuffle-the-array/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        
        for (int i =0; i<n; i++) {
            ans[2*i] = nums[i];//Even places have values like nums[0],nums[1] ... nums[n-1]
            ans[2*i+1] = nums[n+i];//Odd places have values like nums[n], nums[n+1]...nums[2n-1]
        }
        
        return ans;
    }
}
