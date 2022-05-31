class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int total = length1 + length2;
        int[] merged = new int[total];
        
        Boolean isEven = !isOdd(length1, length2, total);
        
        return getMedian(nums1, nums2, merged, length1, length2, total, isEven);
    }
    
    public boolean isOdd(int length1, int length2, int total) {
        if (total % 2 == 1) {
            return true;
        }
        return false;
    }
    
    public double getMedian(int[] nums1, int[] nums2, int[] merged, int length1, int length2, int total, Boolean isEven) {
        int left = 0;
        int right = 0;
        int pos = 0;
        int max = total / 2;
        
        while (left < length1 && right < length2 && pos <= max) {
            if (nums1[left] < nums2[right]) {
                merged[pos++] = nums1[left++];
            } else {
                merged[pos++] = nums2[right++];
            }
        }
        
        while (left < length1 && pos <= max) {
            merged[pos++] = nums1[left++];
        }
        
        while (right < length2 && pos <= max) {
            merged[pos++] = nums2[right++];
        }
        
        double median = 0;
        if (isEven) {
            median = (double) (merged[max] + merged[max - 1]) / 2;
        } else {
            median = merged[max];   
        }
        return median;
        
    }
}