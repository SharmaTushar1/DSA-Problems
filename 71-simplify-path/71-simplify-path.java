class Solution {
    public String simplifyPath(String path) {
        Deque<String> st = new ArrayDeque<>();
        for (String s: path.split("/")) {
            if (s.equals("..")) st.poll();
            else if (!s.equals(".") && !s.equals("")) st.push(s);
        }
        if (st.size()==0) return "/";
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append("/").append(st.pollLast());
        }
        return sb.toString();
    }
}