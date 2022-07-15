class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int target = image[sr][sc];
        
        if (target == color) {
            return image;
        }
        
        image[sr][sc] = color;
        
        // right, down, left, up
        int[] directions = {0, 1, 0, -1, 0};
        
        for (int i = 0; i < 4; i++) {
            int r = sr + directions[i];
            int c = sc + directions[i+1];
            
            if (r >= 0 && r < image.length && c >= 0 && c < image[0].length && image[r][c] == target) {
                floodFill(image, r, c, color);
            }
        }
        
        return image;
    }
}