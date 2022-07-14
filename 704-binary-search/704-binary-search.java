class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
    
    public int binarySearch(int[] nums, int low, int high, int target) {
        if (high < low) {
            return -1;
        }
        
        int mid = (high + low) / 2;
        
        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return binarySearch(nums, mid+1, high, target);
        } else {
            return binarySearch(nums, 0, mid-1, target);
        }
    }
}