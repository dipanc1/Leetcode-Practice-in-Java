import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution298 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int cols = matrix[0].length;

        HashSet<Integer> row_min = new HashSet<>();

        for (int[] max : matrix) {
            int min = Integer.MAX_VALUE;
            for (int row : max) {
                min = Math.min(row, min);
            }
            row_min.add(min);
        }

        for (int i = 0; i < cols; i++) {
            int cur_max = matrix[0][i];
            for (int[] mat : matrix) {
                cur_max = Math.max(cur_max, mat[i]);
            }
            if (row_min.contains(cur_max)) res.add(cur_max);

        }

        return res;
    }
}

public class lucky_numbers_in_a_matrix {
    public static void main(String[] args) {
        Solution298 s = new Solution298();
        System.out.println(s.luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}));
    }
}
