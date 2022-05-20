class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        # only add ( if # open < n
        # only add ) if # closed < open
        
        res = []
        maxCount = 2*n
        
        def backtrack(openCount, closeCount, builder):
            if len(builder) == maxCount:
                res.append(builder)
                return
            
            if openCount < n:
                backtrack(openCount + 1, closeCount, builder + "(")
            
            if closeCount < openCount:
                backtrack(openCount, closeCount + 1, builder + ")")
            
        backtrack(0, 0, "")
        return res