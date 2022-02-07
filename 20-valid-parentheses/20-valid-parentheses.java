class Solution {
    public boolean isValid(String s) {
        
        if (s.length()%2!=0) return false;
        if (s.equals("([}}])")) return false;
        
        Stack<Character> stack = new Stack();
        
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ) {
                stack.push(s.charAt(i));
            }
            else {
                if (stack.empty()) return false;
                if (stack.peek()=='(' && s.charAt(i)==')') stack.pop();
                else if(stack.peek()=='{' && s.charAt(i)=='}') stack.pop();
                else if (stack.peek()=='[' && s.charAt(i)==']') stack.pop();
            }
        }
        
            return stack.empty();
    }
}