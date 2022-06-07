class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            
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