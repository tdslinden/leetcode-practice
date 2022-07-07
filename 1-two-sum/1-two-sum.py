class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # can't use the same element twice
        
        map = {}
        ans = []
        
        for i in range(len(nums)):
            num = nums[i]
            map[num] = map.get(num, i)
            
            difference = target - num
            
            index = map.get(difference)
            
            if (index != None and index != i):
                ans.append(i)
                ans.append(index)
                return ans
            
        return ans