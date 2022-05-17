class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        map = {}
        
        for c in magazine:
            map[c] = map.get(c, 0) + 1
        
        for c in ransomNote:
            val = map.get(c, None)
            if not val or val == 0:
                return False
            map[c] -= 1
        
        return True