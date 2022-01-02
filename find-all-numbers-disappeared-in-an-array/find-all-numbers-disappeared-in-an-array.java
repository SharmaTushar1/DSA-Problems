class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List <Integer> ls = new ArrayList<Integer>();
        int n = arr.length;
        int j = 0;
        while (j<n) {
            int correct = arr[j]-1;
            if (arr[j]<=n && arr[j] != arr[correct]) {
                int temp = arr[j];
                arr[j] = arr[correct];
                arr[correct] = temp;
            }
            else j++;
        }
        
        System.out.println(Arrays.toString(arr));
        
        // if (arr[0]!=1) ls.add()
        
        for (int i = 0; i<n; i++) {
            if (arr[i]!=i+1) {
                ls.add(i+1);
            };
        }
        
        return ls;
    }
}