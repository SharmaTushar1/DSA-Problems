class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        
        
        for (int i = 0; i<n; i++) {
            int start = i+1;
            int end = n-1;
            while (start<=end) {
                int mid = start+(end-start)/2;
                if (numbers[mid]==target-numbers[i]) {
                    arr[0] = i+1;
                    arr[1] = mid+1;
                    return arr;
                } else if(numbers[mid] > target-numbers[i]) {
                    end = mid-1;
                } else start = mid+1;
            }
        }
        return arr;
        
        
    }
}