import java.util.LinkedList;
import java.util.Queue;

class PairQ {
    int first;
    int second;

    public PairQ(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution103 {
//    private int n;
//    private int m;

    public void bfs(int ro, int co, int[][] vis, char[][] grid) {
        vis[ro][co] = 1;
        Queue<PairQ> q = new LinkedList<>();
        q.add(new PairQ(ro, co));

        int n = grid.length;
        int m = grid[0].length;

        // Eight directions (right, down, left, up, and four diagonals)
//        int[] delRow = {-1, -1, -1, 0, 1, 1, 1, 0};
//        int[] delCol = {-1, 0, 1, 1, 1, 0, -1, -1};
        // Only four directions (up, down, left, right)
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            for (int i = 0; i < delRow.length; i++) {

//                for (int delCol = -1; delCol <= 1; delCol++) {
                int nRow = row + delRow[i];
                int nCol = col + delCol[i];
                if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && grid[nRow][nCol] == '1' && vis[nRow][nCol] == 0) {
                    vis[nRow][nCol] = 1;
                    q.add(new PairQ(nRow, nCol));
                }
//                }
            }
        }
    }

    public int numIslands(char[][] grid) {
//        int count = 0;
//
//        n = grid.length;
//        if (n == 0) return 0;
//
//        m = grid[0].length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (grid[i][j] == '1') {
//                    DFSMarking(grid, i, j);
//                    ++count;
//                }
//            }
//        }
//
//        return count;


        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        int count = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (vis[row][col] == 0 && grid[row][col] == '1') {
                    count++;
                    bfs(row, col, vis, grid);
                }
            }
        }

        return count;
    }

//    private void DFSMarking(char[][] grid, int i, int j) {
//        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
//        grid[i][j] = '0';
//        DFSMarking(grid, i + 1, j);
//        DFSMarking(grid, i - 1, j);
//        DFSMarking(grid, i, j + 1);
//        DFSMarking(grid, i, j - 1);
//    }
}

public class number_of_islands {
    public static void main(String[] args) {
        Solution103 s = new Solution103();
        System.out.println(s.numIslands(new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        }));
    }
}
