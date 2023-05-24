import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution79 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        dfs(matrix, 0, 0, 1, 'r');
        return matrix;
    }

    public void dfs(int[][] matrix, int i, int j, int cur, char dir) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix.length) return;

        if (matrix[i][j] != 0) return;

        matrix[i][j] = cur;

        if (dir == 'u') {
            dfs(matrix, i - 1, j, cur + 1, 'u');
        }

        dfs(matrix, i, j + 1, cur + 1, 'r');
        dfs(matrix, i + 1, j, cur + 1, 'd');
        dfs(matrix, i, j - 1, cur + 1, 'l');
        dfs(matrix, i - 1, j, cur + 1, 'u');
    }
}

public class spiral_matrix_2 {
    public static void main(String[] args) {
        Solution79 s = new Solution79();
        System.out.println(Arrays.deepToString(s.generateMatrix(3)));
    }
}

