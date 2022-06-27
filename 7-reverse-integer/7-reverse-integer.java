class Solution {
    public int reverse(int x) {
        int rev = 0;
        System.out.println(Integer.MIN_VALUE);
        while (x!=0) {
            int val = x%10;
            if ((rev>Integer.MAX_VALUE/10) || (rev==Integer.MAX_VALUE/10 && val>7))
                return 0;
            if ((rev<Integer.MIN_VALUE/10) || (rev==Integer.MIN_VALUE/10 && val<-8)) 
                return 0;
            rev = rev*10 + val;
            x/=10;
        }
        return rev;
    }
}