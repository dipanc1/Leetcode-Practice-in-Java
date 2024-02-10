import java.util.HashMap;
import java.util.Map;

class Solution194 {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
//        int row = matrix.length;
//        int col = matrix[0].length;
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 1; j < col; j++) {
//                matrix[i][j] += matrix[i][j - 1];
//            }
//        }
//
//        int count = 0;
//
//        for (int i = 0; i < col; i++) {
//            for (int j = i; j < col; j++) {
//                Map<Integer, Integer> map = new HashMap<>();
//                map.put(0, 1);
//
//                int sum = 0;
//
//                for (int[] ints : matrix) {
//                    sum += ints[j] - (i > 0 ? ints[i - 1] : 0);
//                    count += map.getOrDefault(sum - target, 0);
//                    map.put(sum, map.getOrDefault(sum, 0) + 1);
//                }
//            }
//        }
//
//        return count;

        int row = matrix.length;
        int col = row > 0 ? matrix[0].length : 0;

        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < col; i++) {
            for (int j = i; j < col; j++) {
                map.clear();

                int sum = 0;

                for (int[] m : matrix) {
                    sum += m[j] - (i != 0 ? m[i - 1] : 0);
                    if (sum == target) count++;
                    count += map.getOrDefault(sum - target, 0);

                    map.merge(sum, 1, Integer::sum);
                }
            }
        }

        return count;
    }
}

public class number_of_submatrices_that_sum_to_target {
    public static void main(String[] args) {
        Solution194 s = new Solution194();
        System.out.println(s.numSubmatrixSumTarget(new int[][]{new int[]{0, 1, 0}, new int[]{1, 1, 1}, new int[]{0, 1, 0}}, 0));
    }
}
