class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] directions = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        // want to look for neighbours with this target
        int target = image[sr][sc];
        
        if (target == color) {
            return image;
        }
        
        // set the src with the colour
        image[sr][sc] = color;
        
        for (int i = 0; i < 4; i++) {
            int[] direction = directions[i];
            int r = sr + direction[0];
            int c = sc + direction[1];
            
            if (r >= 0 && r < image.length && c >= 0 && c < image[0].length && image[r][c] == target) {
                floodFill(image, r, c, color);
            } 
        }
        
        return image;
    }
}