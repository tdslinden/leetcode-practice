class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (char c : t.toCharArray()) {
            // iterate through the t array
            // check if each letter in String is in Map
            
            int value = map.getOrDefault(c, 0);
            if (value == 0) {
                return false;
            } else {
                map.put(c, --value);
            }
        }
        
        return true;
    }
}