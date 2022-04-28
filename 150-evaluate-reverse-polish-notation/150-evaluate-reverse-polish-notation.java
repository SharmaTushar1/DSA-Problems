class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) return Integer.parseInt(tokens[0]);
        Stack<String> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i<tokens.length; i++) {
            if (tokens[i].length()>1 || Character.isLetterOrDigit(tokens[i].charAt(0))) {
                stack.add(tokens[i]);
            } else if (stack.size()>=2) {
                if (tokens[i].equals("+")) {
                    int num1 = Integer.parseInt(stack.pop());
                    int num2 = Integer.parseInt(stack.pop());
                    ans = num2+num1;
                    stack.add(Integer.toString(ans));
                } else if (tokens[i].equals("*")) {
                    int num1 = Integer.parseInt(stack.pop());
                    int num2 = Integer.parseInt(stack.pop());
                    ans = num2*num1;
                    stack.add(Integer.toString(ans));
                } else if (tokens[i].equals("/")) {
                    int num1 = Integer.parseInt(stack.pop());
                    int num2 = Integer.parseInt(stack.pop());
                    ans = num2/num1;
                    stack.add(Integer.toString(ans));
                } else if (tokens[i].equals("-")) {
                    int num1 = Integer.parseInt(stack.pop());
                    int num2 = Integer.parseInt(stack.pop());
                    ans = num2-num1;
                    stack.add(Integer.toString(ans));
                }
            }
        }
        return ans;
    }
}