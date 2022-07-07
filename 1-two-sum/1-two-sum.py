class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # can't use the same element twice
        
        map = {}
        ans = []
        
        for i in range(len(nums)):
            num = nums[i]
            map[num] = map.get(num, i)
            
            difference = target - num
            
            if (map.get(difference) != None and map.get(difference) != i):
                ans.append(i)
                ans.append(map.get(difference))
                return ans
            
        return ans