class Solution {
    public int majorityElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
}