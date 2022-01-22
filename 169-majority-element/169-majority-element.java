class Solution {
    public int majorityElement(int[] arr) {
        int count = 0;
        int element = arr[0];
        for (int i = 0; i<arr.length; i++) {
            if (count == 0) {
                element = arr[i];
            } 
            if (element == arr[i]) count++;
            else count--;
        }
        
        return element;
        
    }
}