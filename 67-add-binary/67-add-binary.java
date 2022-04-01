class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        char c1 = '0';
        char c2 = '0';
        int carry = 0;
        StringBuilder s = new StringBuilder();
        while (i>=0 || j>=0 ) {
            if (i<0 || j<0) {
                if (j<0) {c2 = '0'; c1 = a.charAt(i);}
                else if (i<0) {c1 = '0'; c2 = b.charAt(j);}
            } else {
                c1 = a.charAt(i);
                c2 = b.charAt(j);
            }
            // System.out.println(c1+" "+c2);
            if (c1 == '0' && c2 == '0') {
                int add = carry%2;
                s.append(add);
                carry = 0;
            } else if (c1=='0' || c2 == '0') {
                int add = (carry+1)%2;
                s.append(add);
                carry = add==0?1:0;
            } else {
                int add = carry%2;
                s.append(add);
                carry = 1;
            }
            i--;
            j--;
        }
            if (carry!=0) s.append(carry);
        
        return s.reverse().toString();
        
    }
}