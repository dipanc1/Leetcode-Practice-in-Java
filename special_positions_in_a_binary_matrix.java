class Solution169 {
    public int numSpecial(int[][] mat) {
        int rows = mat.length;
        int column = mat[0].length;
        int[] rowCount = new int[rows];
        int[] colCount = new int[column];
        int output = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (mat[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (mat[i][j] == 1) {
                    if (rowCount[i] == 1 && colCount[j] == 1) {
                        output++;
                    }
                }
            }
        }

        return output;
    }
}

public class special_positions_in_a_binary_matrix {
    public static void main(String[] args) {
        Solution169 s = new Solution169();
        System.out.println(s.numSpecial(new int[][]{new int[]{1, 0, 0}, new int[]{0, 0, 1}, new int[]{1, 0, 0}}));
    }
}
