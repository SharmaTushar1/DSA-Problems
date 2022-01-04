class Solution {
    public int firstMissingPositive(int[] arr) {
        int i = 0; 
        int n = arr.length;
        while (i<n) {
            int correct = arr[i]-1;
            if (correct<n && correct >=0 && (arr[i]!=arr[correct] && arr[i]>=1)) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else i++;
        }
        
        // int min =Integer.MAX_VALUE;
        int min = 1;
        System.out.println(Arrays.toString(arr));
        
        for (int j = 0; j<n; j++) {
            // if (arr[j]>=1 && arr[j]<n) {
                if (arr[j]!=j+1) {
                    return j+1;
                // }
            }
        }
        
//         int temp = min;
        
        for (int f = 0; f<n; f++) {
            if (arr[f]==min) min ++;
        }
        
        return min;
        
        
        
        
        
    }
}