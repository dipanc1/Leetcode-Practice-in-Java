
class Solution190 {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int ld = Integer.MAX_VALUE, rd = Integer.MAX_VALUE;

                int mid = matrix[i - 1][j];

                if (j > 0) ld = matrix[i - 1][j - 1];

                if (j < n - 1) rd = matrix[i - 1][j + 1];

                matrix[i][j] = matrix[i][j] + Math.min(Math.min(mid, ld), rd);
            }
        }

        int mini = matrix[n - 1][0];
        for (int i = 1; i < n; i++) {
            mini = Math.min(mini, matrix[n - 1][i]);
        }

        return mini;

    }
}

public class minimum_falling_path_sum {
    public static void main(String[] args) {
        Solution190 s = new Solution190();
        System.out.println(s.minFallingPathSum(new int[][]{new int[]{2, 1, 3}, new int[]{6, 5, 4}, new int[]{7, 8, 9}}));
    }
}
