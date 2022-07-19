/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 1) {
            return n;
        }
        
        return findBadVersion(1, n, -1);
    }
    
    public int findBadVersion(int low, int high, int bad) {
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (isBadVersion(mid)) {
                high = mid - 1;
                bad = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return bad;
    }
}