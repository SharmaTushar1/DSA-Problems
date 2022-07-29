class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (word.charAt(0)==board[i][j]) {
                    if (dfs(i, j, m, n, board, word, 0))
                        return true;
                }
            }
        }
        return false;
    }
    
    public boolean dfs(int i, int j, int m, int n, char[][] board, String word, int index) {
        if (index>=word.length())
            return true;
        // if (i<0 || j<0 || i>=m || j>=n || word.charAt(index)!=board[i][j])
        //     return false;
        boolean ans = false;
        if (i>=0 && i<m && j>=0 && j<n && board[i][j]==word.charAt(index)) {
            board[i][j]+=100;
            ans = dfs(i+1, j, m, n, board, word, index+1) || dfs(i, j+1, m, n, board, word, index+1) || dfs(i-1, j, m, n, board, word, index+1) || dfs(i, j-1, m, n, board, word, index+1);//left
            board[i][j]-=100;
        }
        return ans;
    }
    
}