class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr.add(matrix[i][j]);
            }
        }
        
        Collections.sort(arr);
        
        int count =  1;
        for (Integer num : arr) {
            if (count == k) {
                return num;
            }
            
            count++;
        }
            
        return -1;
    }
}