class Solution61 {

    public int numEnclaves(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 || i == grid.length - 1 || j == 0 || j == grid[0].length - 1) {
                    dfs(grid, i, j);
                }

            }
        }

        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {

                if (ints[j] == 1) {

                    ans++;
                }
            }
        }
        return ans;
    }

    public void dfs(int[][] grid, int i, int j){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return;

        grid[i][j] = 0;

        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);

    }
}

public class number_of_enclaves {
    public static void main(String[] args) {
        Solution61 s = new Solution61();
        System.out.println(s.numEnclaves(new int[][] {{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}));
    }
}
