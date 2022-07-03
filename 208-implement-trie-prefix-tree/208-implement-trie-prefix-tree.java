class Trie {
    boolean terminates = false;
    Trie[] characters = new Trie[26];
    
    public Trie() {}
    
    public void insert(String word) {
        Trie[] children = this.characters;
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) % 97; // lower case letter indexing
            if(children[index] == null)children[index] = new Trie();
            if(i == word.length() - 1) children[index].terminates = true;
            children = children[index].characters;
        }
    }
    
    public boolean search(String word) {
        Trie[] children = this.characters;
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) % 97;
            if(children[index] == null) return false;
            if(children[index].terminates && i == word.length()-1) return true;
            children = children[index].characters;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        Trie[] children = this.characters;
        for(int i = 0; i < prefix.length(); i++){
            int index = prefix.charAt(i) % 97;
            if(children[index] == null) return false;
            children = children[index].characters;
        }
        return true;
    }
}