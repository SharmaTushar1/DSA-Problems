class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        
        Arrays.sort(arr);
        
        List<List<Integer>> ls = new ArrayList<>();
        
        for (int i = 0; i<arr.length-2; i++) {
            if (i == 0 || (i>0 && arr[i-1]!=arr[i])) {
            int start = i+1;
            int end = arr.length-1;
                
            int sum = 0-arr[i];
            
            
            while (start<end) {
                // List<Integer> list = new ArrayList();
                // int sum = ;
                if (arr[start] + arr[end] == sum) {
                    ls.add(Arrays.asList(arr[i], arr[start], arr[end]));
                    
                    while (start<end && arr[start] == arr[start+1]) start++;
                    while (start<end && arr[end] == arr[end-1]) end--;
                    
                    start++;
                    end--;
                } else if (arr[start] + arr[end] < sum) {
                    start++;
                } else end--;
                // if (list.size()!=0) ls.add(list);
            }
            }
        }
        
        return ls;
    }
    
    
}