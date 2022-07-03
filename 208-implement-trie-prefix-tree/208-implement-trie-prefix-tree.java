class TrieNode {
    public boolean isWord; 
    public TrieNode[] children = new TrieNode[26];
    public TrieNode() {}
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode current = root;
        
        for (char c : word.toCharArray()) { 
            int pos = c - 97;
            if (current.children[pos] == null) {
                current.children[pos] = new TrieNode();
            }
            current = current.children[pos];
        }
        
        current.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) { 
            int pos = c - 97;
            if (current.children[pos] == null) {
                return false;
            }
            current = current.children[pos];
        }
        return current.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) { 
            int pos = c - 97;
            if (current.children[pos] == null) {
                return false;
            }
            current = current.children[pos];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */