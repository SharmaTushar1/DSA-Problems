class Solution {
    public int firstMissingPositive(int[] arr) {
        int i = 0; 
        int n = arr.length;
        
        //first sort the array so that the positive elements are in their indices position
        //eg-[3,4,-1,1]
        
        while (i<n) {
            int correct = arr[i]-1;
            if (correct<n && correct >=0 && (arr[i]!=arr[correct] && arr[i]>=1)) { //ignore the elements that are negative or bigger than the length (as they don't have any position in the sorted array)
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else i++;
        }
        
        //eg-[1,-1,3,4]
        
        
        //return the index which is not present
        //eg-[1,-1,3,4] this will return 2 as -1!=j+1(1+1=2) which is the required answer
        
        for (int j = 0; j<n; j++) {
                if (arr[j]!=j+1) {
                    return j+1;
            }
        }
        
        //for arrays like [1,2,3,4] or [3,2,1] (all elements = indices) or so we need to make a min var and increment it till we don't find required index
        //eg-[1,2,3,4]
        
        int min = 1; //least positive number
        
        for (int f = 0; f<n; f++) {
            if (arr[f]==min) min++;
        }
        
        return min; 
    }
}