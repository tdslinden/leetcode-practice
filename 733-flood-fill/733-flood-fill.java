class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image.length == 0 || image == null) {
            return null;
        }
            
        int oldColor = image[sr][sc];
        
        if (oldColor != color) {
            dfs(image, sr, sc, color, oldColor);
        }
        
        return image;
    }
    
    public void dfs(int[][] image, int row, int col, int color, int oldColor) {
        if (image[row][col] == oldColor) {
            image[row][col] = color;
            if (row > 0) {
                dfs(image, row-1, col, color, oldColor);
            }

            if (col > 0) {
                dfs(image, row, col-1, color, oldColor);
            }

            if (col < image[0].length - 1) {
                dfs(image, row, col+1, color, oldColor);
            }

            if (row < image.length - 1) {
                dfs(image, row+1, col, color, oldColor);
            }   
        }
    }
}