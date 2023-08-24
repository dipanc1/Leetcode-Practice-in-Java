class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean[][] graph, int m, int n) {
        // Your code here
        int[] color = new int[n];

        if (dfs(graph, n, 0, color, m)) return true;

        return false;
    }

    private boolean dfs(boolean[][] graph, int n, int node, int[] color, int m) {
        if (node == n) return true;

        for (int i = 1; i <= m; i++) {
            if (isSafe(graph, n, node, color, i)) {
                color[node] = i;
                if (dfs(graph, n, node + 1, color, m)) {
                    return true;
                }
                color[node] = 0;
            }
        }
        return false;
    }

    private boolean isSafe(boolean[][] graph, int n, int node, int[] color, int c) {
        for (int i = 0; i < n; i++) {
            if (graph[node][i] && color[i] == c) {
                return false;
            }
        }
        return true;
    }
}

public class m_coloring_problem {
    public static void main(String[] args) {

    }
}
