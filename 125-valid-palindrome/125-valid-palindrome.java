class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char cl = s.charAt(left);
            char cr = s.charAt(right);
            
            //if c1 is not valid then move forward
            if (!Character.isLetterOrDigit(cl)) left++;
            // if c2 is not valid move backward
            else if (!Character.isLetterOrDigit(cr)) right--;
            // otherwise compare
            else{
                if (cl != cr) return false;    
                left++;
                right--;    
            }
        }
        
        
        return true;
    }
}