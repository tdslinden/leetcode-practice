class Solution {
    int[] DIR = new int[]{0, 1, 0, -1, 0};
    
    public int[][] updateMatrix(int[][] mat) {
        int rowSize = mat.length, colSize = mat[0].length; // The distance of cells is up to (M+N)
        Queue<int[]> q = new ArrayDeque<>();
        
        // traverse through grid to find 0's and add to queue
        for (int r = 0; r < rowSize; ++r)
            for (int c = 0; c < colSize; ++c)
                if (mat[r][c] == 0) q.offer(new int[]{r, c});
                else mat[r][c] = -1; // marked as not processed yet!

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0], c = curr[1];
            for (int i = 0; i < 4; ++i) {
                int nr = r + DIR[i], nc = c + DIR[i+1];
                
                // if skips iteration where nr and nc meets any of these conditions
                if (nr < 0 || nr == rowSize || nc < 0 || nc == colSize || mat[nr][nc] != -1) continue;
                
                mat[nr][nc] = mat[r][c] + 1;
                
                // want to check neighbours of neighbour
                q.offer(new int[]{nr, nc});
            }
        }
        return mat;
    }
}