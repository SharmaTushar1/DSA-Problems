class Solution {
    public int climbStairs(int n) {
        if (n<=2) return n;
        int num1 = 1;
        int num2 = 2;
        for (int i = 3; i<=n; i++) {
            int cur = num1 + num2;
            num1 = num2;
            num2 = cur;
        }
        return num2;
    }
}