class Solution158 {
    public boolean searchMatrix(int[][] matrix, int target) {


        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == target) return true;
            }
        }

        return false;
    }
}

public class search_a_2d_matrix {
    public static void main(String[] args) {
        Solution158 s = new Solution158();
        System.out.println(s.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));
    }
}
