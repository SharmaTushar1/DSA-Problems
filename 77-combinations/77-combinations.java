class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList();
        
        function(ans, ls, k, n, 1);
        
        return ans;
        
        
    }
    
    public void function(List<List<Integer>> ans, List<Integer> ls, int k, int n, int start) {
        if (k == 0) {
            ans.add(new ArrayList(ls));
            return;
        }
        
        for (int i = start; i<=n; i++) {
            if (ls.contains(i)) continue;
            ls.add(i);
            function(ans, ls, k-1, n, i+1);
            ls.remove(ls.size()-1);
        }
        
    }
}