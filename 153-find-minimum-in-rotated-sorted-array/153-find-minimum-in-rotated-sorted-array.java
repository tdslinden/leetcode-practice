class Solution {
    public int findMin(int[] nums) {
        int min = 5001; // 5000 is the max value
        
        int start = 0;
        int end = nums.length - 1;
        
        
        if (nums[start] < nums[end]) {
            return nums[0];
        }
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (nums[mid] < min) {
                min = nums[mid];
            }

            if (min > nums[end]) {
                start = mid + 1;
            } else if (min < nums[start]) {
                end = mid - 1;
            } else {
                if (nums[end] < nums[start]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        
        return min;
    }
}