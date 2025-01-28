class Solution {
  public int findMaxFish(int[][] grid) {
    int ans = 0;

    for (int i = 0; i < grid.length; ++i) {
      for (int j = 0; j < grid[0].length; ++j) {
        if (grid[i][j] > 0) {
          // Perform DFS to calculate the total fish in the connected region
          ans = Math.max(ans, dfs(grid, i, j));
        }
      }
    }

    return ans;
  }

  private int dfs(int[][] grid, int i, int j) {
    // Check if the position is out of bounds or already visited
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
      return 0;
    }

    int caughtFish = grid[i][j];  // Catch fish in the current cell
    grid[i][j] = 0;              // Mark the cell as visited by setting it to 0

    // Perform DFS in all four directions
    return caughtFish +
           dfs(grid, i + 1, j) +
           dfs(grid, i - 1, j) +
           dfs(grid, i, j + 1) +
           dfs(grid, i, j - 1);
  }
}
