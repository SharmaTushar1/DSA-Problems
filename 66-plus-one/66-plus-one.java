class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (digits[n-1]!=9) {
            digits[n-1]++;
            return digits;
        }
        digits[n-1]=0;
        int carry = 1;
        for (int i = n-2; i>=0; i--) {
            int temp = carry+digits[i];
            digits[i] = (temp)%10;
            carry = temp/10;
            System.out.println(carry);
        }
        if (carry==0)
            return digits;
        int[] ans = new int[n+1];
        ans[0] = 1;
        for (int i =1; i<=n; i++) {
            ans[i] = digits[i-1];
        }
        return ans;
    }
}