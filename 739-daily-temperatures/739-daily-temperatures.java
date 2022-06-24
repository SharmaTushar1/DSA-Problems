class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<temperatures.length; i++) {
            if (stack.isEmpty() || temperatures[i]<=temperatures[stack.peek()]) {
                stack.add(i);
            } else {
                while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]) {
                    ans[stack.peek()] = i-stack.peek();
                    stack.pop();
                }
                stack.add(i);
            }
        }
        return ans;
    }
}