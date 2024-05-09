import java.util.List;
import java.util.Map;

class Solution266 {
    Integer[][] memo;

    public int minimumTotal(List<List<Integer>> triangle) {
//        int len = triangle.size();
//        Integer[][] dp_array = new Integer[len][len];
//
//        dp_array[0][0] = triangle.get(0).get(0);
//
//        for (int i = 1; i < len; i++) {
//            for (int j = 0; j <= i; j++) {
//                if (j == 0) dp_array[i][0] = triangle.get(i).get(0) + dp_array[i - 1][0];
//                else if (j == i) dp_array[i][i] = triangle.get(i).get(i) + dp_array[i - 1][i - 1];
//                else dp_array[i][j] = triangle.get(i).get(j) + Math.min(dp_array[i - 1][j], dp_array[i - 1][j - 1]);
//            }
//        }
//
//        int minPath = Integer.MAX_VALUE;
//        for (int i = 0; i < len; i++) {
//            minPath = Math.min(minPath, dp_array[len - 1][i]);
//        }
//
//        return minPath;

        int len = triangle.size();
        memo = new Integer[len][len];
        return findMin(triangle, 0, 0, len);
    }

    private int findMin(List<List<Integer>> t, int row, int col, int len) {
        if (row == len - 1) return t.get(row).get(col);
        if (memo[row][col] != null) return memo[row][col];

        int down = t.get(row).get(col) + findMin(t, row + 1, col, len);
        int downPlusOne = t.get(row).get(col) + findMin(t, row + 1, col + 1, len);

        return memo[row][col] = Math.min(down, downPlusOne);
    }
}


public class triangle {
    public static void main(String[] args) {
        Solution266 s = new Solution266();
        System.out.println(s.minimumTotal(List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3))));
    }
}
