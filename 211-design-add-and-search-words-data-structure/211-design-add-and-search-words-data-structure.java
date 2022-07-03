class TrieNode {
    public boolean isWord;
    public TrieNode[] children = new TrieNode[26];
    public TrieNode() {};
}

class WordDictionary {
    private TrieNode root;
    
    public WordDictionary() {
        root = new TrieNode();    
    }
    
    public void addWord(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isWord = true;
    }
    
    public boolean search(String word) {
        return searchHelper(word, root);
    }
    
    public boolean searchHelper(String word, TrieNode parent) {
        TrieNode node = parent;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(c == '.') {
                for(TrieNode child: node.children) {
                    if(child != null && searchHelper(word.substring(i+1, word.length()), child)) {
                        return true;
                    }
                }
                return false;
            }
            node = node.children[c - 'a'];
            if (node == null) {
                return false;
            }
        }
        
        return node.isWord;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */