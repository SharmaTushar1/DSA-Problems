class Solution {
  public int uniquePaths(int m, int n) {
    int[][] dp = new int[m][n];
    for (int[] d: dp) Arrays.fill(d, 1); //default value
    for (int i=1; i<m; i++) {
      for (int j=1; j<n; j++) {
        dp[i][j] = dp[i-1][j]+dp[i][j-1];
      }
    }
    return dp[m-1][n-1];//-1 because here we used the 0 for 1
  }
}