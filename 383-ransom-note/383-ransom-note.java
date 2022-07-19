class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[255];
        
        // store magazine inside map
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            arr[c] = arr[c] + 1;
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            
            if (arr[c] > 0) {
                arr[c] = arr[c] - 1;
            } else {
                return false;
            }
        }
        
        return true;
    }
}