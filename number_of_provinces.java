import java.util.ArrayList;

class Solution309 {

    public void dfs(int node, ArrayList<ArrayList<Integer>> adjList, int[] vis) {
        vis[node] = 1;
        for (Integer it : adjList.get(node)) {
            if (vis[it] == 0) {
                dfs(it, adjList, vis);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        // create an adjacency list
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // adjacency matrix to list
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }

        int count = 0;
        int[] vis = new int[n];
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                count++;
                dfs(i, adjList, vis);
            }
        }


        return count;

    }
}


public class number_of_provinces {
    public static void main(String[] args) {
        Solution309 s = new Solution309();
        System.out.println(s.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
    }
}
