class Solution {
    public int divisorSubstrings(int num, int k) {
        int ans = 0;
        int temp = num;
        int len = 0;
        while (temp!=0) {
            len++;
            temp /= 10;
        }
        temp = num;
        while (len>=k && num!=0) {
            int cur = num%((int)Math.pow(10, k));
            if (cur!=0 && temp%cur == 0) 
                ans++;
            num /=10;
            len--;
        }
        return ans;
    }
}