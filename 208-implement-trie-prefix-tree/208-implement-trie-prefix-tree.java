// This is a new thing. Try writing this code with pen and paper and dry run some examples.
//Do some problems and soon this will start making sense.
//Good trie problems: Add and Search Word - Data structure design, Word Search II

class Trie {
    
    class TrieNode {
        private TrieNode[] links;
        private final int R = 26;
        private boolean isEnd;
        
        public TrieNode() {
            links = new TrieNode[R];
        }
        
        public boolean containsKey(char ch) {
            return links[ch-'a'] != null;
        }
        
        public TrieNode get(char ch) {
            return links[ch-'a'];
        }
        
        public void put(char ch, TrieNode node) {
            links[ch-'a'] = node;
        }
        
        public void setEnd() {
            isEnd = true;
        }
        
        public boolean isEnd() {
            return isEnd;
        }
        
    }
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        //basically we're going to do traversal as we do in trees/linkedlists
        for (int i = 0; i<word.length(); i++) {
            char cur = word.charAt(i);
            if (!node.containsKey(cur))
                node.put(cur, new TrieNode());
            node = node.get(cur); // just like node = node.next in linkedlists
        }
        //set the end word to the end
        node.setEnd();
    }
    
    public TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (int i = 0; i<word.length(); i++) {
            char cur = word.charAt(i);
            if (node.containsKey(cur))
                node = node.get(cur);
            else
                return null;
        }
        return node;
    }
    
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node!=null && node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node!=null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */