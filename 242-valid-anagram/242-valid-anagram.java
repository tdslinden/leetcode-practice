class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] arr = new int[256];
        
        for (char c : s.toCharArray()) {
            arr[c] = arr[c] + 1;
        }
        
        for (char c : t.toCharArray()) {
            // iterate through the t array
            // check if each letter in String is in Map
            
            int value = arr[c];
            if (value <= 0) {
                return false;
            } else {
               arr[c]--;
            }
        }
        
        return true;
    }
}