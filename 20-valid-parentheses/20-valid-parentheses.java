class Solution {
    public boolean isValid(String s) {
        
        if (s.length()%2!=0) return false;
        
        Stack<Character> stack = new Stack();
        
//         if (s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']') return false;
        
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ) {
                stack.push(s.charAt(i));
            }
            else {
                if (stack.empty()) return false;
                if (s.charAt(i)==')') {
                    if (stack.peek()=='(') stack.pop();
                    else return false;
                } 
                else if(s.charAt(i)=='}') {
                    if (stack.peek()=='{') stack.pop();
                    else return false;
                } 
                else if (s.charAt(i)==']') {
                    if (stack.peek()=='[') stack.pop();
                    else return false;
                } 
            }
        }
        
            return stack.empty();
    }
}