class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.peek() == null) {
                    return false;
                }
                
                char closing = stack.pop();
                
                if (c == ')' && closing != '(') {
                    return false;
                }
                
                if (c == ']' && closing != '[') {
                    return false;
                }
                
                if (c == '}' && closing != '{') {
                    return false;
                }
            }
        }
        
        return stack.peek() == null;
    }
}