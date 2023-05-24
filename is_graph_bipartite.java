import java.util.List;

class Solution82 {
    public boolean isBipartite(int[][] graph) {
        // union find approach
        UnionFind unionFind = new UnionFind(graph.length);

        for (int i = 0; i < graph.length; i++) {
            int[] adjs = graph[i];

            for (int j = 0; j < adjs.length; j++) {
                if (unionFind.find(i) == unionFind.find(adjs[j])) return false;
                unionFind.union(adjs[0], adjs[j]);
            }
        }
        return true;
    }

    class UnionFind {
        int[] parent;

        UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int find(int i) {
            if (parent[i] == i) {
                return parent[i];
            }
            parent[i] = find(parent[i]);
            return parent[i];
        }

        void union(int i, int j) {
            int parentI = find(i);
            int parentJ = find(j);
            if (parentI != parentJ) {
                parent[parentI] = parentJ;
            }
        }
    }

//        int n = graph.length;
//        int[] colors = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            if (colors[i] == 0 && !validColor(graph, colors, 1, i)) {
//                return false;
//            }
//        }
//
//        return true;
//
//    public boolean validColor(int[][] graph, int[] colors, int color, int node) {
//        if (colors[node] != 0) {
//            return colors[node] == color;
//        }
//
//        colors[node] = color;
//        for (int next : graph[node]) {
//            if (!validColor(graph, colors, -color, next)) return false;
//        }
//        return true;
//    }
}

public class is_graph_bipartite {
    public static void main(String[] args) {
        Solution82 s = new Solution82();
        System.out.println(s.isBipartite(new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}}));
    }
}
