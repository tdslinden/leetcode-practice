class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        return (collections.Counter(ransomNote) - collections.Counter(magazine)) == {}
