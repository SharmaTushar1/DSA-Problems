class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        while (n>0) {
            n-=i;
            i++;
        }
        System.out.println(i);
        if (n<0) i--;
        return i-1;
    }
}