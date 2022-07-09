class TicTacToe {

    private int[][] board;
    private int n;
    
    public TicTacToe(int n) {
        this.n = n;
        board = new int[n][n];
    }
    
    public int move(int row, int col, int player) {
        board[row][col] = player;
        if (checkDiagonal(player, board) || 
            checkRow(player, board) || 
            checkCol(player, board) || 
            checkAntiDiagonal(player, board)) 
            return player;
        //nobody won
        return 0;
    }
    
    public boolean checkDiagonal(int player, int[][] board) {
        int count = 0;
        for (int i = 0; i<n; i++) {
            for (int j= 0; j<n; j++) {
                if (i==j && board[i][j]==player) {
                    count++;
                }
            }
        }
        return count==n;
    }
    
    public boolean checkRow(int player, int[][] board) {
        int count = 0;
        for (int i = 0; i<n; i++) {
            for (int j= 0; j<n; j++) {
                if (i==n-1-j && board[i][j]==player) {
                    count++;
                }
            }
        }
        return count==n;
    }
    
    public boolean checkCol(int player, int[][] board) {
        int count = 0;
        for (int i = 0; i<n; i++) {
            for (int j= 0; j<n; j++) {
                if (board[i][j]==player) {
                    count++;
                }
            }
            if (count == n) return true;
            count = 0;
        }
        return false;
    }
    
    public boolean checkAntiDiagonal(int player, int[][] board) {
        int count = 0;
        for (int i = 0; i<n; i++) {
            for (int j= 0; j<n; j++) {
                if (board[j][i]==player) {
                    count++;
                }
            }
            if (count == n) return true;
            count = 0;
        }
        return false;
    }
    
    
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */