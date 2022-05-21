class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        res = []
        
        def backtrack(start, builder):
            if len(builder) == k:
                res.append(builder.copy())
                return
                    
            for i in range(start, n + 1):
                builder.append(i)
                backtrack(i + 1, builder)
                builder.pop()
        
        backtrack(1, [])
        return res
        
        