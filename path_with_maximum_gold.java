
import java.util.HashSet;

class Solution273 {
    int[] roww = {1, -1, 0, 0};
    int[] coll = {0, 0, -1, 1};
    int maxGold = 0;

    public int checkIfAllZeroes(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) count += grid[i][j];
                else return 0;
            }
        }
        return count;
    }

    public void backTrack(int[][] grid, int r, int c, int count) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) return;

        if (grid[r][c] != 0) {
            int curr = grid[r][c];
            grid[r][c] = 0;
            count += curr;
            maxGold = Math.max(maxGold, count);

            for (int i = 0; i < 4; i++) {
                int newR = r + roww[i];
                int newC = c + coll[i];
                backTrack(grid, newR, newC, count);
            }

            grid[r][c] = curr;
        }
    }

    public int getMaximumGold(int[][] grid) {
        int count = checkIfAllZeroes(grid);
        if (count != 0) return count;

        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != 0) backTrack(grid, i, j, 0);
            }
        }

        return maxGold;
    }

}


public class path_with_maximum_gold {
    public static void main(String[] args) {
        Solution273 s = new Solution273();
        System.out.println(s.getMaximumGold(new int[][]{{0, 6, 0}, {5, 8, 7}, {0, 9, 0}}));
    }
}
