class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> op = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(op, sb, n, 0, 0);
        return op;
    }
    
    public void helper(List<String> op, StringBuilder sb, int n, int open, int close) {
        if (sb.length()==n*2) {
            op.add(sb.toString());
            return;
        }
        if (close<open) {
            sb.append(")");
            helper(op, sb, n, open, close+1);
            sb.deleteCharAt(sb.length()-1);
        }
        if (open<n) {
            sb.append("(");
            helper(op, sb, n, open+1, close);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
    //n=3 -> Length will be n*2
    /*
    the number of closing parentheses will be lesser than the number of opening parentheses
    the number of opening parentheses will be lesser than n
    I can have a variables open and close.
    
             *
                  (
          ((             ()
     (((      (()        ()(  
((()      (())  (()(
          
    */
    //((()))
}