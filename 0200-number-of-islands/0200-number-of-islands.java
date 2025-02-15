class Solution {

         public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int rows = grid.length, cols = grid[0].length;
        int islandCount = 0;

        // Iterate through the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') { // Found a new island
                    islandCount++;
                    dfs(grid, i, j); // Perform DFS to mark the island
                }
            }
        }
        return islandCount;
    }

    private static void dfs(char[][] grid, int i, int j) {
        int rows = grid.length, cols = grid[0].length;
        
        // Boundary & water check
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0') {
            return;
        }

        // Mark the current land as visited
        grid[i][j] = '0';

        // Visit all 4 adjacent directions
        dfs(grid, i + 1, j); // Down
        dfs(grid, i - 1, j); // Up
        dfs(grid, i, j + 1); // Right
        dfs(grid, i, j - 1); // Left
    }
        
    
}