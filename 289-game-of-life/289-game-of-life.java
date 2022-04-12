class Solution {
    public void gameOfLife(int[][] board) {
        
        int m = board.length;
        int n = board[0].length;
        
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                int nei = checkNeighbors(board, i, j);
                //check for dead
                if (board[i][j] == 1) {
                    if (nei==2 || nei==3) board[i][j] = 3;
                } else if (board[i][j] == 0 && nei==3) {
                    board[i][j] = 2;
                } 
            }
        }
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                if (board[i][j] == 1) board[i][j] = 0;
                else if (board[i][j] == 2) board[i][j] = 1;
                else if (board[i][j] == 3) board[i][j] = 1;
            }
        }
    }
    
    public int checkNeighbors(int[][] board, int i, int j) {
        int nei = 0;
        for (int a = Math.max(i-1, 0); a<=Math.min(i+1, board.length-1); a++) {
            for (int b = Math.max(j-1, 0); b<=Math.min(j+1, board[0].length-1); b++) {
                nei += board[a][b]&1;
            }
        }
        nei-=board[i][j]&1;
        return nei;
    }
    
}