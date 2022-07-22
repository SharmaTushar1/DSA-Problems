class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] ans = new int[m+n];
        for (int i = m-1; i>=0; i--) {
            for (int j = n-1; j>=0; j--) {
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int p1 = i+j, p2 = i+j+1;
                //add existing vallue at the non carry place
                int sum = mul+ans[p2];
                //now add the prev values to the carry
                ans[p1] += sum/10;
                //now for the non carry place
                ans[p2] = sum%10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p: ans)
            if (!(p==0 && sb.length()==0))
                sb.append(p);
        return sb.length()==0?"0":sb.toString();
    }
}