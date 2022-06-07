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
                
                if (c == ')' && stack.peek() != '(') {
                    return false;
                }
                
                if (c == ']' && stack.peek() != '[') {
                    return false;
                }
                
                if (c == '}' && stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            }
        }
        
        return stack.peek() == null;
    }
}