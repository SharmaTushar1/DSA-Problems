class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        helper(new StringBuilder(), 0, 0, n, ans);
        return ans;
    }
    
    public void helper(StringBuilder sb, int close, int open, int n, List<String> list) {
        if (sb.length() == n*2) {
            list.add(sb.toString());
            return;
        }
        if (close<open) {
            sb.append(")");
            helper(sb, close+1, open, n, list);
            sb.deleteCharAt(sb.length()-1);
        }
        if (open<n) {
            sb.append("(");
            helper(sb, close, open+1, n, list);
            sb.deleteCharAt(sb.length()-1);
        } 
    }
    
}