class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        # only add ( if # open < n
        # only add ) if # closed < open
        
        maxCount = 2*n
        
        def backtrack(openCount, closeCount, builder, res=[]):
            if len(builder) == maxCount:
                res.append(builder)
                return
            
            if openCount < n:
                backtrack(openCount + 1, closeCount, builder + "(")
            
            if closeCount < openCount:
                backtrack(openCount, closeCount + 1, builder + ")")
            
            if openCount == closeCount:
                return res
    
        return backtrack(0, 0, "")