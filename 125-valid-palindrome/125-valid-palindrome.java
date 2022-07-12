class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        
        // remove all non-alphanumeric characters
        String clean = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                clean += Character.toLowerCase(c);
            }
        }    
        
        System.out.println(clean);
        
        for (int f = 0, r = clean.length() - 1; f < r; f++, r--) {
            char fc = clean.charAt(f);
            char rc = clean.charAt(r);
            
            if (fc != rc) {
                return false;
            }
        }
            
        return true;
    }
}