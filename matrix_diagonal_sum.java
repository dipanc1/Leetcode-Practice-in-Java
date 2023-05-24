class Solution77 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[mat.length - 1 - i][i];
        }

        if (mat.length % 2 == 1) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        return sum;
    }
}

public class matrix_diagonal_sum {
    public static void main(String[] args) {
        Solution77 s = new Solution77();
        System.out.println(s.diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }
}
