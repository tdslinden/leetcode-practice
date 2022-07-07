class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        
        for c in s:
            if c == ')' or c == '}' or c == ']':
                if len(stack) == 0:
                    return False
                
                popped = stack.pop()
                
                if c == ')' and popped != '(':
                    return False
                
                if c == '}' and popped != '{':
                    return False
                    
                if c == ']' and popped != '[':
                    return False
                
            else:
                stack.append(c)
        
        return len(stack) == 0