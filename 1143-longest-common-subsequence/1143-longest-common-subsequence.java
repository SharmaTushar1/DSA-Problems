class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] memo = new int[text1.length()][text2.length()];
        for (int[] arr: memo) 
            Arrays.fill(arr, -1);
        return helper(text1, text2, 0, 0, memo);
    }
    
    public int helper(String text1, String text2, int i, int j, int[][] memo) {
        if (i==text1.length() || j==text2.length())
            return 0;
        if (memo[i][j]!=-1)
            return memo[i][j];
        if (text1.charAt(i)==text2.charAt(j)) { 
            memo[i][j] = 1+helper(text1, text2, i+1, j+1, memo);
            return memo[i][j];
        }
        else {
            memo[i][j] = Math.max(helper(text1, text2, i+1, j, memo), helper(text1, text2, i, j+1, memo));
            return memo[i][j];
        }
    }
    
}