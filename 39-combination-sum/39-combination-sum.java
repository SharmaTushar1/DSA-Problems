class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> ls = new ArrayList<Integer>();
        
        comb(candidates, target, ans, ls, 0);
        
        return ans;
        
    }
    
    public void comb(int[] candidates, int target, List<List<Integer>> ans, List<Integer> ls, int index) {
        
        if (target == 0) {
            ans.add(new ArrayList(ls));
        }
        else if (target<0) return;
        
        else {
            for (int i = index; i<candidates.length; i++) {
                
                ls.add(candidates[i]);
                comb(candidates, target-candidates[i], ans, ls, i);
                ls.remove(ls.get(ls.size()-1));
                
        }
        
        
    }
    
}
}