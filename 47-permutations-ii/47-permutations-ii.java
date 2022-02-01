class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        // List<Integer> list = new ArrayList();
        
        perm(ans, nums, 0);
        
        return ans;
        
    }
    
    public void perm(List<List<Integer>> ans, int[] arr, int start) {
        
        if (start == arr.length) {
            List<Integer> list = new ArrayList();
            
            for (int i = 0; i<arr.length; i++) {
                list.add(arr[i]);
            }
            
            ans.add(new ArrayList(list));
            return;
        }
        
            Set<Integer> appeared = new HashSet<>();
        for (int i = start; i<arr.length; i++) {
            
            if (appeared.add(arr[i])) {
                
                
            swap(arr, start, i);
            perm(ans, arr, start+1);
            swap(arr, start, i);
            }
            
            
            
            
        }
        
    }
    
     public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    
}