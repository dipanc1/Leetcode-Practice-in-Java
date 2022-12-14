import java.util.ArrayList;
import java.util.Stack;

class Solution24 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        boolean[] visited =  new boolean[n];
        Stack<Integer> stack = new Stack<Integer>();

        stack.add(source);
        visited[source] = true;

        while(!stack.isEmpty()){
            int current = stack.pop();
            if (current == destination) return true;

            for (int neighbor : graph[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.add(neighbor);
                }
            }
        }

        return false;
    }

}
public class valid_path {
    public static void main(String[] args) {
        Solution24 s = new Solution24();
        System.out.println(s.validPath(3, new int[][] {{0,1},{1,2},{2,0}}, 0,2));
    }
}
