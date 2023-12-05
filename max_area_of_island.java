import java.util.HashSet;

class Solution163 {
    private int m;
    private int n;
    private int currentArea;

    public int maxAreaOfIsland(int[][] grid) {
        int largestArea = 0;
        n = grid.length;
        if (n == 0) return 0;
        m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    currentArea = 0;
                    dfs(grid, i, j, new HashSet<Integer>());
                    largestArea = Math.max(currentArea, largestArea);
                }
            }
        }

        return largestArea;
    }

    public void dfs(int[][] grid, int i, int j, HashSet<Integer> visited) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != 1 || visited.contains(grid[i][j])) return;

        grid[i][j] = 0;
        currentArea++;

        visited.add(grid[i][j]);

        dfs(grid, i + 1, j, visited);
        dfs(grid, i - 1, j, visited);
        dfs(grid, i, j + 1, visited);
        dfs(grid, i, j - 1, visited);

    }
}

public class max_area_of_island {
    public static void main(String[] args) {
        Solution163 s = new Solution163();
    }
}
