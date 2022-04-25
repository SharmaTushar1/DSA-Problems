class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> h = new HashSet<>();
        for (int i = 0; i<9; i++) {
            for (int j = 0; j<9; j++) {
                if (board[i][j]!='.') {
                    if (!h.add(board[i][j] + "not in row" + i) ||
                        !h.add(board[i][j]  + "not in column" + j) ||
                        !h.add(board[i][j] + "not in box" + i/3 + " " + j/3)) return false;
                }
            }
        }
        return true;
    }
}