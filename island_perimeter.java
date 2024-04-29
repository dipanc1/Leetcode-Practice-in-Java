class Solution251 {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) return dfs(i, j, grid, visited);
            }
        }

        return 0;
    }

    private int dfs(int row, int col, int[][] grid, boolean[][] v) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) return 1;

        if (v[row][col]) return 0;
        else {
            v[row][col] = true;
            return dfs(row + 1, col, grid, v) + dfs(row - 1, col, grid, v) + dfs(row, col - 1, grid, v) + dfs(row, col + 1, grid, v);
        }
    }
}

public class island_perimeter {
    public static void main(String[] args) {
        Solution251 s = new Solution251();
        System.out.println(s.islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
    }
}
