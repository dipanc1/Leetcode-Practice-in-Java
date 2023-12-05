import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class Solution162 {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        // Depth First Search
        return clone(node, new HashMap<>());
    }

    public Node clone(Node node, HashMap<Node, Node> visited) {
        if (visited.containsKey(node)) return visited.get(node);

        Node copy = new Node(node.val);
        visited.put(node, copy);
        for(Node ne : node.neighbors) {
            copy.neighbors.add(clone(ne, visited));
        }

        return copy;
    }
}

public class clone_graph {
    public static void main(String[] args) {
        Solution162 s = new Solution162();
    }
}
