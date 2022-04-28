class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int currDay = 0; currDay<n; currDay++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[currDay]) {
                int prevDay = stack.pop();
                ans[prevDay] = currDay-prevDay;
            }
            stack.add(currDay);
        }
        return ans;
    }
}