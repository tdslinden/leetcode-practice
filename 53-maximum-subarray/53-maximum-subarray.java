class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int left = 0, right = 0; right < nums.length; right++) {
            sum += nums[right];
            
            if (sum < nums[right]) {
                left = right;
                sum = nums[right];
            }
            
            max = Math.max(max, sum);
        }
        
        return max;
    }
}