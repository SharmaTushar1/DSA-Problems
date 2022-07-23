class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='#') {
                if (s1.isEmpty()) {
                    continue;
                } else
                    s1.pop();
            } else {
                s1.add(s.charAt(i));
            }
        }
        for (int i=0; i<t.length(); i++) {
            if (t.charAt(i)=='#') {
                if (s2.isEmpty()) {
                    continue;
                } else
                    s2.pop();
            } else {
                s2.add(t.charAt(i));
            }
        }
        if (s1.size()!=s2.size())
            return false;
        while (!s1.isEmpty() && !s2.isEmpty()) {
            if (s1.pop()!=s2.pop())
                return false;
        }
        return true;
    }
}