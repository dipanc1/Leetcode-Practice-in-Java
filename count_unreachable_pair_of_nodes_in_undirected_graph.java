import java.util.ArrayList;
import java.util.List;

class Solution56 {
    List<List<Integer>> x = new ArrayList<>();

    public long countPairs(int n, int[][] edges) {
        // make graph from here
        for (int i = 0; i < n; i++) {
            x.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            x.get(edge[0]).add(edge[1]);
            x.get(edge[1]).add(edge[0]);
        }
        // till here

        long res = 0, sum = n;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int curr = dfs(i, visited, new int[1]); // to find size of connected component
                sum = sum - curr;
                res += curr * sum;
            }
        }

        return res;
    }

    int dfs(int node, boolean[] visited, int[] count) {
        if (visited[node]) return count[0];
        visited[node] = true;
        count[0]++;
        for (int curr : x.get(node)) {
            dfs(curr, visited, count);
        }
        return count[0];
    }
}

public class count_unreachable_pair_of_nodes_in_undirected_graph {
    public static void main(String[] args) {
        Solution56 s = new Solution56();
        System.out.println(s.countPairs(3, new int[][]{{0, 1}, {0, 2}, {1, 2}}));
    }
}
