import java.util.Arrays;

class Solution270 {
    public int[][] largestLocal(int[][] grid) {
        int N = grid.length;

        int[][] maxLocal = new int[N - 2][N - 2];

        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < N - 2; j++) {
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        maxLocal[i][j] = Math.max(maxLocal[i][j], grid[k][l]);
                    }
                }
            }
        }
        
        
        return maxLocal;
    }
}

public class largest_local_values_in_a_matrix {
    public static void main(String[] args) {
        Solution270 s = new Solution270();
        System.out.println(Arrays.deepToString(s.largestLocal(new int[][]{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}})));
    }
}
