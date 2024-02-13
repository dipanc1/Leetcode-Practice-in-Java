import java.util.Arrays;
import java.util.HashMap;

class Solution204 {

    public int cherryPickup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][][] memo = new int[71][71][71];
        for (int[][] arr2D : memo) {
            for (int[] arr1D : arr2D) {
                Arrays.fill(arr1D, -1);
            }
        }
        return dfs(0, 0, cols - 1, rows, cols, grid, memo);
    }

    private int dfs(int r, int c1, int c2, int row, int col, int[][] g, int[][][] memo) {
        if (c1 == c2 || Math.min(c1, c2) < 0 || Math.max(c1, c2) == col) return 0;
        if (r == row - 1) return g[r][c1] + g[r][c2];
        if (memo[r][c1][c2] != -1) return memo[r][c1][c2];
        int res = 0;

        for (int c1_d : new int[]{-1, 0, 1}) {
            for (int c2_d : new int[]{-1, 0, 1}) {
                res = Math.max(res, dfs(r + 1, c1 + c1_d, c2 + c2_d, row, col, g, memo));
            }
        }

        memo[r][c1][c2] = res + g[r][c1] + g[r][c2];
        return memo[r][c1][c2];

    }
}

public class cherry_pickup_ii {
    public static void main(String[] args) {
        Solution204 s = new Solution204();
        System.out.println(s.cherryPickup(new int[][]{new int[]{3, 1, 1}, new int[]{2, 5, 1}, new int[]{1, 5, 5}, new int[]{2, 1, 1}}));
    }
}
