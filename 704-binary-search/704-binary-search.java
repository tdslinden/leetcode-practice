class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length, target);
    }
    
    public int binarySearch(int[] nums, int start, int end, int target) {
        if (start >= end) {
            return -1;
        }
        
        int mid = (start + end) / 2;
        
        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            return binarySearch(nums, start, mid, target);
        } else {
            return binarySearch(nums, mid+1, end, target);
        }
    }
}