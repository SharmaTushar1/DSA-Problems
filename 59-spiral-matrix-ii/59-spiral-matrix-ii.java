class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int N = n*n;
        int L = 0, T = 0, R = n-1, B = n-1;
        int val = 1;
        int dir = 0;
        while (L<=R && T<=B) {
            
            //traverse Left
            if (dir == 0) {
                for (int i = L; i <= R; i++) {
                ans[T][i] = val++;
            }
            T++;
            }
            //traverse Down
            else if (dir == 1) {
                for (int i = T; i <= B; i++) {
                ans[i][R] = val++;
            }
            R--;
            }
            //traverse left
            else if (dir == 2) {
                for (int i = R; i>=L; i--) {
                ans[B][i] = val++;
            }
            B--;
            }
            
            else if (dir == 3) {
                for (int i = B; i>=T; i--) {
                ans[i][L] = val++;
            }
            L++;
            }
            
            dir = (dir+1)%4;
            
        }
        return ans;
    }
}