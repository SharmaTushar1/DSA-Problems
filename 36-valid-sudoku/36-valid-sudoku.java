class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i<9; i++) {
            for (int j = 0; j<9; j++) {
                if (board[i][j]!='.') {
                    if (!set.add(board[i][j] + "was found in row" + i) ||
                    !set.add(board[i][j] + "was found in column" + j) ||
                    !set.add(board[i][j] + "was found in box" + i/3+""+j/3)) return false;
                }
            }
        }
        return true;
    }
}