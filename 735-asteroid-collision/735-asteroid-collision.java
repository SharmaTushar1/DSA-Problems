class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> dq = new LinkedList<Integer>();
        for (int asteroid: asteroids) {
            if (asteroid>0) 
                dq.addLast(asteroid);
            else {
                while (!dq.isEmpty() && dq.peekLast()>0 && dq.peekLast()<-asteroid) {
                    dq.pollLast();
                } 
                if (!dq.isEmpty() && dq.peekLast()==-asteroid) {
                    dq.pollLast();
                }
                else if (dq.isEmpty() || dq.peekLast()<0) 
                    dq.addLast(asteroid);
            }
        }
        int[] ans = new int[dq.size()];
        int i = 0;
        while (!dq.isEmpty()) {
            ans[i++] = dq.pollFirst();
        }
        return ans;
    }
}