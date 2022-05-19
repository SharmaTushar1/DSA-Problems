class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Deque<int[]> st = new ArrayDeque<>();
        for (int i = 0; i<s.length(); i++) {
            if (!st.isEmpty() && st.peekLast()[0]==s.charAt(i)) {
                st.peekLast()[1]++;
                if (st.peekLast()[1]==k) 
                    st.pollLast();
            } else {
                st.addLast(new int[]{s.charAt(i), 1});
            }
        }
        while (!st.isEmpty()) {
            for (int i = 0; i<st.peekFirst()[1]; i++) {
                sb.append((char) st.peekFirst()[0]);
            }
            st.pollFirst();
        }
        return sb.toString();
    }
}