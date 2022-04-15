class Solution {
    public boolean isToeplitzMatrix(int[][] arr) {
        int m = arr.length; //rows
        int n = arr[0].length; //cols
    
        for (int i = 0; i<m-1; i++) {
          for (int j = 0; j<n-1; j++) {
            if (arr[i][j] != arr[i+1][j+1])  return false;
          }
        }

        return true;
    }
}