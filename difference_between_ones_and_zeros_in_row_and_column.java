import java.util.Arrays;

class Solution170 {
    public int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[] row = new int[rows];
        int[] col = new int[cols];

        int[][] diff = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    row[i] += grid[i][j];
                    col[j] += grid[i][j];
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diff[i][j] = 2 * (row[i] + col[j]) - rows - cols;
            }
        }
        return diff;

    }
}

public class difference_between_ones_and_zeros_in_row_and_column {
    public static void main(String[] args) {
        Solution170 s = new Solution170();
        System.out.println(Arrays.deepToString(s.onesMinusZeros(new int[][]{new int[]{0, 1, 1}, new int[]{1, 0, 1}, new int[]{0, 0, 1}})));
    }
}
