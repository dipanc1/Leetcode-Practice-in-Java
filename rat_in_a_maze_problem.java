// User function Template for Java

import java.util.ArrayList;

// m is the given matrix and n is the order of matrix
class Solution122 {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        solveMaze(m, 0, 0, n, "", paths, visited);
        return paths;
    }

    private static void solveMaze(int[][] maze, int row, int col, int n, String path, ArrayList<String> paths, boolean[][] visited) {
        // Base Case
        if (row < 0 || row >= n || col < 0 || col >= n || maze[row][col] == 0 || visited[row][col]) return;

        if (row == n - 1 && col == n - 1) {
            paths.add(path);
            return;
        }

        visited[row][col] = true;

        // move down
        solveMaze(maze, row + 1, col, n, path + 'D', paths, visited);

        // move right
        solveMaze(maze, row, col + 1, n, path + 'R', paths, visited);

        // move up
        solveMaze(maze, row - 1, col, n, path + 'U', paths, visited);

        // move left
        solveMaze(maze, row, col - 1, n, path + 'L', paths, visited);

        visited[row][col] = false; // backtrack and mark it as un visited
    }
}

public class rat_in_a_maze_problem {
    public static void main(String[] args) {
        Solution122 s = new Solution122();
        s.findPath(new int[][]{{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}}, 4);
    }
}

