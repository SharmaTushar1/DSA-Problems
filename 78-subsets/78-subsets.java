class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList();
        
        function(ans, list, 0, nums);
        
        return ans;
        
        
    }
    
    public void function(List<List<Integer>> ans, List<Integer> list, int start, int[] nums) {
        ans.add(new ArrayList<>(list));
        for (int i = start; i<nums.length; i++) {
            
            list.add(nums[i]);
            function(ans, list, i+1, nums);
            list.remove(list.size()-1);
            
            
        }
        
    }
    
}