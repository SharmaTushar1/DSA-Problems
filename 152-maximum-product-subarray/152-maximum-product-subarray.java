class Solution {
    public int maxProduct(int[] A) {
      int max = 1, min = 1, result = A[0];
        for (int i = 0; i < A.length; i++) {
            //we need to keep track of the minimum value 
            //because multiplying it with the remaining value can give us the maximum value
            int temp = max;
            max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
            min = Math.min(Math.min(temp * A[i], min * A[i]), A[i]);
            result = Math.max(result, max);
        }
        return result;
    }
}