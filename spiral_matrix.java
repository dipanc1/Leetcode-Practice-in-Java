import java.util.ArrayList;
import java.util.List;

class Solution78 {
    boolean[][] visited;
    List<Integer> res;

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new ArrayList<>();

        visited = new boolean[matrix.length][matrix[0].length];
        res = new ArrayList<>();
        dfs(0, 0, matrix, false);
        return res;
    }

    public void dfs(int y, int x, int[][] matrix, boolean goingUp) {
        if (y < 0 || x < 0 || y >= matrix.length || x >= matrix[y].length || visited[y][x]) return;
        res.add(matrix[y][x]);
        visited[y][x] = true;

        if (goingUp) {
            dfs(y - 1, x, matrix, true);
        }

        dfs(y, x + 1, matrix, false);
        dfs(y + 1, x, matrix, false);
        dfs(y, x - 1, matrix, false);
        dfs(y - 1, x, matrix, true);
    }
}

public class spiral_matrix {
    public static void main(String[] args) {
        Solution78 s = new Solution78();
        System.out.println(s.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }
}

