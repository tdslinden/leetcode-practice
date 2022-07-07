class Solution {
    public boolean isValid(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ')' || c == ']' || c == '}') {
                if (dq.size() == 0) {
                    return false;
                }
                
                char popped = dq.pop();
                
                if (c == ')' && popped != '(') {
                    return false;
                }
                                
                if (c == ']' && popped != '[') {
                    return false;
                }
                                
                if (c == '}' && popped != '{') {
                    return false;
                }
            } else {
                dq.push(c);
            }
        }
        
        return dq.size() == 0;
    }
}