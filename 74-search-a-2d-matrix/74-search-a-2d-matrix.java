class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] arrToSearch = getArr(matrix, target);
        
        if (arrToSearch == null || arrToSearch.length == 0) {
            return false;
        }
        
        int start = 0;
        int end = arrToSearch.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arrToSearch[mid]) {
                return true;
            } else if (target < arrToSearch[mid]) {
                end = mid - 1;
            } else {
                start = mid  + 1;
            } 
        }
        
        return false;
    }
    
    public int[] getArr(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target <= matrix[mid][matrix[mid].length-1] && target >= matrix[mid][0]) {
                return matrix[mid];
            } else if (target < matrix[mid][0]) {
                end = mid - 1;
            } else {
                start = mid  + 1;
            }
        }
        
        return null;
    }
}