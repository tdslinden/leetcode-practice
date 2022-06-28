class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        int visited[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && visited[i][j] == 0) {
                    dfs(grid, visited, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void dfs (char[][] grid, int[][] visited, int row, int col) {
        visited[row][col] = 1;
        
        // check top
        if (row > 0 && grid[row-1][col] == '1' && visited[row-1][col] == 0) {
            dfs(grid, visited, row-1, col);
        }
        
        // check bottom
        if (row < grid.length - 1 && grid[row+1][col] == '1' && visited[row+1][col] == 0) {
            dfs(grid, visited, row+1, col);
        }
        
        // check right
        if (col < grid[0].length - 1 && grid[row][col+1] == '1' && visited[row][col+1] == 0) {
            dfs(grid, visited, row, col+1);
        }        
        
        // check left
        if (col > 0 && grid[row][col-1] == '1' && visited[row][col-1] == 0) {
            dfs(grid, visited, row, col-1);
        }        
    }
}
