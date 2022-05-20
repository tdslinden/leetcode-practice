class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        # only add ( if # open < n
        # only add ) if # closed < open
        
        stack = []
        res = []
        
        def backtrack(openCount, closeCount):
            if openCount == closeCount == n:
                res.append("".join(stack))
                return
            
            if openCount < n:
                stack.append("(")
                backtrack(openCount + 1, closeCount)
                stack.pop()
            
            if closeCount < openCount:
                stack.append(")")
                backtrack(openCount, closeCount + 1)
                stack.pop()
            
        backtrack(0,0)
        return res