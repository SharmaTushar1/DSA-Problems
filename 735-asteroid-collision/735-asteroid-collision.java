class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();
        for (int asteroid: asteroids) {
            if (asteroid>0) st.addLast(asteroid);
            else {
                while (!st.isEmpty() && st.peekLast()>0 && st.peekLast()<-asteroid) st.pollLast();
                if (!st.isEmpty() && st.peekLast() == -asteroid) st.pollLast();
                else if (st.isEmpty() || st.peekLast()<0) st.add(asteroid);
            }
        }
        int[] ans = new int[st.size()];
        int i = 0;
        while (!st.isEmpty()) {
            ans[i++] = st.pollFirst();
        }
        return ans;
    }
}