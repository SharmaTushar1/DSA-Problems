import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        // 
        
        List<Integer> list = new ArrayList();
        
        function(ans, list, nums);
        
        return ans;
        
        
    }
    
    public void function(List<List<Integer>> ans, List<Integer> list, int[] nums) {
        
        if (list.size() == nums.length) {
            ans.add(new ArrayList(list));
            return;
        }
        
        for (int i = 0; i<nums.length; i++) {
            
            if (list.contains(nums[i])) continue;
            list.add(nums[i]);
            function(ans, list, nums);
            list.remove(list.size() - 1);
            
        }
        
    }
    
//     public void swap(int[] arr, int a, int b) {
//         int temp = arr[a];
//         arr[a] = arr[b];
//         arr[b] = temp;
//     }
    
}